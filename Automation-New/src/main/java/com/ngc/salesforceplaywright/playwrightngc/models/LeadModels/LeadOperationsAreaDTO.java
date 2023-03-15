package com.ngc.salesforceplaywright.playwrightngc.models.LeadModels;

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
public class LeadOperationsAreaDTO {
    @JsonProperty
    private String portfolioManager;
    @JsonProperty
    private String market;
}
