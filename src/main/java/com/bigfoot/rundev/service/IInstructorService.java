package com.bigfoot.rundev.service;

import com.bigfoot.rundev.entities.Instructor;

/**
 * Created by sineadmclaughlin on 30/01/2016.
 */
public interface IInstructorService {

    Instructor getInstructorDetailsById(Long id);
}
