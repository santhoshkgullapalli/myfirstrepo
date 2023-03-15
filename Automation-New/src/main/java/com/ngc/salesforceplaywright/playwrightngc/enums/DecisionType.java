package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum DecisionType {

    APPROVE("approve"),
    DECLINE("reject"),
    APPROVELINEMOD("approvelinemod"),
    APPROVED("approved");

    @Getter
    private String value;
}
