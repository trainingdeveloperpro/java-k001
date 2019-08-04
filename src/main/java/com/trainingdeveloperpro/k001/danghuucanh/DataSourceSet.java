package com.trainingdeveloperpro.k001.danghuucanh;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
public class DataSourceSet {
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_example");
        dataSource.setUsername("springuser");
        dataSource.setPassword("ThePassword");

        return dataSource;
    }
}