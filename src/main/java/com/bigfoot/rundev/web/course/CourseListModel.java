package com.bigfoot.rundev.web.course;

import com.bigfoot.rundev.entities.Course;
import com.bigfoot.rundev.web.ABaseModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseListModel extends ABaseModel implements Serializable {
    

    public final static String KEY = "courseListModel";

    private List<Course> courseList;

    @Override
    public void reset() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public String getKey() {
        return KEY;
    }


    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
