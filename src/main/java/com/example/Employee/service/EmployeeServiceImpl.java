package com.example.Employee.service;

import com.example.Employee.Exception.DataNotFoundException;
import com.example.Employee.dto.EmployeeDto;
import com.example.Employee.model.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void createEmployee(EmployeeDto employeeDto) {
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employeeList=employeeRepository.findAll();
        List<EmployeeDto>employeeDtoList=new ArrayList<>();
        for(Employee employee:employeeList){
            EmployeeDto employeeDto=new EmployeeDto();
            BeanUtils.copyProperties(employee,employeeDto);
            employeeDtoList.add(employeeDto);
        }
        return employeeDtoList;
    }

    @Override
    public EmployeeDto getEmployee(Integer id) {
        Optional<Employee> op=employeeRepository.findById(id);
        EmployeeDto employeeDto=new EmployeeDto();
        if(op.isPresent()){
            Employee employee=op.get();
            BeanUtils.copyProperties(employee,employeeDto);
        }
        return employeeDto;
    }
    @Override
    public String deleteById(Integer id) {
       Optional<Employee> optionalEmployee;
        optionalEmployee = employeeRepository.findById(id);

        if (optionalEmployee.isEmpty()){

            throw new DataNotFoundException("Can't Delete employee because No Employee exist with given id : " + id);
        }
        employeeRepository.deleteById(id);
        return "Employee deleted, id : " + id;


        }



    }

