package com.ngc.salesforceplaywright.playwrightngc.salesforceAPI;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SalesforceQueryHelper {

    private static final String FIND_USER_ID_BY_NAME_QUERY = "SELECT ID from User where FirstName = '%s' and LastName = '%s'";

    private static final String FIND_DEALER_ID_BY_BUSINESSNAME_QUERY = "SELECT ID from Dealer_Application__c where Exact_Legal_Name__c  = '%s'";

    private static final String QUERY_USER_BY_PROFILE = "SELECT Id, FirstName, LastName, Name, ProfileId, Profile.Name from User where Profile.Name = '%s' and IsActive = %b LIMIT 10";

    private static final String QUERY_USER_BY_ID = "SELECT Id, FirstName, LastName, Name, ProfileId, Profile.Name from User where Id = '%s' LIMIT 1";

    private static final String QUERY_PERMISSION_SET_BY_NAME = "SELECT Id From PermissionSet where Name = '%s' LIMIT 1";

    private static final String QUERY_USER_BY_PERMISSION_SET = "SELECT Id, PermissionSetId, AssigneeId, PermissionSet.Name FROM PermissionSetAssignment where PermissionSetId = '%s' LIMIT 10";

    public static String getUserIdQuery(String firstName, String lastName) {
        return String.format(FIND_USER_ID_BY_NAME_QUERY, firstName, lastName);
    }

    public static String getBusinessNameIdQuery(String businessName) {
        return String.format(FIND_DEALER_ID_BY_BUSINESSNAME_QUERY, businessName);
    }

    public static String getQueryUserByProfile(String profile, boolean activeUser) {
        return String.format(QUERY_USER_BY_PROFILE, profile, activeUser);
    }

    public static String getQueryUserById(String id) {
        return String.format(QUERY_USER_BY_ID, id);
    }

    public static String getQueryUserByPermissionSet(String id) {
        return String.format(QUERY_USER_BY_PERMISSION_SET, id);
    }

    public static String getQueryPermissionSetByName(String name) {
        return String.format(QUERY_PERMISSION_SET_BY_NAME, name);
    }
    
}
