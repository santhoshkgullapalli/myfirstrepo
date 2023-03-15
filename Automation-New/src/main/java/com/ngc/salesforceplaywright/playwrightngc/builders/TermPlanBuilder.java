package com.ngc.salesforceplaywright.playwrightngc.builders;
import com.ngc.salesforceplaywright.playwrightngc.models.TermPlanDTO;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TermPlanBuilder {
    public static TermPlanDTO buildTermPlan(TermPlanDTO termPlan) {
        return TermPlanDTO.builder()
                .name(termPlan.getName())
                .creditType(termPlan.getCreditType())
                .planDescription(termPlan.getPlanDescription())
                .termPlanId(termPlan.getTermPlanId())
                .interestRate(termPlan.getInterestRate())
                .flatInterest(termPlan.getFlatInterest())
                .discontinued(termPlan.getDiscontinued())
                .active(termPlan.getActive())
                .parentTermPlan(termPlan.getParentTermPlan())
                .type(termPlan.getParentTermPlan())
                .build();
    }
}
