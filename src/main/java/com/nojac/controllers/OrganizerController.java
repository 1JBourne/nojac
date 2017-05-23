package com.nojac.controllers;

import com.nojac.repositories.NjUserRepository;
import com.nojac.repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nickolas on 5/23/17.
 */
@RestController
@RequestMapping("/organizers")
public class OrganizerController {

    @Autowired
    private OrganizerRepository organizerRepository;


}
