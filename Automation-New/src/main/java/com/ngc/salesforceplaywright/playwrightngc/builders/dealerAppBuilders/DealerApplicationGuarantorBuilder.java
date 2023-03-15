package com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders;

import lombok.experimental.UtilityClass;
import java.util.ArrayList;

import com.ngc.salesforceplaywright.playwrightngc.models.GuarantorDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

@UtilityClass
public class DealerApplicationGuarantorBuilder {

    public static GuarantorDTO buildGuarantor(GuarantorDTO guarantor) {
        var guarantorWithCompletedFields = buildGuarantorFields(guarantor);
        return GuarantorDTO.builder()
                .title(guarantorWithCompletedFields.getTitle())
                .firstName(guarantorWithCompletedFields.getFirstName())
                .lastName(guarantorWithCompletedFields.getLastName())
                .ownershipPercentage(guarantorWithCompletedFields.getOwnershipPercentage())
                .cellPhone(guarantorWithCompletedFields.getCellPhone())
                .email(guarantorWithCompletedFields.getEmail())
                .hasSignedAndSubmitted(guarantorWithCompletedFields.getHasSignedAndSubmitted())
                .driverLicenseNumber(guarantorWithCompletedFields.getDriverLicenseNumber())
                .additionalGuarantors(guarantorWithCompletedFields.getAdditionalGuarantors())
                .build();
    }

    private static GuarantorDTO buildGuarantorFields(GuarantorDTO guarantor) {
        guarantor.setTitle(guarantor.getTitle() != null ? guarantor.getTitle() : "Mr");
        guarantor.setFirstName(
                guarantor.getFirstName() != null ? guarantor.getFirstName() : RandomGen.getRandomFirstName());
        guarantor
                .setLastName(guarantor.getLastName() != null ? guarantor.getLastName() : RandomGen.getRandomLastName());
        guarantor.setCellPhone(
                guarantor.getCellPhone() != null ? guarantor.getCellPhone() : RandomGen.getRandomPhoneNumber());
        guarantor.setEmail(guarantor.getEmail() != null ? guarantor.getEmail() : RandomGen.getRandomEmailAddress());
        guarantor.setHasSignedAndSubmitted(
                guarantor.getHasSignedAndSubmitted() == null || guarantor.getHasSignedAndSubmitted());
        guarantor.setDriverLicenseNumber(guarantor.getDriverLicenseNumber() != null ? guarantor.getDriverLicenseNumber()
                : RandomGen.getRandomDriversLicenseNumber());
        guarantor.setAdditionalGuarantors(guarantor.getAdditionalGuarantors() != null ? guarantor.getAdditionalGuarantors() : new ArrayList<>());
        if (guarantor.getAdditionalGuarantors().isEmpty()) {
            guarantor.setOwnershipPercentage(guarantor.getOwnershipPercentage() != null ? guarantor.getOwnershipPercentage() : "100");
        }
        
        return guarantor;
}
}
