package biyesheji.controller;

import biyesheji.domain.User;
import biyesheji.service.AdministrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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
    public String register(User user,Model model){
        //进行BCrypt密码加密
        String hashpw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashpw);
        //判断一下用户名是否存在
        if (administrationRepository.getByUsername(user.getUsername()) == null) {

            administrationRepository.saveOrUpdate(user);
            return "login";
        }else {
            model.addAttribute("msg","用户名已存在");
            return "redirect:/register";
        }
    }
    //管理员页面注册功能
    @PostMapping("/PopUp")
    public String PopUp(User user,Model model){
        //进行BCrypt密码加密
        String hashpw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashpw);
        //判断一下用户名是否存在
        if (administrationRepository.getByUsername(user.getUsername()) == null) {
            administrationRepository.saveOrUpdate(user);
            return "redirect:/admin";
        }else {
            model.addAttribute("msg","用户名已存在");
            return "redirect:/admin";
        }
    }
}
