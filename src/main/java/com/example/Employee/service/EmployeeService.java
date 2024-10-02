package com.example.Employee.service;

import com.example.Employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    void createEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getEmployee(Integer id);

    String deleteById(Integer id);
}
