package biyesheji.controller;

import biyesheji.service.AdministrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdministrationRepository administrationRepository;
    @GetMapping
    public ModelAndView list(Model model,@RequestParam(value = "current", required =
            false, defaultValue = "1")Integer Statistic){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //主体名，即登录用户名
        model.addAttribute("name",name);
        model.addAttribute("page", administrationRepository.findAllUserByPage(Statistic,1));
        return new ModelAndView("admin/list");
    }
   /* ,@RequestParam(value = "current", required =
            false, defaultValue = "1")Integer Statistic*/
//    public String list(Model model) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        String name = auth.getName(); //主体名，即登录用户名
//        model.addAttribute("name",name);
////        model.addAttribute("page", administrationRepository.findAllUserByPage(Statistic,5));
//        return "admin/list";
//    }
}
