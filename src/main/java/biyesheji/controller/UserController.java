package biyesheji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping
    public ModelAndView home(){
        return new ModelAndView("user/home");
    }
    @GetMapping("/about")
    public ModelAndView about(){
        return new ModelAndView("user/about");
    }
    @GetMapping("/archive")
    public ModelAndView archive(){
        return new ModelAndView("user/archive");
    }
    @GetMapping("/tags")
    public ModelAndView tags(){
        return new ModelAndView("user/tags");
    }
    @GetMapping("/works")
    public ModelAndView works(){
        return new ModelAndView("user/works");
    }
}
