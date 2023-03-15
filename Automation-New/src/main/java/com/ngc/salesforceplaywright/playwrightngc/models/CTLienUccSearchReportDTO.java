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
public class CTLienUccSearchReportDTO {
    @JsonProperty
    private String uccSearchReport;
    @JsonProperty
    private String account;
    @JsonProperty
    private String financingOrganization;
    @JsonProperty
    private String application;
    @JsonProperty
    private Boolean isPrimary;
    @JsonProperty
    private String originalFilingDate;
    @JsonProperty
    private Boolean manuallyEntered;
    @JsonProperty
    private String jurisdiction;
    @JsonProperty
    private Boolean terminationRequired;
    @JsonProperty
    private String fileNumber;
    @JsonProperty
    private Boolean needIntercreditor;
    @JsonProperty
    private String expiredDate;
    @JsonProperty
    private Boolean hasDebtors;
    @JsonProperty
    private String collateral;
    @JsonProperty
    private Boolean hasSecuredParties;
    @JsonProperty
    private String debtors;
    @JsonProperty
    private String securedParties;
    @JsonProperty
    private String searchKeyword;
    


    
}
