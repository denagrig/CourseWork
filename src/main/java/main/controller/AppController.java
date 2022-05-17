package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @GetMapping(value = {"/"})
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("MainPage");
        return model;
    }
}