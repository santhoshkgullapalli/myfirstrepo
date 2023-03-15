package com.ngc.salesforceplaywright.playwrightngc.builders.LeadBuilders;

import lombok.experimental.UtilityClass;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadAdditionalInformationDTO;


@UtilityClass
public class LeadAdditionalInformationBuilder {

    public static LeadAdditionalInformationDTO buildAdditionalInformation() {
        return LeadAdditionalInformationDTO.builder()
                .dealerLicenseNumber("")
                .dealerType("")
                .description("")
                .dualCredit("")
                .leadSource("")
                .ngenContractId("")
                .build();
    }
}
