package edu.jacob.myplanningtemp2.myplanningtemp2.service;

import edu.jacob.myplanningtemp2.myplanningtemp2.entity.TestTable;
import edu.jacob.myplanningtemp2.myplanningtemp2.repo.TestRepository;
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
