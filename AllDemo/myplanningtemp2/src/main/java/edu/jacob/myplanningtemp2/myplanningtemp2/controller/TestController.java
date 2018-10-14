package edu.jacob.myplanningtemp2.myplanningtemp2.controller;

import edu.jacob.myplanningtemp2.myplanningtemp2.entity.TestTable;
import edu.jacob.myplanningtemp2.myplanningtemp2.repo.TestRepository;
import edu.jacob.myplanningtemp2.myplanningtemp2.service.TestService;
import edu.jacob.myplanningtemp2.myplanningtemp2.service.TestServiceImpl;
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
