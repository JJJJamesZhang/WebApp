package com.ss.controller;

import javax.servlet.*;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        System.out.printf("filter:" + username);
        System.out.printf("filter:" + password);
        filterChain.doFilter(servletRequest,servletResponse);

    }
}
