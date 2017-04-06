<%@ page language="java" import="java.util.*,me.importtao.dao.BookDao,me.importtao.model.Book" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

  </head>
  
  <body>
    <h3 class="text-center text-error">
				图书信息
			</h3>
   <hr>
  <div style="text-align: center;">
  	<table class="table" style="margin: auto;" id="table1">
  		<thead>
  		<tr>
  			<th>ID</th>
  			<th>书名</th>
  			<th>作者</th>
  			<th>价格</th>
  			<th>出版社</th>
  			<th>存放数量</th>
  		</tr>
  		</thead>
  		<%
  			int line = 1;
  			List<Book> books =BookDao.all();
  			for(Book book : books){
  				if(line%2==0){
  					out.print("<tr class=\"success\">");
  				}else{
					 out.print("<tr >"); 				
  				}
  				
  				out.print("<td>"+book.getId()+"</td>");
  				out.print("<td>"+book.getName()+"</td>");
  				out.print("<td>"+book.getAuthor()+"</td>");
  				out.print("<td>"+book.getPrice()+"</td>");
  				out.print("<td>"+book.getBookConcern()+"</td>");
  				out.print("<td>"+book.getCount()+"</td>");
  				out.print("</tr>");
  				line++;
  			}
  		 %>
  	</table>
  </div>
  </body>
</html>
