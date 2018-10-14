package edu.jacob.spring.securitydemo.securitydemo.repo;


import edu.jacob.spring.securitydemo.securitydemo.entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestTable, Long> {
}
