package com.ngc.salesforceplaywright.playwrightngc.models;

import java.util.List;

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
public class GuarantorDTO {
    @JsonProperty
    private Integer index;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String title;
    @JsonProperty
    private String ownershipPercentage;
    @JsonProperty
    private String cellPhone;
    @JsonProperty
    private String email;
    @JsonProperty
    private AddressDTO address;
    @JsonProperty
    private String auctionAccessNumber;
    @JsonProperty
    private String socialSecurityNumber;
    @JsonProperty
    private String dateOfBirth;
    @JsonProperty
    private String driverLicenseNumber;
    @JsonProperty
    private String driverLicenseState;
    @JsonProperty
    private String driverLicenseExpiration;
    @JsonProperty
    private Boolean hasSignedAndSubmitted;
    @JsonProperty
    private String driverLicenseFile;
    @JsonProperty
    private Integer givenStarNumber;
    @JsonProperty
    private String userFeedbackComment;
    @JsonProperty
    private String leadName;
    @JsonProperty
    private String leadUrl;
    @JsonProperty
    private String dealerApplicationNumber;
    @JsonProperty
    private String dealerApplicationUrl;
    @JsonProperty
    private String guarantorId;
    @JsonProperty
    private String guarantorName;
    @JsonProperty
    private Boolean isPrimary;
    @JsonProperty
    private String guid;
    @JsonProperty
    private String status;
    @JsonProperty
    private String guarantorUrl;
    @JsonProperty
    private String longFormGuarantorUrl;
    @JsonProperty
    private List<AdditionalGuarantorDTO> additionalGuarantors;
}
