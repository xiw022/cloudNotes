<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加笔记内容</title>
</head>
<body>
<form action="<%=basePath%>content/saveContent" method="post">
<p><input type="text" name="contentId" value="${id }"></p>
<p>笔记标题：<input type="text" name="title" value=""></p>
<p>笔记内容:<textarea name="content" rows="10" cols="80"></textarea></p>
<p><input type="submit" value="提交"></p>
</form>
</body>
</html>