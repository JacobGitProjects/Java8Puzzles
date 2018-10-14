package edu.jacob.spring.securitydemo.securitydemo.controller;

import edu.jacob.spring.securitydemo.securitydemo.entity.TestTable;
import edu.jacob.spring.securitydemo.securitydemo.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(TestController.BASE_URL)
public class TestController {

    public static final String BASE_URL = "/testp";



    @Autowired
    TestRepository repo;

    /*@Autowired
    public TestController(TestService service1) {
        this.service = service1;

    }*/

    @GetMapping("/all")
    List<TestTable> getAllTestTables(){
        System.out.println(" in side controller getAllTestTables()");
        return repo.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    TestTable saveTestTable(@RequestBody TestTable table) {
        System.out.println(" in side controller saveTestTable()"+table);
        return repo.save(table);
    }
}
