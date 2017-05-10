<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="/struts-tags" %>


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
    <!--<form action="/struts/chapter1/HelloWorld">
    <input type="text" name="h.name"/>
    <input type="submit">
    </form>-->
  
    <c:form action="/chapter1/formAction">
  <c:label value="用户名："></c:label> <c:textfield name="username" label="用户名" /><br/>
    <c:label value="密码："></c:label><c:password name="password" label="密码"></c:password><br/>
    <c:label value="性别："></c:label><c:radio list="#{'1':'男','0':'女'}" name="gender" label="性别" value="1" /><br/>
    <c:label value="毕业院校："></c:label><c:select  name="school" list="#{'1':'清华','2':'辽宁工大'}" label="毕业院校" headerKey="0" headerValue="请选择"/>
    <br/>
    <c:label value="爱好："></c:label> 
   <c:checkbox  name="aihao" value="false" fieldValue="lanqiu" label="篮球"> </c:checkbox>
    <c:checkbox  name="aihao" value="true" fieldValue="zuqiu" label="足球"> </c:checkbox><br/>
    <c:submit value="submit" />
     <c:submit value="submit1" name="action:formAction!login"/>
    </c:form>
  </body>
</html>
