package com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders;

import com.ngc.salesforceplaywright.playwrightngc.models.SignerDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DealerApplicationSignerBuilder {
    public static SignerDTO buildSigner(SignerDTO signer) {
        var signerWithCompletedFields = buildSignerFields(signer);
        return SignerDTO.builder()
                .hasDealerLicense(signerWithCompletedFields.getHasDealerLicense())
                .isPrimary(signerWithCompletedFields.getIsPrimary())
                .title(signerWithCompletedFields.getTitle())
                .firstName(signerWithCompletedFields.getFirstName())
                .middleName(signerWithCompletedFields.getMiddleName())
                .lastName(signerWithCompletedFields.getLastName())
                .suffix(signerWithCompletedFields.getSuffix())
                .dateOfBirth(signerWithCompletedFields.getDateOfBirth())
                .cellPhone(signerWithCompletedFields.getCellPhone())
                .email(signerWithCompletedFields.getEmail())
                .ownershipPercentage(signerWithCompletedFields.getOwnershipPercentage())
                .auctionAccessNumber(signerWithCompletedFields.getAuctionAccessNumber())
                .socialSecurityNumber(signerWithCompletedFields.getSocialSecurityNumber())
                .driversLicenseNumber(signerWithCompletedFields.getDriversLicenseNumber())
                .driversLicenseStateOfIssue(signerWithCompletedFields.getDriversLicenseStateOfIssue())
                .expirationDate(signerWithCompletedFields.getExpirationDate())
                .address(signerWithCompletedFields.getAddress())
                .build();
    }

    private static SignerDTO buildSignerFields(SignerDTO signer) {
        signer.setHasDealerLicense(signer.getHasDealerLicense() != null ? signer.getHasDealerLicense() : Boolean.TRUE);
        signer.setTitle(signer.getTitle() != null ? signer.getTitle() : "--None--");
        signer.setFirstName(signer.getFirstName() != null ? "AWE Test" + signer.getFirstName()
                : "AWE Test " + RandomGen.getRandomFirstName());
        signer.setMiddleName(signer.getMiddleName() != null ? signer.getMiddleName() : RandomGen.getRandomFirstName());
        signer.setLastName(signer.getLastName() != null ? signer.getLastName() : RandomGen.getRandomLastName());
        signer.setSuffix(signer.getSuffix() != null ? signer.getSuffix() : " ");
        signer.setDateOfBirth(signer.getDateOfBirth() != null ? signer.getDateOfBirth() : "01/01/2000");
        signer.setCellPhone(signer.getCellPhone() != null ? signer.getCellPhone() : RandomGen.getRandomPhoneNumber());
        signer.setPreferredMethodOfCommunication(
                signer.getPreferredMethodOfCommunication() != null ? signer.getPreferredMethodOfCommunication() : " ");
        signer.setEmail(signer.getEmail() != null ? signer.getEmail() : RandomGen.getRandomEmailAddress());
        signer.setOwnershipPercentage(
                signer.getOwnershipPercentage() != null ? signer.getOwnershipPercentage() : "100");
        signer.setAuctionAccessNumber(signer.getAuctionAccessNumber() != null ? signer.getAuctionAccessNumber()
                : RandomGen.getRandomAuctionAccessNumber());
        signer.setSocialSecurityNumber(signer.getSocialSecurityNumber() != null ? signer.getSocialSecurityNumber()
                : RandomGen.getRandomSocialSecurityNumber());
        signer.setDriversLicenseNumber(signer.getDriversLicenseNumber() != null ? signer.getDriversLicenseNumber()
                : RandomGen.getRandomDriversLicenseNumber());
        signer.setDriversLicenseStateOfIssue(
                signer.getDriversLicenseStateOfIssue() != null ? signer.getDriversLicenseStateOfIssue() : "IN");
        signer.setExpirationDate(signer.getExpirationDate() != null ? signer.getExpirationDate() : " ");
        signer.getAddress().setStreet(
                signer.getAddress().getStreet() != null ? signer.getAddress().getStreet() : "11799 N College Ave");
        signer.getAddress().setCity(signer.getAddress().getCity() != null ? signer.getAddress().getCity() : "Carmel");
        signer.getAddress().setState(signer.getAddress().getState() != null ? signer.getAddress().getState() : "IN");
        signer.getAddress()
                .setCounty(signer.getAddress().getCounty() != null ? signer.getAddress().getCounty() : "Hamilton");
        signer.getAddress().setZip(signer.getAddress().getZip() != null ? signer.getAddress().getZip() : "46032");
        return signer;
    }
}
