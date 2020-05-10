package de.ballaci.springdatacollege.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {

    @Id
    @Column(name="DEPT_NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String departmentNumber;

    @Column(name="DEPT_NAME")
    private String departmentName;

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
