package com.ngc.salesforceplaywright.playwrightngc.enums;



public enum SignerTitles {

    CEO("Ceo"),
    CFO("CFO"),
    PRESIDENT("President"),
    VICE_PRESIDENT("Vice_President"),
    SECRETARY("Secretary"),
    TREASURER("Treasurer"),
    GUARANTOR("Guarantor");

    private final String value;

    SignerTitles(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
