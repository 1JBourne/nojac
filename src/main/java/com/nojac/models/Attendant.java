package com.nojac.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nickolas on 5/23/17.
 */
@Entity
@Table(name = "attendant")
public class Attendant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendant_id", insertable = false)
    private long attendantId;

    @ManyToMany(mappedBy="attendants")
    @JsonIgnoreProperties("attendants")
    private Set<NjEvent> events = new HashSet<>(0);

    public Set<NjEvent> getEvents() {
        return events;
    }

    public void setEvents(Set<NjEvent> events) {
        this.events = events;
    }

    //role?

    public Attendant() {
        //default ctr
    }

    public long getAttendantId() {
        return attendantId;
    }

    public void setAttendantId(long attendantId) {
        this.attendantId = attendantId;
    }

    @Override
    public String toString() {
        return "Attendant{" +
                "attendantId=" + attendantId +
                '}';
    }

}
