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
public class RequestedLineOfCreditDTO {
    @JsonProperty
    private Boolean active;
    @JsonProperty
    private String application;
    @JsonProperty
    private String account;
    @JsonProperty
    private String creditType;
    @JsonProperty
    private Boolean termPlan;
    @JsonProperty
    private String requestedLineOfCreditAmount;
    @JsonProperty
    private String targetYield;
    @JsonProperty
    private Boolean desiredTermPlan;
    @JsonProperty
    private String financeProgramType;
    @JsonProperty
    private String approvedYield;
    @JsonProperty
    private String approvedLineOfCreditAmount;
    @JsonProperty
    private Boolean competitorYield;
    @JsonProperty
    private String unitsLotHoldsCapacity;
    @JsonProperty
    private String unitsOnLotCurrentLotCount;
    @JsonProperty
    private String averageUnitsSoldPerMonth;
    @JsonProperty
    private String averagePricePerUnit;
    @JsonProperty
    private String averageUnitTurnTime;
    @JsonProperty
    private String monthlyFlooringCommitment;
    @JsonProperty
    private String nGenRequestLineOfCreditId;
    
    

}
