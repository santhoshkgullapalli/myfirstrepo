package com.ngc.salesforceplaywright.playwrightngc.models.LeadModelsLightning;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class LeadAdditionalInformationDTOLightning {
    @JsonProperty
    private String leadSource;
    @JsonProperty
    private String dealerLicenseNumber;
    @JsonProperty
    private String dualCredit;
    @JsonProperty
    private String description;
    @JsonProperty
    private String dealerType;
    @JsonProperty
    private List<String> lineOfCredit;
    @JsonProperty
    private String ngenContractId;
    
}
