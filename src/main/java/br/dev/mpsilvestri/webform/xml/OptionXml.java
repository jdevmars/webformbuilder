package br.dev.mpsilvestri.webform.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class OptionXml {
    @JacksonXmlProperty(localName = "Value")
    private String value;
    @JacksonXmlProperty(localName = "FriendlyName")
    private String friendlyName;

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public String getFriendlyName() { return friendlyName; }
    public void setFriendlyName(String friendlyName) { this.friendlyName = friendlyName; }
}
