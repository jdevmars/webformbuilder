package br.dev.mpsilvestri.webform.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldXml {
    @JacksonXmlProperty(localName = "Id")
    private Integer id;
    @JacksonXmlProperty(localName = "Name")
    private String name;
    @JacksonXmlProperty(localName = "FriendlyName")
    private String friendlyName;
    @JacksonXmlProperty(localName = "Type")
    private String type;
    @JacksonXmlProperty(localName = "DefaultValue")
    private String defaultValue; // capture raw text if present
    @JacksonXmlProperty(localName = "Visible")
    private Boolean visible;
    @JacksonXmlProperty(localName = "Required")   // <— add this
    private Boolean required;
    @JacksonXmlProperty(localName = "Options")
    private OptionsXml options;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFriendlyName() { return friendlyName; }
    public void setFriendlyName(String friendlyName) { this.friendlyName = friendlyName; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getDefaultValue() { return defaultValue; }
    public void setDefaultValue(String defaultValue) { this.defaultValue = defaultValue; }
    public Boolean getVisible() { return visible; }
    public void setVisible(Boolean visible) { this.visible = visible; }
    public OptionsXml getOptions() { return options; }
    public void setOptions(OptionsXml options) { this.options = options; }
}
