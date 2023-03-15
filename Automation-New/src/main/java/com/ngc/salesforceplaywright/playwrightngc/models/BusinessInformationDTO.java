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
public class BusinessInformationDTO {
    @JsonProperty
    private String id;
    @JsonProperty
    private String exactLegalBusinessName;
    @JsonProperty
    private String dbaName;
    @JsonProperty
    private String dbaNameTwo;
    @JsonProperty
    private String businessEntityType;
    @JsonProperty
    private String stateOfFormation;
    @JsonProperty
    private String dateBusinessStarted;
    @JsonProperty
    private String businessAuctionAccessNumber;
    @JsonProperty
    private String dealerLicenseNumber;
    @JsonProperty
    private String dealerLicenseState;
    @JsonProperty
    private String dealerLicenseExpirationDate;
    @JsonProperty
    private String driversLicenseNumber;
    @JsonProperty
    private String driverLicenseExpireDate;
    @JsonProperty
    private String stateTaxId;
    @JsonProperty
    private String federalTaxId;
    @JsonProperty
    private String businessEmail;
    @JsonProperty
    private String businessPhoneNumber;
    @JsonProperty
    private String businessWebsite;
    @JsonProperty
    private String requestType;
    @JsonProperty
    private String businessStructure;
    @JsonProperty
    private String market;
    @JsonProperty
    private String sourcePortfolioManager;
    @JsonProperty
    private String sourceSalesExecutive;
    @JsonProperty
    private String sourceThirdParty;
    @JsonProperty
    private String applicationDate;
    @JsonProperty
    private String incorporatedState;
    @JsonProperty
    private String portfolioManager;
    @JsonProperty
    private String incorporatedDate;
    @JsonProperty
    private String registrantIdentificationNumber;
    @JsonProperty
    private String requestedLineOdCreditAmount;
    @JsonProperty
    private String fieldRequestedReserveAmount;
    @JsonProperty
    private String canadaScoreCard;
    @JsonProperty
    private String fieldRequestedPcrCharge;
    @JsonProperty
    private String reasonForApplying;
    @JsonProperty
    private AddressDTO address;
    @JsonProperty
    private CreditNeedsDTO creditNeeds;
}
