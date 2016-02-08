package com.bigfoot.rundev.web.course;

import com.bigfoot.rundev.entities.Course;
import com.bigfoot.rundev.web.ABaseModel;

import java.io.Serializable;

public class CourseAddModel extends ABaseModel implements Serializable {
    

    public final static String KEY = "courseAddModel";

    private Course course;

    @Override
    public void reset() {
        this.course = new Course();
    }

    @Override
    public String getKey() {
        return KEY;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
