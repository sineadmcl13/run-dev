package com.bigfoot.rundev.web.course;

import com.bigfoot.rundev.entities.Course;
import com.bigfoot.rundev.entities.Instructor;
import com.bigfoot.rundev.web.ABaseModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseAddModel extends ABaseModel implements Serializable {
    

    public final static String KEY = "courseAddModel";

    private Course course;
    private List<Instructor> instructorList;


    @Override
    public void reset() {
        this.course = new Course();
        this.instructorList = new ArrayList<>();
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

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }
}
