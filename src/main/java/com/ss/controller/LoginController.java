package com.ss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/do")
public class LoginController{


    @PostMapping("/login")
    public String handleLogin(@RequestParam(name = "username") String name, @RequestParam(name = "password") String password){
        System.out.println(name);
        System.out.println(password);
//        ModelAndView modelAndView = new ModelAndView();

        return "main";
    }

    @GetMapping("/logout")
    public String handleLogout(){
        return "index";
    }
}