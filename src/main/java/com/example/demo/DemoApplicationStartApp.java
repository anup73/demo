package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;

@SpringBootApplication (exclude = {//
DataSourceAutoConfiguration.class})
@ComponentScan("com")
public class DemoApplicationStartApp {

    public DemoApplicationStartApp() throws SQLException {
    }
    public static void main(String[] args) throws SQLException {

		SpringApplication.run(DemoApplicationStartApp.class, args);
        new DemoApplicationStartApp().useDataSource();
    }
    public void useDataSource() throws SQLException {
        System.out.println("datasource_driver_class_name :"+datasource_driver_class_name);
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/login_dev");
        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
        dataSourceBuilder.username("anup");
        dataSourceBuilder.password("root");

        DataSource dataSource = dataSourceBuilder.build();

        Connection conn = dataSource.getConnection();
        System.out.println(conn);
        Statement stat = conn.createStatement();
        String sql = "SELECT * from login";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getString("idlogin"));
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("address"));
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
        }

    }

}
