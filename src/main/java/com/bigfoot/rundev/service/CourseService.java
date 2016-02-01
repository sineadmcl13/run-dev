package com.bigfoot.rundev.service;

import com.bigfoot.rundev.entities.Courses;
import com.bigfoot.rundev.repositories.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sineadmclaughlin on 29/01/2016.
 */
@Service
public class CourseService implements ICourseService {

    @Autowired
    private ICourseRepo courseRepo;

    @Override
    public List<Courses> returnAllAvailableCourses() {
        return courseRepo.findAll();
    }

    @Override
    public void create(Courses courses) {
        courseRepo.save(courses);
    }
}
