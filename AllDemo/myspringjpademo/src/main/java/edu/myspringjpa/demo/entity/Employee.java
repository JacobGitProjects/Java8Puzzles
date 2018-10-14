package edu.myspringjpa.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@SequenceGenerator(name = "emp_Sequence", sequenceName = "EMP_SEQ")
    @Column(name = "EMP_ID")
    private Long empId;

    @Column(name = "EMP_NAME", nullable = false)
    private String empName;

    @Column(name = "EMP_ADDRESS")
    private String empAddress;

    @Column(name = "EMP_SALARY")
    private Double empSalary;

    @Column(name = "EMP_DESIGNATION")
    private String empDesignation;

    @ManyToOne
    @JoinColumn(name = "DEPT_ID", foreignKey = @ForeignKey(name = "DEPT_ID_FK"))
    private Deportment deportment;


    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Deportment getDeportment() {
        return deportment;
    }

    public void setDeportment(Deportment deportment) {
        this.deportment = deportment;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empSalary=" + empSalary +
                ", empDesignation='" + empDesignation + '\'' +
                ", deportment=" + deportment +
                '}';
    }
}
