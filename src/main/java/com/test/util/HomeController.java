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
            public ModelAndView formhandler (@RequestParam("firstname")String firstname,
                                             @RequestParam("lastname") String lastname,
                                             @RequestParam("phonenumber") long phonenumber,
                                             @RequestParam("password") String password,
                                             @RequestParam("email")String email)
    {
        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("firstname", firstname);
        mv.addObject("lastname", lastname);
        mv.addObject("phonenumber", phonenumber);
        mv.addObject("email", email);
        mv.addObject("password", password);
        return mv;
    }


}