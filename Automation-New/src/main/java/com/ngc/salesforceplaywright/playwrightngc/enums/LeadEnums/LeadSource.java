package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadSource {
    BDCINBOUND("BDC Inbound"),
    BDCOUTBOUND("BDC Outbound"),
    FIELDLEAD("Field Lead"),
    INTERNAL("Internal"),
    MARKETING("Marketing"),
    PARTNERREFERRAL("Partner Referral"),
    PURCHASEDLIST("Purchased List"),
    STATEPROVINCELIST("State/Province List"),
    WEBAPP("Web App"),
    MCC("MCC");

    @Getter
    private String value;

}
