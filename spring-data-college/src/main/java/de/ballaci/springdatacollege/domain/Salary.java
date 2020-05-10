package de.ballaci.springdatacollege.domain;


import javax.persistence.*;
import java.util.Date;

@Embeddable
public class Salary {

    @Column(name="SALARY")
    private int salary;

    @Column(name="FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name="TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date toDate;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
