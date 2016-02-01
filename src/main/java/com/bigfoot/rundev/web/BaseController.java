package com.bigfoot.rundev.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String onListDisplay(){

        return "redirect:/course/list";
    }
}
