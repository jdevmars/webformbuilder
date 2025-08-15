package br.dev.mpsilvestri.webform.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class FieldsXml {
    @JacksonXmlProperty(localName = "Field")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<FieldXml> field;

    public List<FieldXml> getField() { return field; }
    public void setField(List<FieldXml> field) { this.field = field; }
}
