package com.nojac.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nickolas on 5/23/17.
 */
@Entity
@Table(name = "calendar")
public class Calendar {

    @Id
    @Column(name = "calendar_id", insertable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long calendarId;

    @Column(name = "calendar_name")
    private String calendarName;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "calendar")
    private Set<NjEvent> njEvents= new HashSet<>(
            0);

    public Set<NjEvent> getNjEvents() {
        return njEvents;
    }

    public void setNjEvents(Set<NjEvent> njEvents) {
        this.njEvents = njEvents;
    }

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
