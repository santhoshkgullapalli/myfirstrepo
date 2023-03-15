package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadStatus {
    OPEN("OPEN"),
    WORKINGNOTCONTACTED("Working - Not Contacted"),
    WORKINGCONTACTED("Working - Contacted"),
    WORKINGAPPLICATIONSUBMITTED("Working - Application Submitted"),
    WORKINGAPPLICATIONPENDING("Working - Application Pending"),
    CLOSEDCONVERTERED("Closed - Converted"),
    CLOSEDDISQUALIFIED("Closed - Disqualified"),
    CLOSEDDECLINED("Closed - Declined");

    @Getter
    private String value;

}
