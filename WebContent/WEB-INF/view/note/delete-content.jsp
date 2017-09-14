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
<title>删除笔记</title>
</head>
<body>
<form action="<%=basePath%>content/deleteContent" method="post">
<p><input type="hidden" name="id" value="${id }"></p>
<p><input type="hidden" name="contentId" value="${contentId }"></p>
<p><input type="submit" value="确认"></p>
</form>
<form action="<%=basePath%>content/showContent" method="get">
<p><input type="hidden" name="id" value="${contentId }"></p>
<p><input type="submit" value="返回"></p>
</form>
</body>
</html>