package com.ngc.salesforceplaywright.playwrightngc.enums.LeadEnums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum LeadOpportunityLevel {
   NONE("--NONE--"),
   HOT("Hot"),
   WARM("Warm"),
   COLD("Cold");

   @Getter
   private String value;
}
