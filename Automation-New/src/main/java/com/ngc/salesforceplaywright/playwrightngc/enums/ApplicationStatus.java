package com.ngc.salesforceplaywright.playwrightngc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ApplicationStatus {

    NEW("New"),
    AWAITING_CREDIT_APPROVAL("Awaiting Credit Approval"),
    CREDIT_PENDING("Credit Pending"),
    CONTRACT_PENDIN("Contract Pending"),
    CONTRACT_APPROVED("Contract Approved"),
    CREDIT_APPROVED("Credit Approved"),
    DEAD_FILED("Expired"),
    REHASH("Rehash"),
    ACTIVATED("Activated"),
    TRANSFERRED("Transferred"),
    IN_AUTO_DECISION_PROCESS("In Auto Decision Process") ,
    ANALYST_PENDING("Analyst Pending") ;

    @Getter
    private String value;
}
