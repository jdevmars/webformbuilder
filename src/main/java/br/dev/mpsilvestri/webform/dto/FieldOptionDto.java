package br.dev.mpsilvestri.webform.dto;

public class FieldOptionDto {
    private String value;
    private String friendlyName;

    public FieldOptionDto() {}
    public FieldOptionDto(String value, String friendlyName) {
        this.value = value; this.friendlyName = friendlyName;
    }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public String getFriendlyName() { return friendlyName; }
    public void setFriendlyName(String friendlyName) { this.friendlyName = friendlyName; }
}
