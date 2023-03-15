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
public class LeadInformationDTO {
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String middleName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String cadenceRecommDate;
    @JsonProperty
    private String leadCadence;
    @JsonProperty
    private String salesOpportunity;
    @JsonProperty
    private Boolean applicationHelpRequested;
    @JsonProperty
    private String businessName;
    @JsonProperty
    private String salutation;
    @JsonProperty
    private String leadStatus;
    @JsonProperty
    private String opportunityLevel;
    @JsonProperty
    private String phone;
    @JsonProperty
    private String dbaName;
    @JsonProperty
    private String mobile;
    @JsonProperty
    private String fax;
    @JsonProperty
    private String title;
    @JsonProperty
    private String auctionAccessNumber;
    @JsonProperty
    private String preferredLanguage;
    @JsonProperty
    private String preferredMethodOfCommunication;
    @JsonProperty
    private String email;
    @JsonProperty
    private Boolean doNotCall;
    @JsonProperty
    private Boolean emailOptOut;
    @JsonProperty
    private String disinterestReason;
    @JsonProperty
    private String disqualificationReason;
}
