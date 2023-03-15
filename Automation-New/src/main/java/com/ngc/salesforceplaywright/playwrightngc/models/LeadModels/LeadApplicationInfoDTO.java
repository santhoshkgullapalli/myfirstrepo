package com.ngc.salesforceplaywright.playwrightngc.models.LeadModels;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class LeadApplicationInfoDTO {
    @JsonProperty
    private Boolean applicationHelpRequested;
    @JsonProperty
    private String helpRequestedOn;
    @JsonProperty
    private String awaitingCreditApproval;
    @JsonProperty
    private String isALicensedDealer;
}
