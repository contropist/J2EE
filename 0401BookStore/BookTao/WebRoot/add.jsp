<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  </head>
  
  <body>
   <h3 class="text-center text-error">
				添加图书
			</h3>
   <hr>
  
<div style="width:250px;margin-left:auto;margin-right:auto;">
 <form role="form" action="servlet/Add" name="addform" method="post">
 		
        <div class="form-group">
           <label >书名:</label><input  class="form-control"  name="name"/>
        </div>
        <div class="form-group">
           <label >定价:</label><input  class="form-control"  name="price"/>
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
      		 <button type="submit" class="btn btn-info btn-default">添加</button>
		</div>      
       </div> 
      </form>
      </div>
  </body>
</html>
