package com.nojac.models;

import javax.persistence.*;

/**
 * Created by nickolas on 5/23/17.
 */
@Entity
@Table(name = "attendant")
public class Attendant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendantId", insertable = false)
    private long attendantId;

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
