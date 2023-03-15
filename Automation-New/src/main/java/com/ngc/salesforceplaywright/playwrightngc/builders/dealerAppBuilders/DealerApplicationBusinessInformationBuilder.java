package com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders;

import com.ngc.salesforceplaywright.playwrightngc.builders.CreditNeedsBuilder;
import com.ngc.salesforceplaywright.playwrightngc.enums.Profile;
import com.ngc.salesforceplaywright.playwrightngc.models.BusinessInformationDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DealerApplicationBusinessInformationBuilder {
    public static BusinessInformationDTO buildBusinessInformation(BusinessInformationDTO businessInformation) {
        var businessInformationWithCompletedFields = buildBusinessInfromationFields(businessInformation);
        return BusinessInformationDTO.builder()
                .exactLegalBusinessName(businessInformationWithCompletedFields.getExactLegalBusinessName())
                .dbaName(businessInformationWithCompletedFields.getDbaName())
                .businessEntityType(businessInformationWithCompletedFields.getBusinessEntityType())
                .stateOfFormation(businessInformationWithCompletedFields.getStateOfFormation())
                .dateBusinessStarted(businessInformationWithCompletedFields.getDateBusinessStarted())
                .businessAuctionAccessNumber(businessInformationWithCompletedFields.getBusinessAuctionAccessNumber())
                .dealerLicenseNumber(businessInformationWithCompletedFields.getDealerLicenseNumber())
                .dealerLicenseExpirationDate(businessInformationWithCompletedFields.getDealerLicenseExpirationDate())
                .stateTaxId(businessInformationWithCompletedFields.getStateTaxId())
                .federalTaxId(businessInformationWithCompletedFields.getFederalTaxId())
                .driversLicenseNumber(businessInformationWithCompletedFields.getDriversLicenseNumber())
                .businessEmail(businessInformationWithCompletedFields.getBusinessEmail())
                .businessPhoneNumber(businessInformationWithCompletedFields.getBusinessPhoneNumber())
                .address(businessInformationWithCompletedFields.getAddress())
                .driverLicenseExpireDate(businessInformationWithCompletedFields.getDriverLicenseExpireDate())
                .sourcePortfolioManager(businessInformationWithCompletedFields.getSourcePortfolioManager())
                .sourceSalesExecutive(businessInformationWithCompletedFields.getSourceSalesExecutive())
                .sourceThirdParty(businessInformationWithCompletedFields.getSourceThirdParty())
                .creditNeeds(businessInformationWithCompletedFields.getCreditNeeds())
                .build();
    }

    private static BusinessInformationDTO buildBusinessInfromationFields(BusinessInformationDTO businessInformation) {
        businessInformation.setExactLegalBusinessName(businessInformation.getExactLegalBusinessName() != null
                ? businessInformation.getExactLegalBusinessName()
                : "E2e Test " + RandomGen.getRandomBusinessName());
        businessInformation
                .setDbaName(businessInformation.getDbaName() != null ? businessInformation.getDbaName() : "--None--");
        businessInformation.setBusinessEntityType(
                businessInformation.getBusinessEntityType() != null ? businessInformation.getBusinessEntityType()
                        : "Corporation");
        businessInformation.setStateOfFormation(
                businessInformation.getStateOfFormation() != null ? businessInformation.getStateOfFormation() : "IN");
        businessInformation.setDateBusinessStarted(
                businessInformation.getDateBusinessStarted() != null ? businessInformation.getDateBusinessStarted()
                        : "01/01/2000");
        businessInformation.setBusinessAuctionAccessNumber(businessInformation.getBusinessAuctionAccessNumber() != null
                ? businessInformation.getBusinessAuctionAccessNumber()
                : RandomGen.getRandomAuctionAccessNumber());
        businessInformation.setDealerLicenseNumber(
                businessInformation.getDealerLicenseNumber() != null ? businessInformation.getDealerLicenseNumber()
                        : RandomGen.getRandomDealerLicenseNumber());
        businessInformation.setDealerLicenseExpirationDate(businessInformation.getDealerLicenseExpirationDate() != null
                ? businessInformation.getDealerLicenseExpirationDate()
                : "01/01/2050");
        businessInformation
                .setStateTaxId(businessInformation.getStateTaxId() != null ? businessInformation.getFederalTaxId()
                        : RandomGen.getRandomStateTaxId());
        businessInformation.setDriversLicenseNumber(
                businessInformation.getDriversLicenseNumber() != null ? businessInformation.getDriversLicenseNumber()
                        : RandomGen.getRandomDriversLicenseNumber());
        businessInformation
                .setFederalTaxId(businessInformation.getFederalTaxId() != null ? businessInformation.getFederalTaxId()
                        : RandomGen.getRandomFedTaxId());
        businessInformation.setBusinessEmail(
                businessInformation.getBusinessEmail() != null ? businessInformation.getBusinessEmail()
                        : RandomGen.getRandomEmailAddress());
        businessInformation.setBusinessPhoneNumber(
                businessInformation.getBusinessPhoneNumber() != null ? businessInformation.getBusinessPhoneNumber()
                        : RandomGen.getRandomPhoneNumber());
        businessInformation.getAddress()
                .setStreet(businessInformation.getAddress().getStreet() != null
                        ? businessInformation.getAddress().getStreet()
                        : "11799 N College Ave");
        businessInformation.getAddress()
                .setCity(businessInformation.getAddress().getCity() != null ? businessInformation.getAddress().getCity()
                        : "Carmel");
        businessInformation.getAddress().setState(businessInformation.getAddress().getState() != null ? businessInformation.getAddress().getState() : "IN");
        businessInformation.getAddress().setCounty(businessInformation.getAddress().getCounty() != null ? businessInformation.getAddress().getCounty() : "Hamilton");
        businessInformation.getAddress().setZip(businessInformation.getAddress().getZip() != null ? businessInformation.getAddress().getZip() : "46032");
        businessInformation.setDbaNameTwo(
        businessInformation.getDbaNameTwo() != null ? businessInformation.getDbaNameTwo() : "--None--");
        businessInformation.setDriverLicenseExpireDate(businessInformation.getDriverLicenseExpireDate() != null ? businessInformation.getDriverLicenseExpireDate() : "01/01/2030");
        businessInformation.setCreditNeeds(businessInformation.getCreditNeeds() != null ? businessInformation.getCreditNeeds() : CreditNeedsBuilder.buildCreditNeeds());
        businessInformation.setSourcePortfolioManager(businessInformation.getSourcePortfolioManager() != null ? businessInformation.getSourcePortfolioManager() : Profile.PORTFOLIO_MANAGER.getDefaultSfUserName());
        businessInformation.setPortfolioManager(businessInformation.getSourcePortfolioManager() != null ? businessInformation.getSourcePortfolioManager() : Profile.PORTFOLIO_MANAGER.getDefaultSfUserName());
        businessInformation.setSourceSalesExecutive(businessInformation.getSourceSalesExecutive() != null ? businessInformation.getSourceSalesExecutive() : Profile.SALES_EXECUTIVE.getDefaultSfUserName());
        businessInformation.setSourceThirdParty(businessInformation.getSourceThirdParty() != null? businessInformation.getSourceThirdParty() : "Third Party");
        

        return businessInformation;
    }
}
