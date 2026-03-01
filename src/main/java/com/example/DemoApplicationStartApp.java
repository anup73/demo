package com.example;

import com.example.configuration.DataSourceConfigurationOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication (exclude = {//
DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
@ComponentScan("com")
public class DemoApplicationStartApp {

    public DemoApplicationStartApp() throws SQLException {
    }
    public static void main(String[] args) throws SQLException {

		SpringApplication.run(DemoApplicationStartApp.class, args);

        new DemoApplicationStartApp().useDataSource();
    }
  /*  public void useDataSource() throws SQLException {
        DataSourceConfigurationOne datasourceconfigObject = new DataSourceConfigurationOne() ;
        Statement stat = datasourceconfigObject.getDataSouraceConenction().createStatement();
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

    }*/
  public void useDataSource() throws SQLException {
      DataSourceConfigurationOne datasourceconfigObject = new DataSourceConfigurationOne();
      Statement stat = datasourceconfigObject.getDataSouraceConenction().createStatement();
      String sql = "SELECT * from testdbaws";
      ResultSet rs = stat.executeQuery(sql);
      while (rs.next()) {
          System.out.println(rs.getInt("ID"));
          System.out.println(rs.getString("name"));
          System.out.println(rs.getString("username"));
          System.out.println(rs.getString("password"));
      }
  }
}
