package com.trainingdeveloperpro.k001.phamminhquoc.mainController;

import com.trainingdeveloperpro.k001.nguyenhoangtruong.model.MessageResponse;
import com.trainingdeveloperpro.k001.phamminhquoc.Employee;
import com.trainingdeveloperpro.k001.phamminhquoc.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// make this as rest controller

@RestController
@RequestMapping(path="/api/v1/employee") // This means URL's start with /user (after Application path)
public class MainController {

    // autowiring user repository
    @Autowired
    EmployeeDAO employeeDAO;

    // to test service is up and running
    @GetMapping
    public String check(){
        return "Welcome to Java Inspires";
    }

    @GetMapping(path = "/addemployee")
//    @ResponseBody
    public ResponseEntity<?> addemployee(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String address) {
        Employee emp = new Employee(id,firstName,lastName,address);
        employeeDAO.addEmplyeeUsingSimpelJdbcInsert(emp);
        return new ResponseEntity(new MessageResponse("Add successfull =)))))"), HttpStatus.BAD_REQUEST);
    }
    @GetMapping(path = "/addEmployee")
    public ResponseEntity<?> add() {
        employeeDAO.addEmplyeeUsingExecuteMethod();
        return new ResponseEntity(new MessageResponse("Add successfull :v"), HttpStatus.BAD_REQUEST);
    }
    /**
     * this method return list of usernames
     * @return usernameList
     */
    @GetMapping(path = "/getallemployee")
    public List<Employee> get(){
        return employeeDAO.getAllEmployees();
    }

}
