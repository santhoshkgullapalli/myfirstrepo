package com.ngc.salesforceplaywright.playwrightngc.builders.LeadBuilders;
import com.ngc.salesforceplaywright.playwrightngc.builders.AddressBuilder;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadDTO;

import lombok.experimental.UtilityClass;


@UtilityClass
public class LeadBuilder {
    public static LeadDTO buildLead() {
        return LeadDTO.builder()
                .leadInformation(LeadInformationBuilder.buildLeadInformation())
                .applicationInfo(LeadApplicationInfoBuilder.buildApplicationInfo())
                .salesTerritory(LeadSalesTerritoryBuilder.buildSalesTerritory())
                .operationsArea(LeadOperationsAreaBuilder.buildLeadOperationsArea())
                .address(AddressBuilder.buildAddress())
                .additionalInformation(LeadAdditionalInformationBuilder.buildAdditionalInformation())
                .build();
    }
}
