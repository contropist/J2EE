<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
 测试成功失败跳转
    <form action="/MyStruts/chapter1/HelloWorld">
    <input type="text" name="u.name"/>
    <input type="submit"/>
    </form>
    
 测试Add方法
    <form action="/MyStruts/chapter1/HelloWorld1">
    <input type="text" name="u.name"/>
    <input type="submit"/>
    </form>
    
 测试HttpServlet方式
	<form action="/MyStruts/chapter1/HelloWorld2">
    <input type="text" name="name"/>
    <input type="submit"/>
    </form>
<br/>
<a href="./label.jsp">Struts标签测试   </a>
  </body>
</html>
