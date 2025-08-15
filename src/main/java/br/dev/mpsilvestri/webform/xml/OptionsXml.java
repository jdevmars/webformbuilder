package br.dev.mpsilvestri.webform.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class OptionsXml {
    @JacksonXmlProperty(localName = "Option")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OptionXml> option;

    public List<OptionXml> getOption() { return option; }
    public void setOption(List<OptionXml> option) { this.option = option; }
}
