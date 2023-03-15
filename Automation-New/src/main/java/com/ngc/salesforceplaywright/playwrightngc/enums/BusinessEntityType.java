package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BusinessEntityType {

    CORPORATION("Corporatiom"),
    PARTNERSHIP("Partnership"),
    LIMITEDLIABILTYCOMPANY("Limited Liability Company"),
    SOLEPROPIETOR("Sole Proprietor"),
    LIMITEDLIABILTYPARTNERSHIP("Limited Liability Partnership");

    @Getter
    private String value;
}