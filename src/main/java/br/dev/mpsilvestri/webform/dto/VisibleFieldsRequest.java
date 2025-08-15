package br.dev.mpsilvestri.webform.dto;

import jakarta.validation.constraints.NotBlank;

public class VisibleFieldsRequest {
    @NotBlank
    private String serverNumber;
    @NotBlank
    private String apiKey;

    public String getServerNumber() { return serverNumber; }
    public void setServerNumber(String serverNumber) { this.serverNumber = serverNumber; }
    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }
}
