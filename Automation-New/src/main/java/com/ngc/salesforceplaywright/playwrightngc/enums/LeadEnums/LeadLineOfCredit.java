package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadLineOfCredit {
    
    EXPRESS("Express"),
    HEAVY_TRUCKS("Heavy Trucks"),
    LEASE("Lease"),
    NEW_AUTO("New Auto"),
    NEW_RV("New RV"),
    NEW_MARINE("New Marine"),
    POWERSPORTS_NEW("Powersports - New"),
    POWERSPORTS_USED("Powersports - Used"),
    RECIEVEABLE_ADVANCE("Receivable Advance"),
    RENTAL("Rental"),
    RENT_TO_OWN("Rent To Own"),
    RETAIL("Retail"),
    SALVAGE("Salvage"),
    USED_MARINE("Used Marine"),
    USED_RV("Used RV"),
    WHOLESALE("Wholesale"),
    FLEX20RETAIL("Retail"),
    FLEX20WHOLESALE("Wholesale");

    @Getter
    private String value;
}
