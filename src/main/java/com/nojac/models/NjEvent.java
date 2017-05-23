package com.nojac.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by nickolas on 5/23/17.
 */
@Entity
@Table(name = "nj_event")
public class NjEvent {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventId", insertable = false)
    private long eventId;

    @Column(name = "title")
    private String title;
    //required

    @Column(name = "description")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Type(type="timestamp")
    @Column(name = "startTime")
    private Date startTime;
    //required

    @Temporal(TemporalType.TIMESTAMP)
    @Type(type="timestamp")
    @Column(name = "endTime")
    private Date endTime;

    @Column(name = "repeat")
    private int[] repeat;
    //size:7 mia thesi gia kathe mera tis evdomadas

    @Type(type="date")
    @Column(name = "startDate")
    private Date startDate;
    //required

    @Type(type="date")
    @Column(name = "endDate")
    private Date endDate;

    //TODO thelei boolean gia to repeat?


    public NjEvent() {
        //def ctr
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int[] getRepeat() {
        return repeat;
    }

    public void setRepeat(int[] repeat) {
        this.repeat = repeat;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "NjEvent{" +
                "eventId=" + eventId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", repeat=" + Arrays.toString(repeat) +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
