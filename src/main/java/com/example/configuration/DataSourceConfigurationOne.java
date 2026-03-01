package com.example.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class DataSourceConfigurationOne {

    @Value("${spring.datasource.driver-class-name}")
    String datasource_driver_class_name;
    @Value("${spring.datasource.url}")
    public String datasource_url;
    @Value("${spring.datasource.username}")
    String datasource_username;
    @Value("${spring.datasource.password}")
    String datasource_password;


    public Connection getDataSouraceConenction() throws SQLException {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://mysqlawstestdb.cc3auwwyy8z2.us-east-1.rds.amazonaws.com:3306/testdbaws");
        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
        dataSourceBuilder.username("admin");
        dataSourceBuilder.password("admin1234");

        DataSource dataSource = dataSourceBuilder.build();

        Connection connection = dataSource.getConnection();
        return connection;
    }

}
