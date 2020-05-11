package de.ballaci.springdatacollege.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Armand.Ballaci
 */

@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @Column(name = "EMP_NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeNumber;

    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;


    @Column(name = "HIRE_DATE")
    @Temporal(TemporalType.DATE)
    private Date hireDate;

    @ElementCollection
    @CollectionTable(
            name = "SALARIES",
            joinColumns = @JoinColumn(name = "EMP_NO")
    )
    private List<Salary> salaries;

    @ElementCollection
    @CollectionTable(
            name = "TITLES",
            joinColumns = @JoinColumn(name = "EMP_NO")
    )
    private List<Title> titles;

    @ManyToMany
    @JoinTable(
            name = "DEPT_EMP",
            joinColumns = @JoinColumn(name = "EMP_NO"),
            inverseJoinColumns = @JoinColumn(name = "DEPT_NO"))
    @JsonManagedReference
    private List<Department> departments;

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
