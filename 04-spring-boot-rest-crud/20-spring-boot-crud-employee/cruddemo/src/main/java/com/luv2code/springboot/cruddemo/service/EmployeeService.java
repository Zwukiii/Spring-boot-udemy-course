package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {


    List<Employee> findAll();


    Employee findbyId(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
