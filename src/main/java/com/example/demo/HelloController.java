package com.example.demo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@RestController
@RequestMapping(value = "/test")
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    /*@RequestMapping(value = "/login")
   public String login(){
        return "login";
    }*/
    @RequestMapping(value = "/login")
    public ModelAndView login(Model model, HttpServletRequest request, HttpServletResponse rqsponce) throws IOException {
        //  responce.sendRedirect("/templates/login");
        return new ModelAndView("login");
    }
}
