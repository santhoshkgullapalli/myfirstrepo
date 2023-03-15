package com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders;

import com.ngc.salesforceplaywright.playwrightngc.models.BankAccountDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DealerApplicationBankAccountBuilder {
    public static BankAccountDTO buildBankAccount(BankAccountDTO bankAccount) {
        var bankAccountWithCompletedFields = buildBankAccountFields(bankAccount);
        return BankAccountDTO.builder()
                .bankCity(bankAccountWithCompletedFields.getBankCity())
                .bankName(bankAccountWithCompletedFields.getBankName())
                .bankRoutingNumber(bankAccountWithCompletedFields.getBankRoutingNumber())
                .bankState(bankAccountWithCompletedFields.getBankState())
                .checkingAccountNumber(bankAccountWithCompletedFields.getCheckingAccountNumber())
                .build();
    }
    private static BankAccountDTO buildBankAccountFields(BankAccountDTO bankAccount) {
        bankAccount.setBankCity(bankAccount.getBankCity() != null ? bankAccount.getBankCity() : RandomGen.getRandomCity());
        bankAccount.setBankName(bankAccount.getBankName() != null ? bankAccount.getBankName() : "Bank Of America");
        bankAccount.setBankRoutingNumber(bankAccount.getBankRoutingNumber() != null ? bankAccount.getBankRoutingNumber() : "156930574");
        bankAccount.setBankState(bankAccount.getBankState() != null ? bankAccount.getBankState() : "IN");
        bankAccount.setCheckingAccountNumber(bankAccount.getCheckingAccountNumber() != null ? bankAccount.getCheckingAccountNumber() : RandomGen.getRandomCheckingAccountNumber());
        return bankAccount;
    }
}
