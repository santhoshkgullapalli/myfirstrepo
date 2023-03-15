package com.ngc.salesforceplaywright.playwrightngc.discoverDatabase;

import lombok.Data;

@Data
public class DiscoverDbService {
    DiscoverBusinessesDao discoverBusinessesDao;
    
    public DiscoverDbService() {
        this.discoverBusinessesDao = new DiscoverBusinessesDao();
    }
}
