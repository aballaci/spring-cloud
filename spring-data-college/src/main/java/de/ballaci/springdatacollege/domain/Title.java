package de.ballaci.springdatacollege.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author Armand.Ballaci
 */

@Embeddable
public class Title {

    @Column(name = "TITLE")
    private String title;

    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date toDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
