package com.lsj.persondemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class PersonPageController {


    @RequestMapping(value = "/personList",method = RequestMethod.GET)
    public ModelAndView personList(ModelAndView modelAndView){
        modelAndView.setViewName("/person/personList");
        return modelAndView;
    }

    @RequestMapping(value = "/personDetail",method = RequestMethod.GET)
    public ModelAndView personDetail(ModelAndView modelAndView){
        modelAndView.setViewName("/person/personDetail");
        return modelAndView;
    }


}
