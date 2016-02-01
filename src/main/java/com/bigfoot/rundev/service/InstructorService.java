package com.bigfoot.rundev.service;

import com.bigfoot.rundev.entities.Instructor;
import com.bigfoot.rundev.repositories.IInstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sineadmclaughlin on 30/01/2016.
 */
@Service
public class InstructorService implements IInstructorService{

    @Autowired
    private IInstructorRepo instructorRepo;


    @Override
    public Instructor getInstructorDetailsById(Long id) {
        return instructorRepo.findInstructorById(id);
    }
}
