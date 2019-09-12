
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<body>
    <form action="/sep_java_web_app_war/login" method="get">
        username: <input name="username" type="text"> <br/>
        password: <input name="password" type="password"><br/>
        <input type="submit" value="login">
    </form>
</body>
</html>
