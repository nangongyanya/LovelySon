package com.lakey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/4/25.
 */

//@RestController
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("username", "李明");
        return "index";
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index", "username", "李明");
    }
}
