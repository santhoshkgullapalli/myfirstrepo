package com.ngc.salesforceplaywright.playwrightngc.builders.LeadBuilders;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadInformationDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

import lombok.experimental.UtilityClass;

@UtilityClass
public class LeadInformationBuilder {
        
    public static LeadInformationDTO buildLeadInformation() {
        return LeadInformationDTO.builder()
                .salutation(buildLeadInformation().getSalutation())
                .firstName(RandomGen.getRandomFirstName())
                .middleName(RandomGen.getRandomMiddleName())
                .lastName(RandomGen.getRandomLastName())
                .leadStatus(buildLeadInformation().getLeadStatus())
                .opportunityLevel(buildLeadInformation().getOpportunityLevel())
                .phone(RandomGen.getRandomPhoneNumber())
                .mobile(RandomGen.getRandomPhoneNumber())
                .businessName(RandomGen.getRandomBusinessName())
                .email(RandomGen.getRandomEmailAddress())
                .dbaName(buildLeadInformation().getDbaName())
                .fax(RandomGen.getRandomPhoneNumber())
                .title(buildLeadInformation().getTitle())
                .doNotCall(buildLeadInformation().getDoNotCall())
                .auctionAccessNumber(RandomGen.getRandomAuctionAccessNumber())
                .emailOptOut(buildLeadInformation().getEmailOptOut())
                .preferredLanguage(buildLeadInformation().getPreferredLanguage())
                .disinterestReason(buildLeadInformation().getDisinterestReason())
                .preferredMethodOfCommunication(buildLeadInformation().getPreferredMethodOfCommunication())
                .disqualificationReason(buildLeadInformation().getDisqualificationReason())
            .build();
    }
}
