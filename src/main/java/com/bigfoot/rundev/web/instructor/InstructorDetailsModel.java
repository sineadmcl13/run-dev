package com.bigfoot.rundev.web.instructor;

import com.bigfoot.rundev.entities.Instructor;
import com.bigfoot.rundev.web.ABaseModel;

/**
 * Created by sineadmclaughlin on 30/01/2016.
 */
public class InstructorDetailsModel extends ABaseModel {

    public final static String KEY = "instructorDetailsModel";

    private Instructor instructor;

    @Override
    public void reset() {
        this.instructor = new Instructor();
    }

    @Override
    public String getKey() {
        return KEY;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
