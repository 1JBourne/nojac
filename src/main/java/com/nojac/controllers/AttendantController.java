package com.nojac.controllers;

import com.nojac.models.Attendant;
import com.nojac.repositories.AttendantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nickolas on 5/23/17.
 */
@RestController
@RequestMapping("/attendants")
public class AttendantController {

    @Autowired
    private AttendantRepository attendantRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Attendant>> getAllEvents() {
        return new ResponseEntity<>( attendantRepository.findAll(), HttpStatus.OK);
    }
}
