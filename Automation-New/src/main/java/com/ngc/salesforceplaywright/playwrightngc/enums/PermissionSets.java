package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PermissionSets {

    GEOPOINTE_CREATE_TERRITORIES_AND_MANAGE_ASSIGNMENTS_SOM("SOM", "GeoPointe_Create_Territories_and_Manage_Assignments"),
    CUSTOMER_ACCOUNT_REP("CAR", "Customer Account Rep");


    @Getter
    private String shortName;
    @Getter
    private String fullName;
}
