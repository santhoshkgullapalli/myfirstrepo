package com.ngc.salesforceplaywright.playwrightngc.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SalesforceApiLoginDetails {
    SITAPIENVIRONMENT("selenium@coxautoinc.com.sit","Selen123!","3MVG9jfQT7vUue.F1LIMNmoTmePpUaigM0jJBIgSdd__SxxlOBqaBn0INLrMO9BZ9ZYuJ_OmtWID.lGxZLGAb","608E186E808F78E6C7E15E3338C32B3578FBCF3D618D8A2400CACC9F66EB12DB","https://test.salesforce.com"),
    UATAPIENVIRONMENT("selenium@coxautoinc.com.uat","Selen123!","3MVG9OI03ecbG2Vpw3yS9_j_2imW6PkagIadg.iwzNX3bFM.OyzxdpNcRauE4vkhXAlC.f4K4gW1oAFT6YbAW","907C8BD34D6A1B62DCE80063B444F02C0CB06A315F9181C89732E241FB6674FF","https://test.salesforce.com");

@Getter
private final String username;
@Getter
private final String password;
@Getter
private final String clientId;
@Getter
private final String clientSecret;
@Getter
private final String endpoint;
}
