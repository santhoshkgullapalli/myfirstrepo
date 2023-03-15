package com.ngc.salesforceplaywright.playwrightngc.salesforceAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.force.api.ApiConfig;
import com.force.api.ApiException;
import com.force.api.ForceApi;

@Service
@RequiredArgsConstructor
public class SalesforceService {

        private ForceApi api;
    
        private String username;
        private String password;
        private String clientId;
        private String clientSecret;
        private String endpoint;
    
        public SalesforceService(String username, String password, String clientId, String clientSecret, String endpoint) {
            this.username = username;
            this.password = password;
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.endpoint = endpoint;
        }
    
        /**
         * You can manually initialize your own ForceApi object if you don't want to do this in a way provided by the other constructor
         * @param api The ForceApi object, which represents a api user's session with Salesforce. See https://github.com/jesperfj/force-rest-api/ for more info
         */
        public SalesforceService(ForceApi api) {
            this.api = api;
        }
    
        public Optional<List<Map>> query(String query) {
            initialize();
            try {
                var result = api.query(query);
                return Optional.ofNullable((result.getTotalSize() == 0 ) ? null : result.getRecords());
            }
            catch(ApiException ae) {
               
                return Optional.empty();
            }
        }
     
        public <T extends SObjectBase> Optional<T> retrieve(String id, Class<T> clazz) {
            initialize();
            try {
                 return Optional.of(api.getSObject(getSobjectString(clazz), id).as(clazz));
            }
            catch(ApiException ae) {
                // probably doesn't exist:
                
                return Optional.empty();
            }
        }
    
        public <T extends SObjectBase> String create(T objectToAdd, Class<T> clazz) {
            initialize();
            try {
                return api.createSObject(getSobjectString(clazz), objectToAdd);
            }
            catch(ApiException ae) {
                
                throw ae;
            }
        }
    
        public <T extends SObjectBase> void update(T objectToUpdate, String id, Class<T> clazz) {
            initialize();
            try {
                api.updateSObject(getSobjectString(clazz), id, objectToUpdate);
            }
            catch(ApiException ae) {
                
                throw ae;
            }
        }
    
        public <T extends SObjectBase> void delete(String id, Class<T> type) {
            initialize();
            boolean deleted = true;
    
            try {
                api.deleteSObject(getSobjectString(type), id);
            }
            catch(ApiException ae) {
                // probably nothing to delete

                throw ae;
            }
        }
    
        /*
         * We're going to lazily initialize the ForceApi class, and therefore we will not
         * incur time penalty for doing oauth authentication unless we really need to
         */
        private synchronized void initialize() {
            if(api == null) {
              
                api = new ForceApi(new ApiConfig()
                        .setUsername(username)
                        .setPassword(password)
                        .setClientId(clientId)
                        .setClientSecret(clientSecret)
                        .setLoginEndpoint(endpoint)
                        );
            }
        }
    
        /**
         * Mostly for internal use. Get's the Force object type from the SObjectBase class
         * @param clazz
         * @return The Force api class name
         */
        public String getSobjectString(Class<? extends SObjectBase> clazz) {
            SObjectBase baseObj = null;
            try {
                Constructor<?> cons = clazz.getConstructor();
                 baseObj = (SObjectBase) cons.newInstance(new Object[] {});
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new RuntimeException("Something bad happened, and I don't really know how to handle it ...", e);
            }
    
            if(baseObj.getObjectName() == null || baseObj.getObjectName().trim().isEmpty())
                throw new RuntimeException("You need your object: " + baseObj.getClass() + " to include a Salesforce type string");
            return baseObj.getObjectName();
        }
    
}
