package com.ngc.salesforceplaywright.playwrightngc.models;

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
public class SalesTerritoryDTO {
    @JsonProperty
    private String salesTerritoryName;
    @JsonProperty
    private String salesTerritoryRegion;
    @JsonProperty
    private String salesExecutive;
    @JsonProperty
    private String geopointeAssingmentArea;
    @JsonProperty
    private String salesLastContactedBy;
    @JsonProperty
    private String salesLastContactedDate;
}
