package com.bigfoot.rundev.service;

import com.bigfoot.rundev.entities.Course;

import java.util.List;

/**
 * Created by sineadmclaughlin on 29/01/2016.
 */
public interface ICourseService {

    List<Course> returnAllAvailableCourses();

    void save(Course course);
}
