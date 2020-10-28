package biyesheji.controller;

import biyesheji.domain.User;
import biyesheji.service.AdministrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("register")
public class RegisterController {
    @Autowired
    AdministrationRepository administrationRepository;
    //跳转到注册页面
    @GetMapping
    public String register(Model model){
        model.addAttribute("register",new User());
        return "register";
    }
    //实现注册功能、注册完成跳转到登录页面
    @PostMapping
    public String register(User user){
        administrationRepository.saveOrUpdate(user);
        return "login";
    }
}
