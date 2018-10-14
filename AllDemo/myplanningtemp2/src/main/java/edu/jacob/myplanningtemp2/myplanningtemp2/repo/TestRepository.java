package edu.jacob.myplanningtemp2.myplanningtemp2.repo;


import edu.jacob.myplanningtemp2.myplanningtemp2.entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestTable, Long> {
}
