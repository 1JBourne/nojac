package com.nojac.controllers;

import com.nojac.models.NjEvent;
import com.nojac.repositories.NjEventRepository;
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
@RequestMapping("/events")
public class NjEventController {

    @Autowired
    private NjEventRepository eventRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<NjEvent>> getAllEvents() {
        return new ResponseEntity<>( eventRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addEvent(@RequestBody NjEvent njEvent) {
        return new ResponseEntity<>(eventRepository.save(njEvent), HttpStatus.CREATED);
    }

}
