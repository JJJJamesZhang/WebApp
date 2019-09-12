package com.ss.controller;

import com.ss.entity.User;
import com.ss.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.printf("controller:" + username);
        System.out.printf("controller:" + password);

        if (new UserService().isValidUser(username,password)){
            HttpSession session = req.getSession();
            User user = new User();
            user.setUsername(username);
            session.setAttribute("user", user);
            req.setAttribute("username",username);
            req.getRequestDispatcher("/main.jsp").forward(req,resp);

        }else {
            resp.sendRedirect("/sep_java_web_app_war");
        }
//        req.setAttribute("username",username);
//        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
