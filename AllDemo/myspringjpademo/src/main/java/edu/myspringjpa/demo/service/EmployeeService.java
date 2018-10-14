package edu.myspringjpa.demo.service;

import edu.myspringjpa.demo.entity.Employee;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.OptionalDouble;


public interface EmployeeService {

    OptionalDouble getMaxSalaryOfaEmployee();

    List<Employee> getAllEmployees();

    Employee getEmployee(Long empId);

}
