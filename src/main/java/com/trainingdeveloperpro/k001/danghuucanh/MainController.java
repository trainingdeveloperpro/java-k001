package com.trainingdeveloperpro.k001.danghuucanh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// make this as rest controller

@RestController
@RequestMapping(path="/user") // This means URL's start with /user (after Application path)
public class MainController {

    // autowiring user repository
    @Autowired
    UserRepository userRepository;
    DataSourceSet dataSourceSet = new DataSourceSet();
    SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSourceSet.mysqlDataSource()).withTableName("user");

    // to test service is up and running
    @GetMapping
    public String check(){
        return "Welcome to Java Inspires";
    }

    /**
     * this method return list of usernames
     * @return usernameList
     */
    @GetMapping(path = "/getusernames")
    public List<String> getAllUserNames(){
        return userRepository.getAllUserNames();
    }

    @GetMapping(path = "/adduser")
    public int addAUser(@RequestParam int id, @RequestParam String name, @RequestParam String email){
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("id", id);
        parameters.put("name",name);
        parameters.put("email",email);

        return simpleJdbcInsert.execute(parameters);
    }
}