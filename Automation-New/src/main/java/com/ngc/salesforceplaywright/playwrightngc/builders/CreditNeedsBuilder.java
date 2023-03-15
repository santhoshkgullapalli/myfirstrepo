package com.ngc.salesforceplaywright.playwrightngc.builders;

import com.ngc.salesforceplaywright.playwrightngc.models.CreditNeedsDTO;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CreditNeedsBuilder {
    public static CreditNeedsDTO buildCreditNeeds() {
        return CreditNeedsDTO.builder()
                .requestedLineofCreditAmountRetail("100000")
                .isProductTypeRetail(true)
                .requestedLineofCreditAmountHeavyTruck("0")
                .isProductTypeHeavyTruck(false)
                .requestedLineofCreditAmountSalvage("0")
                .isProductTypeSalvage(false)
                .requestedLineofCreditAmountWholesale("0")
                .isProductTypeWholesale(false)
                .build();
    }
}
