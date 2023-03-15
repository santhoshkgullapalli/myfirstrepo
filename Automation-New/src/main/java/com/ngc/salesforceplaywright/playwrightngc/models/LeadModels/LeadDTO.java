package com.ngc.salesforceplaywright.playwrightngc.models.LeadModels;

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
public class LeadDTO {
    @JsonProperty
    private LeadInformationDTO leadInformation;
    @JsonProperty
    private LeadApplicationInfoDTO applicationInfo;
    @JsonProperty
    private SalesTerritoryDTO salesTerritory;
    @JsonProperty
    private LeadOperationsAreaDTO operationsArea;
    @JsonProperty
    private AddressDTO address;
    @JsonProperty 
    private LeadAdditionalInformationDTO additionalInformation;
    @JsonProperty
    private String website;
}
