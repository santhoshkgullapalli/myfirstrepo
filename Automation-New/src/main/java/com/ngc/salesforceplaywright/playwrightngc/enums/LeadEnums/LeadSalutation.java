package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadSalutation {
    NONE("--None--"),
    MR("Mr."),
    MS("Ms."),
    MRS("Mrs."),
    DR("Dr."),
    PROF("Prof.");

    @Getter 
    private String value;
}
