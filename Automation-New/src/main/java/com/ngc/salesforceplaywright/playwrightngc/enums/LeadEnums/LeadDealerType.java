package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadDealerType {

    STANDARD("Standard"),
    FRANCHISE("Franchise"),
    DIVERSIFIED("Diversified");

    @Getter
    private String value;

}
