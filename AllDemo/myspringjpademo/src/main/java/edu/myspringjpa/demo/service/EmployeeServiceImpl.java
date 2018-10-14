package edu.myspringjpa.demo.service;

import edu.myspringjpa.demo.entity.Deportment;
import edu.myspringjpa.demo.entity.Employee;
import edu.myspringjpa.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;


    public OptionalDouble getMaxSalaryOfaEmployee() {

        OptionalDouble d = getAllEmployees().stream().filter(e -> e.getEmpSalary()!=null).mapToDouble(e -> e.getEmpSalary()).max();


        //getAllEmployees().stream().collect(Collectors.collectingAndThen(Collectors.groupingBy(Employee::getDeptId), (Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary))));

        //List<Employee> temp = getAllEmployees().stream().filter(e -> e.getEmpSalary()!=null).collect(Collectors.toList());

        Map<Deportment, Optional<Employee>> map = getAllEmployees()
                                                    .stream()
                                                    .collect(
                                                            Collectors.groupingBy(Employee::getDeportment,
                                                                    Collectors.maxBy(Comparator.comparing(
                                                                            Employee::getEmpSalary, Comparator.nullsFirst(Comparator.naturalOrder())
                                                                            )
                                                                    )
                                                            )
                                                    );

        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue() != null ? e.getValue() : "");
        }


        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long empId) {
        return employeeRepository.getOne(empId);
    }
}
