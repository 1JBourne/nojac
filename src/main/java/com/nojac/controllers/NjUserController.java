package com.nojac.controllers;

import com.nojac.models.NjUser;
import com.nojac.repositories.NjUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nickolas on 5/22/17.
 */
@RestController
@RequestMapping("/users")
public class NjUserController {

    @Autowired
    private NjUserRepository njUserRepository;


//    public NjUserController(NjUserRepository njUserRepository) {
//        this.njUserRepository = njUserRepository;
//    }   //have the constructor autowired instead of having the field itself

    @RequestMapping(method = RequestMethod.GET)
    public List<NjUser> findAllUsers() {
        return njUserRepository.findAll();
    }






}
