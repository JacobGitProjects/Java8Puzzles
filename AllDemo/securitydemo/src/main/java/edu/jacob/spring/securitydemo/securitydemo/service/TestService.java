package edu.jacob.spring.securitydemo.securitydemo.service;

import edu.jacob.spring.securitydemo.securitydemo.entity.TestTable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    List<TestTable> getAllTestTables();
}
