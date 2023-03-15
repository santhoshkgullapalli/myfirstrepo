package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadPageSelectors {
    LEADTAB("text=Leads"),
    NEWBUTTON("input[name=\"new\"]"),
    DONOTCALL("text=Do Not Call"),
    SALUTATION("text=Salutation"),
    FIRSTNAME("td:has-text('First Name') + td"),
    MIDDLENAME("td:has-text('Middle Name') + td"),
    LASTNAME("td:has-text('Last Name') + td"),
    BUSINESSNAME("td:has-text('Business Name') + td"),
    LEADSTATUS("tr:has-text('Lead Status')"),
    EMAIL("td:has-text('Email') + td"),
    PHONE("td:has-text('Phone') + td"),
    FAX("td:has-text('Fax') + td"),
    MOBILE("td:has-text('Mobile') + td"),
    DBANAME("td:has-text('DBA') + td"),
    TITLE("td:has-text('Title') + td"),
    ISLICENSEDDEALER("td:has-text('Is a Licensed Dealer') + td"),
    AUCTIONACCESSNUMBER("td:has-text('Auction Access') + td"),
    PREFERREDCOMMUNICATIONMETHOD("td:has-text('Preferred Method of Communication') + td"),
    PREFERREDLANGUAGE("td:has-text('Preferred Language') + td"),
    ADDRESS("textarea[name*=\"street\"]"),
    CITY("input[name*=\"city\"]"),
    ZIP("input[name*=\"zip\"]"),
    STATE("select[name*=\"state\"]"),
    WEBSITE("td:has-text('Website') + td"),
    COUNTY("td:has-text('County') + td"),
    SAVEBUTTON("text=Lead Edit Save Save & New Cancel >> input[name='save']");

    @Getter
    private String value;
}
