package edu.jacob.spring.securitydemo.securitydemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TEST_TABLE")
public class TestTable {

    @Id
    @GeneratedValue
    private Long testId;

    @Column(name = "TEST_NAME", nullable = false)
    private String testName;

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Override
    public String toString() {
        return "TestTable{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                '}';
    }
}
