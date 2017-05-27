package com.nojac.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by nickolas on 5/23/17.
 */
@Entity
@Table(name = "nj_event")
public class NjEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", insertable = false)
    private long eventId;

    @ManyToOne
    @JoinColumn(name = "calendar_id", referencedColumnName = "calendar_id", foreignKey = @ForeignKey(name = "fk_calendar"))
    @JsonBackReference
//    , referencedColumnName = "stockId", foreignKey = @ForeignKey(name = "fk_stock")
    private Calendar calendar;

    @Column(name = "title")
    private String title;
    //required

    @Column(name = "description")
    private String description;

//    @Temporal(TemporalType.TIMESTAMP)
//    @Type(type="timestamp")
    @Column(name = "start_time")
    private String startTime;
    //required

//    @Temporal(TemporalType.TIMESTAMP)
//    @Type(type="timestamp")
    @Column(name = "end_time")
    private String endTime;

//    @ElementCollection
//    @CollectionTable(name="RepeatDays", joinColumns=@JoinColumn(name="eventId"))
//  mia lusi einai i apo pamw me element collection alla gia na pofugoume to join to vazw ws string (estw proswrina)
    @Column(name = "repeat_days")
    private String repeatDays;
    //size:7 mia thesi gia kathe mera tis evdomadas

    @Type(type="date")
    @Column(name = "start_date")
    private Date startDate;
    //required

    @Type(type="date")
    @Column(name = "end_date")
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

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRepeatDays() {
        return repeatDays;
    }

    public void setRepeatDays(String repeatDays) {
        this.repeatDays = repeatDays;
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
                ", repeatDays='" + repeatDays + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

}
