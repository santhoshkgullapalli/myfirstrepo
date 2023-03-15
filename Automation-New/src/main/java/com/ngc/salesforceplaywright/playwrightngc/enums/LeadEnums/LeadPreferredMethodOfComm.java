package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadPreferredMethodOfComm {
    NONE("--None--"),
    PHONE("Phone"),
    EMAIL("Email"),
    TEXT("Text"),
    INPERSON("In Person");

    @Getter 
    private String value;
}
