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
public class CreditNeedsDTO {
    @JsonProperty
    private Boolean isProductTypeRetail;
    @JsonProperty
    private String requestedLineofCreditAmountRetail;
    @JsonProperty
    private Boolean isProductTypeWholesale;
    @JsonProperty
    private String requestedLineofCreditAmountWholesale;
    @JsonProperty
    private Boolean isProductTypeSalvage;
    @JsonProperty
    private String requestedLineofCreditAmountSalvage;
    @JsonProperty
    private Boolean isProductTypeHeavyTruck;
    @JsonProperty
    private String requestedLineofCreditAmountHeavyTruck;
    
}
