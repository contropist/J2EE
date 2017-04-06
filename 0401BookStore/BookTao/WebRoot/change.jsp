<%@ page language="java" import="java.util.*,me.importtao.dao.*,me.importtao.model.*" pageEncoding="UTF-8"%>
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	
	-->
<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
	.c{
		display:none;
	}
</style>
  </head>
  
  <body>
    <h3 class="text-center text-error">
				修改图书
			</h3>
   <hr>

<div style="width:250px;margin-left:auto;margin-right:auto;">
 <form role="form" action="servlet/Change" name="changeform" method="post">
 		<div class="form-group">
            <select name="id" class="btn btn-default" id="select" onchange="xianshi()"><option value="0">请选择你要修改的图书</option>
   <%
	List<Book> books =    BookDao.all();
	for(Book book : books){
		out.print("<option value="+book.getId()+">"+book.getId()+" "+book.getName()+"</option>");
	}
    %>
   </select>
   <%
   	for(Book book : books){
		out.print("<div class=\"c\" id=\""+book.getId()+"\"><div class=\"form-group\">"
          +" <label >书名:</label><input  class=\"form-control\"  name=\"name\" placeholder=\""+book.getName()+"\"/>"
       +" </div>"
        +" <div class=\"form-group\">"
           +" <label >定价:</label><input  class=\"form-control\"  name=\"price\" placeholder=\""+book.getPrice()+"\"/>"
        +" </div>"
        +" <div class=\"form-group\">"
           +" <label >作者:</label><input  class=\"form-control\"  name=\"author\" placeholder=\""+book.getAuthor()+"\"/>"
        +" </div>"
        +" <div class=\"form-group\">"
            +"<label >出版社:</label><input  class=\"form-control\"  name=\"bookConcern\" placeholder=\""+book.getBookConcern()+"\"/>"
        +" </div>"
        +" <div class=\"form-group\">"
           +" <label >库存:</label><input  class=\"form-control\" name=\"count\" placeholder=\""+book.getCount()+"\"/>"
        +" </div>"
        +" <div style=\"text-align: center;\">"
        	 +"<button type=\"submit\" class=\"btn btn-info btn-default\">修改</button>"
       +" </div></div>");
	}
   
    %>
        <!-- </div>
        <div class="form-group">
           <label >书名:</label><input  class="form-control"  name="name"/>
        </div>
        <div class="form-group">
           <label >定价:</label><input  class="form-control"  name="price" placeholder="等价"/>
        </div>
        <div class="form-group">
           <label >作者:</label><input  class="form-control"  name="author"/>
        </div>
        <div class="form-group">
           <label >出版社:</label><input  class="form-control"  name="bookConcern"/>
        </div>
        <div class="form-group">
           <label >库存:</label><input  class="form-control" name="count"/>
        </div>
        <div style="text-align: center;">
        	<button type="submit" class="btn btn-info btn-default">修改</button>
       </div>
       </div>  -->
      </form>
      </div>
      <script type="text/javascript">
      		var a = 1;
		function xianshi(){
		if(a!=0){
			var f_old = document.getElementById(a)//定位id
			f_old.style.display='none';
			var s = document.getElementById("select")//定位id
			var index = s.selectedIndex; // 选中索引
			var text = s.options[index].text; // 选中文本
			var value = s.options[index].value;
			a = value; // 选中值
			var f = document.getElementById(value)//定位id
			f.style.display='block';
			}
		}
      
      </script>
  </body>
</html>
