package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Profile {

    ACCOUNT_EXECUTIVE("AE", "Account Executive", "Mad AE"),
    ACCOUNT_EXECUTIVE2("AE", "Account Executive", "Sam Graff"),
    BUSINESS_DEV_REP("BDR", "Business Dev Rep", "Jenny BDR"),
    BUSINESS_DEVELOPMENT_MANAGER("BDM", "Business Development Manager", "Betsy BDM"),
    DEALER_ORIENTATION_MANAGER("DOM", "Dealer Orientation Manager", ""),
    DEALER_ORIENTATION_REP("DOR", "Dealer Orientation Representative", ""),
    INSIDE_SALES_EXECUTIVE("ISE", "Inside Sales Executive", "Saamy ISE"),
    LENDING_SERVICES_REPRESENTATIVE("LSR", "Lending Services Representative", "Sam Myers"),
    LENDING_SERVICES_REPRESENTATIVE2("LSR2", "Lending Services Representative", "Sonia Hale"),
    PERFORMANCE_MANAGER("PM", "Performance Manager", "Joseph White"),
    REGIONAL_DIRECTOR("RD", "Regional Director", "Reggie RD"),
    REGIONAL_SALES_DIRECTOR("RSD", "Regional Sales Director", "Roger RSD"),
    RISK_SPECIALIST("RSK", "Risk Specialist", "Lisa RSK"),
    SALES_EXECUTIVE("SE", "Sales Executive", "Jamie Shabazz"),
    SALES_EXECUTIVE2("SE2", "Sales Executive", "Steve Philhower"),
    SALES_EXECUTIVE3("SE3", "Sales Executive", "Sandra Gonzalez"),
    SALES_EXECUTIVE4("SE4", "Sales Executive", "Esther Conde"),
    INSIDE_SALES_EXECUTIVE2("ISE2", "Inside Sales Executive", "Barney BDR"),
    STANDARD_NGC_USER("NGC User", "Standard NGC User", ""),
    SYS_ADMIN("Sys Admin", "System Administrator", ""),
    SYS_ADMIN_NON_EXP("Sys Admin(Non-Expiring)", "System Administrator (Non-Expiring)", ""),
    UNDERWRITER("UW", "Underwriter", "Earl Hobbs"),
    UNDERWRITER2("UW2", "Underwriter", "Michael Barnes"),
    IGNITION_USER("IU", "Ignition User", "Sam Myers"),
    IGNITION_USER2("IU2", "Ignition User", "Jason Kubicki"),
    COMMERCIAL_LENDING_MANAGER("CLM", "Commercial Lending Manager", "Brittany Pedersen"),
    COMMERCIAL_LENDING_MANAGER2("CLM2", "Commercial Lending Manager", "Kristen Merrill"),
    PORTFOLIO_MANAGER("PM2", "Portfolio Manager", "Daniel Rodarte");

  
    @Getter
    private String shortName;
    @Getter
    private String fullName;
    @Getter 
    private String defaultSfUserName;

}
