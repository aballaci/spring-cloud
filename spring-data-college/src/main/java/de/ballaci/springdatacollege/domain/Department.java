package de.ballaci.springdatacollege.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

    @ManyToMany(mappedBy = "departments")
    @JsonBackReference
    private List<Employee> employees;

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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
