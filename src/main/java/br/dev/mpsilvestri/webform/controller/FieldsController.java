package br.dev.mpsilvestri.webform.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.mpsilvestri.webform.dto.VisibleFieldDto;
import br.dev.mpsilvestri.webform.dto.VisibleFieldsRequest;
import br.dev.mpsilvestri.webform.service.FieldsService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/fields")
public class FieldsController {
    private final FieldsService fieldsService;
    public FieldsController(FieldsService fieldsService) { this.fieldsService = fieldsService; }

    @PostMapping(value = "/visible", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VisibleFieldDto> getVisibleFields(@Valid @RequestBody VisibleFieldsRequest req) {
        return fieldsService.fetchVisibleFields(req.getServerNumber(), req.getApiKey());
    }
    
    @GetMapping("/ping")
    public String ping() { return "ok"; }
}
