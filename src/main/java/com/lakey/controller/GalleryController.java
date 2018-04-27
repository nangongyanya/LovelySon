package com.lakey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/4/25.
 */

//@RestController
@Controller
public class GalleryController {

    @RequestMapping("/picture")
    public String picture(Model model) {
        return "picture";
    }

    @RequestMapping("/video")
    public String video(Model model) {
        return "video";
    }
}
