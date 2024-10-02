package com.example.Employee.controller;

import com.example.Employee.dto.EmployeeDto;
import com.example.Employee.model.Employee;
import com.example.Employee.model.MyUser;
import com.example.Employee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
// repo
   @PostMapping("/create")
    public void createEmployee(@RequestBody EmployeeDto employeeDto){


   }

}
