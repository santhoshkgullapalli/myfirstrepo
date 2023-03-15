package com.ngc.salesforceplaywright.playwrightngc.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum AccountStatus {

    AWAITING_CREDIT_APPROVAL("Awaiting Credit Approval"),
    AWAITING_FINAL_REVIEW("Awaiting Final Review"),
    CONTRACT_APPROVED("Contract Approved"),
    CONTRACT_PENDING("Contract Pending"),
    CONTRACT_REVIEW("Contract Pending"),
    CREDIT_APPROVED("Credit Approved"),
    CREDIT_DECLINED("Credit Declined"),
    CREDIT_PENDING("Credit Pending"),
    CREDIT_REHASH("Credit Rehash"),
    EXPIRED("Expired"),
    HOLD("Hold"),
    IN_AUTO_DECISION_PROCESS("In Auto Decision Process"),
    NEW("New"),
    REHASH("ReHash"),
    REACTIVATE("Re-Activate"),
    RELOOK("Re-Look"),
    SUSPENDED("Suspended"),
    TEAM_LEAD_DECISION("Team Lead Decisioned"),
    UNDER_REVIEW("Under Review"),
    UNDERWRITING_PENDING("Underwriting Pending"),
    ACTIVE("Active"),
    INACTIVE("In-Active"),
    CONTRACT_CLOSED("Contract Closed"),
    ACTIVATED("Activated"),
    APPROVAL_PENDING("Approval Pending"),
    ACTIVATION_PENDING("Activation Pending"),
    PENDING_HOLD("Pending / Hold"),
    TRANSFERRED("Transferred"),
    ANALYSIS_PENDING("Analyst Pending"),
    MAJORDEALER_UW_READY("Majordealer UW Ready");

    @Getter
    private String value;

}
