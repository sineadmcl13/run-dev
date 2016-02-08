package com.bigfoot.rundev.web.course;

import com.bigfoot.rundev.service.ICourseService;
import com.bigfoot.rundev.service.IInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/course")
public class CourseAddController {

    private static String COURSE_ADD = "course/add";
    private static String COURSE_LIST_REDIRECT = "redirect:/course/list";

    @Autowired
    private ICourseService courseService;

    @Autowired
    private IInstructorService instructorService;

    @ModelAttribute
    public void formBacking(ModelMap model) {

        CourseAddModel instanceModel = new CourseAddModel();
        instanceModel.retrieveOrCreate(model);

    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String onAddCourse(@ModelAttribute(CourseAddModel.KEY) CourseAddModel model){

        model.reset();
        model.setInstructorList(instructorService.findAll());
        return COURSE_ADD;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String onAddCoursePost(@ModelAttribute(CourseAddModel.KEY) CourseAddModel model){

        courseService.save(model.getCourse());
        return COURSE_LIST_REDIRECT;
    }


    
    
}
