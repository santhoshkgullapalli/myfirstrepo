package com.ngc.salesforceplaywright.playwrightngc.salesforceAPI;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;


@Data
@ToString(includeFieldNames=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SObjectBase {

    @JsonProperty(value="Id")
    protected String id;

    @JsonProperty(value="OwnerId")
    protected String ownerId;

    /**
     * The api name of the object in Salesforce required by force-rest-api
     * @return name
     */
    @JsonIgnore
    public abstract String getObjectName();
    
}