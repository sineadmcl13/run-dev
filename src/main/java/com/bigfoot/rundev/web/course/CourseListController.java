package com.bigfoot.rundev.web.course;

import com.bigfoot.rundev.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/course")
public class CourseListController {

    private static String LIST = "course/list";

    @Autowired
    private ICourseService courseService;

    @ModelAttribute
    public void formBacking(ModelMap model) {

        CourseListModel instanceModel = new CourseListModel();
        instanceModel.retrieveOrCreate(model);

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String onListDisplay(@ModelAttribute(CourseListModel.KEY) CourseListModel model){

        model.reset();
        model.setCoursesList(courseService.returnAllAvailableCourses());
        return LIST;
    }


    
    
}
