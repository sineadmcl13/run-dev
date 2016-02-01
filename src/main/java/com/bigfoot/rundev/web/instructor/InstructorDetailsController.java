package com.bigfoot.rundev.web.instructor;

import com.bigfoot.rundev.service.IInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by sineadmclaughlin on 30/01/2016.
 */
@Controller
@RequestMapping("/instructor")
public class InstructorDetailsController {

    private static String DETAILS = "instructor/details";

    @Autowired
    private IInstructorService instructorService;

    @ModelAttribute
    public void formBacking(ModelMap model) {

        InstructorDetailsModel instanceModel = new InstructorDetailsModel();
        instanceModel.retrieveOrCreate(model);

    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public String onListDisplay(@ModelAttribute(InstructorDetailsModel.KEY) InstructorDetailsModel model, @PathVariable("id") Long id){

        model.reset();
        model.setInstructor(instructorService.getInstructorDetailsById(id));
        return DETAILS;
    }


}
