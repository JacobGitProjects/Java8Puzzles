package edu.jacob.spring.securitydemo.securitydemo.service;

import edu.jacob.spring.securitydemo.securitydemo.entity.TestTable;
import edu.jacob.spring.securitydemo.securitydemo.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl {

    @Autowired
    private TestRepository repo;

    public List<TestTable> getAllTestTables() {
        System.out.println(" in side serviceimpl getAllTestTables()");
        return repo.findAll();
    }
}
