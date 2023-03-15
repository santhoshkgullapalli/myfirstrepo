package com.ngc.salesforceplaywright.playwrightngc.discoverDatabase;

import java.util.List;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.ngc.salesforceplaywright.playwrightngc.models.BusinessInformationDTO;


public class DiscoverBusinessesDao {
    static final String SQL_GET_TERMINATED_SELLERS = "Select top 10 * from dbo.businesses where is_seller_terminated = 'true'";
    
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public DiscoverBusinessesDao() {
        jdbcTemplate.setDataSource(DiscoverDbConfig.dataSource());
    }
   
    public List<BusinessInformationDTO> findTerminatedBusinesses() {
        return jdbcTemplate.query(SQL_GET_TERMINATED_SELLERS, BeanPropertyRowMapper.newInstance(BusinessInformationDTO.class));
    }
    
}
