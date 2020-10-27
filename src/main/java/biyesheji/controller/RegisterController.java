package biyesheji.controller;

import biyesheji.domain.User;
import biyesheji.service.AdministrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @Autowired
    AdministrationRepository administrationRepository;
    @RequestMapping("/register")
    public String register(User user){
        administrationRepository.saveOrUpdate(user);
        return "admin/list";
    }
}
