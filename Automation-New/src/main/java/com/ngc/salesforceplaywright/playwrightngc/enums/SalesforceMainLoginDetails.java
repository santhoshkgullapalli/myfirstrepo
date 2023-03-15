package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SalesforceMainLoginDetails {

    DEVBILL("william.chapman@coxautoinc.com.ngc.devbill", "Anakin2020", "devbill"),
    DEVMARK("william.chapman@coxautoinc.com.ngc.devmark","Anakin2023","devmark"),
    QAAUTOSITLOGIN("qaauto@ngc.com.sit", "Selenium123!","sit"),
    QAAUTOUATLOGIN("qaauto@ngc.com.uat", "Selenium123!!!","uat");

    @Getter
    private final String username;
    @Getter
    private final String password;
    @Getter 
    private final String envrironment;

}
