package com.nojac.models;

import javax.persistence.*;

/**
 * Created by nickolas on 5/23/17.
 */
@Entity
@Table(name = "organizer")
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organizer_id", insertable = false)
    private long organizerId;



    public Organizer() {
        //default ctr
    }

    public long getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(long organizerId) {
        this.organizerId = organizerId;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "organizerId=" + organizerId +
                '}';
    }
}
