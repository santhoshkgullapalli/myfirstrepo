package com.ngc.salesforceplaywright.playwrightngc.builders.LeadBuilders;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadOperationsAreaDTO;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LeadOperationsAreaBuilder {
    public static LeadOperationsAreaDTO buildLeadOperationsArea() {
        return LeadOperationsAreaDTO.builder()
                .portfolioManager(buildLeadOperationsArea().getPortfolioManager())
                .market(buildLeadOperationsArea().getMarket())
                .build();
    }
}
