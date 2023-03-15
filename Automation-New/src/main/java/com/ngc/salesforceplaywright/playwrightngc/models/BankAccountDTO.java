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
public class BankAccountDTO {
    @JsonProperty
    private String bankName;
    @JsonProperty
    private String checkingAccountNumber;
    @JsonProperty
    private String bankRoutingNumber;
    @JsonProperty
    private String bankCity;
    @JsonProperty
    private String bankState;
}
