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
public class SignerDTO {
    @JsonProperty
    private String title;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String middleName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private Boolean hasDealerLicense;
    @JsonProperty
    private String preferredMethodOfCommunication;
    @JsonProperty
    private String suffix;
    @JsonProperty
    private String dateOfBirth;
    @JsonProperty
    private String cellPhone;
    @JsonProperty
    private String email;
    @JsonProperty
    private String ownershipPercentage;
    @JsonProperty
    private AddressDTO address;
    @JsonProperty
    private String auctionAccessNumber;
    @JsonProperty
    private String socialSecurityNumber;
    @JsonProperty
    private String driversLicenseNumber;
    @JsonProperty
    private String driversLicenseStateOfIssue;
    @JsonProperty
    private String driverLicenseCity;
    @JsonProperty
    private String driverLicenseCountry;
    @JsonProperty
    private String driverLicenseCounty;
    @JsonProperty
    private String expirationDate;
    @JsonProperty
    private Boolean isCreditPulled;
    @JsonProperty
    private Boolean isPrimary;
    @JsonProperty
    private Boolean isStakeholder;
    @JsonProperty
    private String ngenSignerId;
}