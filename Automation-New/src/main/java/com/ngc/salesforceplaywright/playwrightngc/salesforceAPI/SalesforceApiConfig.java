package com.ngc.salesforceplaywright.playwrightngc.salesforceAPI;

import org.springframework.stereotype.Component;

import com.ngc.salesforceplaywright.playwrightngc.TestController;
import com.ngc.salesforceplaywright.playwrightngc.enums.SalesforceApiLoginDetails;


@Component
public class SalesforceApiConfig {

public SalesforceService initializeSalesForceApiEnvironment () {
    if (TestController.getTEST_ENV().equalsIgnoreCase("sit")) {
        return new SalesforceService(SalesforceApiLoginDetails.SITAPIENVIRONMENT.getUsername(), SalesforceApiLoginDetails.SITAPIENVIRONMENT.getPassword(), SalesforceApiLoginDetails.SITAPIENVIRONMENT.getClientId(), SalesforceApiLoginDetails.SITAPIENVIRONMENT.getClientSecret(), SalesforceApiLoginDetails.SITAPIENVIRONMENT.getEndpoint());
    }
    if (TestController.getTEST_ENV().equalsIgnoreCase("uat")) {
        return new SalesforceService(SalesforceApiLoginDetails.UATAPIENVIRONMENT.getUsername(), SalesforceApiLoginDetails.UATAPIENVIRONMENT.getPassword(), SalesforceApiLoginDetails.UATAPIENVIRONMENT.getClientId(), SalesforceApiLoginDetails.UATAPIENVIRONMENT.getClientSecret(), SalesforceApiLoginDetails.UATAPIENVIRONMENT.getEndpoint());
    }
    return null;
    
}
}
