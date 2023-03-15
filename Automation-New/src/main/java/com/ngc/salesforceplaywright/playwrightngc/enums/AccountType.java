package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum AccountType {

    MANUFACTURER ("Manufacturer"),
    AUCTION_HOUSE("Auction House"),
    DEALER("Dealer") ;

    @Getter
    private String value;
   
}
