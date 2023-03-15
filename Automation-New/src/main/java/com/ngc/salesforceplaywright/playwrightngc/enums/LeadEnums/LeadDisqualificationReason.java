package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadDisqualificationReason {
    NONE("--None--"),
    BADNUMBER("Bad Number"),
    DEFAULT("Default"),
    EXISTINGDEALER("Existing Dealer"),
    FRANCHISEDEALER("Franchise Dealer"),
    KOBOOK("KO Book"),
    LITIGATIONHOLD("Litigation Hold"),
    NONAUTODEALER("Non-Auto Dealer"),
    OUTOFBUSINESS("Out of Business");

   @Getter
   private String value;
}
