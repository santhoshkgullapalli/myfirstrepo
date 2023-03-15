package com.ngc.salesforceplaywright.playwrightngc.discoverDatabase;

import lombok.experimental.UtilityClass;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@UtilityClass
public class DiscoverDbConfig {

    public static DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://uat.db.ngen.nextgearcapital.com;databaseName=ngc");
        dataSource.setUsername("DSCTESTLOGIN");
        dataSource.setPassword("Donut$4All");

        return dataSource;
    }
}
