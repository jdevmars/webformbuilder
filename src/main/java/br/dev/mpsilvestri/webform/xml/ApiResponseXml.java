package br.dev.mpsilvestri.webform.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ApiResponseXml {
    @JacksonXmlProperty(localName = "Data")
    private DataXml data;
    public DataXml getData() { return data; }
    public void setData(DataXml data) { this.data = data; }
}
