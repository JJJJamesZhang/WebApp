<%@ page import="com.ss.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: vn0hk3g
  Date: 2019-09-11
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%
    User user = (User) request.getSession().getAttribute("user");
    if (user == null){
        response.sendRedirect("/sep_java_web_app_war");
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>Hello</h1>
    <% User user1 = (User)request.getSession().getAttribute("user"); out.print(user1.getUsername());%>
</body>
</html>
