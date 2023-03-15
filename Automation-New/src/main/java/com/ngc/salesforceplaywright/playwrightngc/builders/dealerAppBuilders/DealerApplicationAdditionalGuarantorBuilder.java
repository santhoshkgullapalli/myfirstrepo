package com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders;

import java.util.ArrayList;
import java.util.List;

import com.ngc.salesforceplaywright.playwrightngc.models.AdditionalGuarantorDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DealerApplicationAdditionalGuarantorBuilder {

    public static List<AdditionalGuarantorDTO> buildAdditionalGuarantors(List<AdditionalGuarantorDTO> guarantors) {

        List<AdditionalGuarantorDTO> guarantorList = new ArrayList<>();

        for (AdditionalGuarantorDTO guarantor : guarantors) {
            var additionalGuarantorWithCompletedFields = buildAdditionalGuarantorFields(guarantor, guarantor.getOwnershipPercentage());
        
            AdditionalGuarantorDTO builtGuarantor = AdditionalGuarantorDTO.builder()
                    .title(additionalGuarantorWithCompletedFields.getTitle())
                    .firstName(additionalGuarantorWithCompletedFields.getFirstName())
                    .lastName(additionalGuarantorWithCompletedFields.getLastName())
                    .ownershipPercentage(additionalGuarantorWithCompletedFields.getOwnershipPercentage())
                    .cellPhone(additionalGuarantorWithCompletedFields.getCellPhone())
                    .email(additionalGuarantorWithCompletedFields.getEmail())
                    .build();

            guarantorList.add(builtGuarantor);
        }
        return guarantorList;
    }

    private static AdditionalGuarantorDTO buildAdditionalGuarantorFields(AdditionalGuarantorDTO guarantor,
            String ownershipPercentage) {
        guarantor.setTitle(guarantor.getTitle() != null ? guarantor.getTitle() : " ");
        guarantor.setFirstName(
                        guarantor.getFirstName() != null ? guarantor.getFirstName() : RandomGen.getRandomFirstName());
        
        guarantor
                .setLastName(guarantor.getLastName() != null ? guarantor.getLastName() : RandomGen.getRandomLastName());
        guarantor.setOwnershipPercentage(guarantor.getOwnershipPercentage() != null ? guarantor.getOwnershipPercentage()
                : String.valueOf(ownershipPercentage));
        guarantor.setCellPhone(
                guarantor.getCellPhone() != null ? guarantor.getCellPhone() : RandomGen.getRandomPhoneNumber());
        guarantor.setEmail(guarantor.getEmail() != null ? guarantor.getEmail() : RandomGen.getRandomEmailAddress());
        return guarantor;
    }
}
