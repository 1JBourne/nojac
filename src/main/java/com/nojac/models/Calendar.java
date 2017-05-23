package com.nojac.models;

import javax.persistence.*;

/**
 * Created by nickolas on 5/23/17.
 */
@Entity
@Table(name = "calendar")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calendarId", insertable = false)
    private long calendarId;

    @Column(name = "calendarName")
    private String calendarName;

    @Column(name = "type")
    private String type;

    public Calendar() {
        //def ctr
    }

    public long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "calendarId=" + calendarId +
                ", calendarName='" + calendarName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
