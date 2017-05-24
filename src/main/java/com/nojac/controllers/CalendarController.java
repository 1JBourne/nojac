package com.nojac.controllers;

import com.nojac.models.Calendar;
import com.nojac.repositories.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nickolas on 5/24/17.
 */
@RestController
@RequestMapping("/calendars")
public class CalendarController {

    @Autowired
    private CalendarRepository calendarRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Calendar>> getAllCalendars() {
        return new ResponseEntity<>( calendarRepository.findAll(), HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<?> addCalendar(@RequestBody Calendar calendar) {
//
//    }

}
