<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'a.jsp' starting page</title>
    
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
  		<form action="b.jsp" method="post">
    	用户名: 		<input type="text" name="username"><br>
    	密码: 		<input type="password" name="pwd"><br>
    	确认密码: 	<input type="password" name="pwdAgain"><br>
    	性别：		<input type="radio" name="sex" value="1" checked="checked">男
    				<input type="radio" name="sex" value="2">女<br/>
    	兴趣：		<input type="checkbox" name="运动" value="P" checked="checked">运动<br>
					<input type="checkbox" name="看电影" value="W">看电影<br>
    				<input type="checkbox" name="看书" value="S">看书<br>
    				<select name="xuanze">
					<option value="thu">清华大学</option>
					<option value="pku">北京大学</option>
					<option value="lntu">辽宁工程技术大学</option>
					</select>
    	<br/>
    	<input type="submit" name="submit" value="提交" > 
    	</form>
    
    
    
  </body>
</html>
