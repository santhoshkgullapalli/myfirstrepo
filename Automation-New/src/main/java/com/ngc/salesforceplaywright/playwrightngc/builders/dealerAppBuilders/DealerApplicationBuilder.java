package com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders;

import com.ngc.salesforceplaywright.playwrightngc.models.AddressDTO;
import com.ngc.salesforceplaywright.playwrightngc.models.BankAccountDTO;
import com.ngc.salesforceplaywright.playwrightngc.models.BusinessInformationDTO;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;
import com.ngc.salesforceplaywright.playwrightngc.models.GuarantorDTO;
import com.ngc.salesforceplaywright.playwrightngc.models.SignerDTO;

import lombok.experimental.UtilityClass;




@UtilityClass
public class DealerApplicationBuilder {

    private static DealerApplicationDTO buildDealerApplication(String appCountry, String appLanguage, SignerDTO signer, GuarantorDTO guarantor, BankAccountDTO bankAccount, BusinessInformationDTO businessInformation) {
        if (appCountry == null) {
            appCountry = "US";
        }
        if (appLanguage == null) {
            appLanguage = "English";
        }
        return DealerApplicationDTO.builder()
                .appCountry(appCountry)
                .appLanguage(appLanguage)
                .signer(DealerApplicationSignerBuilder.buildSigner(signer))
                .guarantor(DealerApplicationGuarantorBuilder.buildGuarantor(guarantor))
                .bankAccount(DealerApplicationBankAccountBuilder.buildBankAccount(bankAccount))
                .businessInformation(DealerApplicationBusinessInformationBuilder.buildBusinessInformation(businessInformation))
                .build();
    }

    public static DealerApplicationDTO getAutomatedDealerApplication() {
        var signer = new SignerDTO().setAddress(new AddressDTO());
        var guarantor = new GuarantorDTO();
        var bankAccount = new BankAccountDTO();
        var businessInformation = new BusinessInformationDTO().setAddress(new AddressDTO());
       return buildDealerApplication(null, null, signer, guarantor, bankAccount, businessInformation);
    }
    
}
