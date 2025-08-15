package br.dev.mpsilvestri.webform.dto;

import java.util.List;

public class VisibleFieldDto {
    private Integer id;
    private String name;
    private String friendlyName;
    private String type;          // Text, Number, Money, Date, Datetime, Boolean, SingleSelect, Url
    private String defaultValue;  // optional (e.g., for Boolean true/false)
    private List<FieldOptionDto> options; // for SingleSelect

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
    public List<FieldOptionDto> getOptions() { return options; }
    public void setOptions(List<FieldOptionDto> options) { this.options = options; }
}
