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
public class AddressDTO {
    @JsonProperty
    private String street;
    @JsonProperty
    private String city;
    @JsonProperty
    private String country;
    @JsonProperty
    private String county;
    @JsonProperty
    private String state;
    @JsonProperty
    private String zip;
    @JsonProperty
    private String timeZone;
}
