package com.ngc.salesforceplaywright.playwrightngc.builders.LeadBuilders;

import com.ngc.salesforceplaywright.playwrightngc.models.SalesTerritoryDTO;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LeadSalesTerritoryBuilder {
    public static SalesTerritoryDTO buildSalesTerritory() {
        return SalesTerritoryDTO.builder()
                .salesExecutive(buildSalesTerritory().getSalesExecutive())
                .salesLastContactedBy(buildSalesTerritory().getSalesLastContactedBy())
                .salesLastContactedDate(buildSalesTerritory().getSalesLastContactedBy())
                .build();
    }
}
