package com.nojac.controllers;

import com.nojac.models.NjEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nickolas on 5/24/17.
 */
@RestController
@RequestMapping("/events")
public class NjEventRepository {

    @Autowired
    private NjEventRepository njEventRepository;


}
