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
public class AdditionalGuarantorDTO {
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
    
}
