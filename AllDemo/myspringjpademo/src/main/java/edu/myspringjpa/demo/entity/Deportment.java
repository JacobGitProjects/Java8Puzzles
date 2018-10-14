package edu.myspringjpa.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "DEPORTMENT")
public class Deportment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPT_ID")
    private Long deptId;

    @Column(name = "DEPT_NAME", nullable = false, unique = true)
    private String dempName;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDempName() {
        return dempName;
    }

    public void setDempName(String dempName) {
        this.dempName = dempName;
    }

    @Override
    public String toString() {
        return "Deportment{" +
                "deptId=" + deptId +
                ", dempName='" + dempName + '\'' +
                '}';
    }
}
