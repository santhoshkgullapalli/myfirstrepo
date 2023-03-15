package com.ngc.salesforceplaywright.playwrightngc.models.LeadModelsLightning;

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
public class LeadOperationsAreaDTOLightning {
    @JsonProperty
    private String portfolioManager;
    @JsonProperty
    private String market;
}
