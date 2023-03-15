package com.ngc.salesforceplaywright.playwrightngc.discoverDatabase;

import java.util.List;

import javax.sql.DataSource;

import com.ngc.salesforceplaywright.playwrightngc.models.BusinessInformationDTO;

public interface IDiscoverBusinessesDao {
    public void setDataSource(DataSource ds);
    List<BusinessInformationDTO> findTerminatedBusinesses();
}
