package com.example.demo;
import com.example.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class LoginController {
//    @RequestMapping(value = "login")
//    public String login(@RequestParam(value = "u_id") String u_id ,@RequestParam(value = "u_pwd") String u_pwd) {
//        if (u_id .equals("a")&&u_pwd.equals("b") )
//            return "success";
//        return "false";
//    }
    /**
     * 用户登陆传值
     * @param model
     * @param u_id
     * @param u_pwd
     * @return
     */
        @RequestMapping(value = "login")
        public ModelAndView login(Model model,@RequestParam(value = "u_id") String u_id , @RequestParam(value = "u_pwd") String u_pwd) {
            if (u_id .equals("a")&&u_pwd.equals("b") ) {
                model.addAttribute("u_id", u_id);
                model.addAttribute("u_pwd", u_pwd);
                return new ModelAndView("selectUser");
            }
            return new ModelAndView("index");
        }
}
