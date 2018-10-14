package edu.myspringjpa.demo;

import edu.myspringjpa.demo.repository.EmployeeRepository;
import edu.myspringjpa.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyspringjpademoApplication implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;


    public static void main(String[] args) {
        SpringApplication.run(MyspringjpademoApplication.class, args);
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {


        employeeService.getMaxSalaryOfaEmployee();
    }
}
