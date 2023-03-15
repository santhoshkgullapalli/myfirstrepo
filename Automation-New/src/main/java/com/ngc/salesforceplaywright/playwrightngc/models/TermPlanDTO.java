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
public class TermPlanDTO {
    @JsonProperty
    private String name;
    @JsonProperty
    private String creditType;
    @JsonProperty
    private String planDescription;
    @JsonProperty
    private String termPlanId;
    @JsonProperty
    private String interestRate;
    @JsonProperty
    private Boolean flatInterest;
    @JsonProperty
    private Boolean discontinued;
    @JsonProperty
    private Boolean active;
    @JsonProperty
    private String parentTermPlan;
    @JsonProperty
    private String type;


}
