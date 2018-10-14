package edu.jacob.myplanningtemp2.myplanningtemp2.service;

import edu.jacob.myplanningtemp2.myplanningtemp2.entity.TestTable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TestService {

    List<TestTable> getAllTestTables();
}
