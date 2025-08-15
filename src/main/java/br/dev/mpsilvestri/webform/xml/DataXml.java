package br.dev.mpsilvestri.webform.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DataXml {
    @JacksonXmlProperty(localName = "Fields")
    private FieldsXml fields;
    public FieldsXml getFields() { return fields; }
    public void setFields(FieldsXml fields) { this.fields = fields; }
}
