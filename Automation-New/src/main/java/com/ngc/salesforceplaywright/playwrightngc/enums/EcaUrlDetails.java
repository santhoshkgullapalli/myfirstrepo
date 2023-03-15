package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum EcaUrlDetails {
    ECABASEURL("https://nextgearcapital--%s.sandbox.my.salesforce-sites.com/dealers/ShortFormApp");

    @Getter
    private String url;

}
