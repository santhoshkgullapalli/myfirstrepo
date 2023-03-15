package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ApplicationType {

    NEW("New"),
    REACTIVATION("Reactivation");

    @Getter
    private String value;
}
