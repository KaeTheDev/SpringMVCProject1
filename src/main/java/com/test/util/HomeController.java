package com.test.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class HomeController
{

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Hello World");

    }

    @RequestMapping ("/userform")
    public ModelAndView userfom()
    {
        return new ModelAndView("form", "inst", "Please enter info: ");
    }

    @RequestMapping("/formhandler")
            public ModelAndView formhandler (@RequestParam("name")String name,
                                             @RequestParam("email")String email)
    {
        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("name", name);
        mv.addObject("email", email);
        return mv;
    }


}