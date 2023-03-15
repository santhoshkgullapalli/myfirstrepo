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
public class CTLienSOSCorporateSearchReportDTO {
    @JsonProperty
    private String sosReport;
    @JsonProperty
    private String account;
    @JsonProperty
    private String application;
    @JsonProperty
    private Boolean manuallyEntered;
    @JsonProperty
    private String corporateName;
    @JsonProperty
    private String nameType;
    @JsonProperty
    private String incorpState;
    @JsonProperty
    private String goodThru;
    @JsonProperty
    private String statusOfEntity;
    @JsonProperty
    private String rating;
    @JsonProperty
    private Boolean inGoodStanding;
    @JsonProperty
    private String searchKeyword;
    @JsonProperty
    private String entityId;
    @JsonProperty
    private String detailReportUrl;
    
    
}
