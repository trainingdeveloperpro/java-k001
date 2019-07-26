package com.trainingdeveloperpro.k001.danghuucanh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    /**
     * autowiring jdbc teamplate
     * using the properties have configured in application.properties spring
     * automatically detects and creates jdbc template object using the configuration
     */

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * return list of user names
     * @return usernameList
     */

    public List<String > getAllUserNames(){
        List<String > usernameList = new ArrayList<>();
        usernameList.addAll(jdbcTemplate.queryForList("SELECT name FROM user;", String.class));
        return usernameList;
    }
}