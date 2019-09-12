package com.ss.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        PrintWriter ps = resp.getWriter();
        ps.println("Hello" + name + "id" + id);
    }
}
