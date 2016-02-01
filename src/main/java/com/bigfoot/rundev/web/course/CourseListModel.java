package com.bigfoot.rundev.web.course;

import com.bigfoot.rundev.entities.Courses;
import com.bigfoot.rundev.web.ABaseModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseListModel extends ABaseModel implements Serializable {
    

    public final static String KEY = "courseListModel";

    private List<Courses> coursesList;

    @Override
    public void reset() {
        this.coursesList = new ArrayList<>();
    }

    @Override
    public String getKey() {
        return KEY;
    }


    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }
}
