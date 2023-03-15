package com.ngc.salesforceplaywright.playwrightngc.builders.LeadBuilders;

import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadApplicationInfoDTO;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LeadApplicationInfoBuilder {
    public static LeadApplicationInfoDTO buildApplicationInfo() {
        return LeadApplicationInfoDTO.builder()
                .applicationHelpRequested(buildApplicationInfo().getApplicationHelpRequested())
                .awaitingCreditApproval(buildApplicationInfo().getAwaitingCreditApproval())
                .helpRequestedOn(buildApplicationInfo().getHelpRequestedOn())
                .isALicensedDealer(buildApplicationInfo().getIsALicensedDealer())
                .build();
    }   
}
