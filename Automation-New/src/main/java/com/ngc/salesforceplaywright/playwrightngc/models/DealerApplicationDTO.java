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
public class DealerApplicationDTO {
    @JsonProperty
    private SignerDTO signer;
    @JsonProperty
    private BankAccountDTO bankAccount;
    @JsonProperty
    private BusinessInformationDTO businessInformation;
    @JsonProperty
    private GuarantorDTO guarantor;
    @JsonProperty
    private String appCountry;
    @JsonProperty
    private String appLanguage;
    @JsonProperty
    private Boolean contactHasDealerLicense;
   
}
