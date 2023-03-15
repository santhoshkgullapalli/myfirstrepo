package com.ngc.salesforceplaywright.playwrightngc.models.LeadModelsLightning;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ngc.salesforceplaywright.playwrightngc.models.AddressDTO;
import com.ngc.salesforceplaywright.playwrightngc.models.SalesTerritoryDTO;

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
public class LeadDTOLightning {
    @JsonProperty
    private LeadInformationDTOLightning leadInformation;
    @JsonProperty
    private LeadApplicationInfoDTOLightning applicationInfo;
    @JsonProperty
    private SalesTerritoryDTO salesTerritory;
    @JsonProperty
    private LeadOperationsAreaDTOLightning operationsArea;
    @JsonProperty
    private AddressDTO address;
    @JsonProperty 
    private LeadAdditionalInformationDTOLightning additionalInformation;
    @JsonProperty
    private String website;
}
