package br.dev.mpsilvestri.webform.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.dev.mpsilvestri.webform.dto.FieldOptionDto;
import br.dev.mpsilvestri.webform.dto.VisibleFieldDto;
import br.dev.mpsilvestri.webform.xml.ApiResponseXml;
import br.dev.mpsilvestri.webform.xml.FieldXml;
import br.dev.mpsilvestri.webform.xml.OptionXml;

@Service
public class FieldsService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final XmlMapper xmlMapper = new XmlMapper();

    public List<VisibleFieldDto> fetchVisibleFields(String serverNumber, String apiKey) {
        String url = "https://api" + serverNumber + ".esv2.com/v2/Api/Fields?apiKey=" + apiKey;
        try {
            ResponseEntity<String> resp = restTemplate.getForEntity(url, String.class);
            String xml = Objects.requireNonNull(resp.getBody(), "Empty XML response");

            ApiResponseXml root = xmlMapper.readValue(xml, ApiResponseXml.class);
            if (root == null || root.getData() == null || root.getData().getFields() == null || root.getData().getFields().getField() == null)
                return Collections.emptyList();

            List<VisibleFieldDto> out = new ArrayList<>();
            for (FieldXml f : root.getData().getFields().getField()) {
                if (Boolean.TRUE.equals(f.getVisible())) {
                    VisibleFieldDto d = new VisibleFieldDto();
                    d.setId(f.getId());
                    d.setName(f.getName());
                    d.setFriendlyName(f.getFriendlyName());
                    d.setType(f.getType());
                    d.setDefaultValue(f.getDefaultValue());

                    if (f.getOptions() != null && f.getOptions().getOption() != null) {
                        List<FieldOptionDto> opts = new ArrayList<>();
                        for (OptionXml o : f.getOptions().getOption()) {
                            opts.add(new FieldOptionDto(o.getValue(), o.getFriendlyName()));
                        }
                        d.setOptions(opts);
                    }
                    out.add(d);
                }
            }
            return out;
        } catch (RuntimeException e) {
            throw new RuntimeException("Failed to fetch/parse ExpertSender fields: " + e.getMessage(), e);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error: " + e.getMessage(), e);
        }
    }
}
