package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum DocumentType {
    DEALER_LICENSE("Dealer License"),
    DRIVER_LICENSE("Driver License"),
    ARTICLES_OF_INCORPORATION("Articles of Incorporation"),
    PARTNERSHIP_AGREEMENT("Partnership Agreement"),
    FILED_PARTNERSHIP_AGREEMENT("Filed Partnership Agreement"),
    FIRST_MONTH_BANK_STATEMENT("1st Month Bank Statement"),
    SECOND_MONTH_BANK_STATEMENT("2nd Month Bank Statement"),
    THIRD_MONTH_BANK_STATEMENT("3rd Month Bank Statement"),
    OTHER("Other");

    @Getter
    private String value;
}
