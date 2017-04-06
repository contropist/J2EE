<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书管理系统</title>
	<!-- <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page"> -->
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- <style type="text/css">
		.a {
			color: white;
           	border-radius: 4px;
            text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
	 		background: rgb(66, 184, 221);
		}
	</style> -->
  </head>
  
  <body>
   <h3 class="text-center text-error">
				图书管理系统
			</h3>
   <hr>
   <form action="all.jsp" style="text-align: center;">
   	<input type="submit" value="查看所有图书" class="btn btn-lg btn-info">
   </form>
   <form action="add.jsp" style="text-align: center;">
   	<input type="submit" value="添加图书" class="btn btn-lg btn-info"   >
   </form>
   <form action="change.jsp" style="text-align: center;">
   	<input type="submit" value="修改图书" class="btn btn-lg btn-info">
   </form>
   <form action="delete.jsp" style="text-align: center;">
   	<input type="submit" value="删除图书" class="btn btn-lg btn-info ">
   </form>
  </body>
</html>
