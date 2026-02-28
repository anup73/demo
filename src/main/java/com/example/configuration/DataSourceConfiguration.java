package com.example.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Value("${spring.datasource.driver-class-name}")
    String datasource_driver_class_name;
    @Value("${spring.datasource.url}")
    String datasource_url;
    @Value("${spring.datasource.username}")
    String datasource_username;
    @Value("${spring.datasource.password}")
    String datasource_password;
    public DataSource getDataSourace()
    {

    }

}
