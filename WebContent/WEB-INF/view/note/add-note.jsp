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
<title>Add Note</title>
</head>
<body>
<form action="<%=basePath%>note/save" method="post">
<p>笔记本名称:<input type="hidden" name="createUser" value="${createUser }"></p>
<p>Note Name:<input type="text" name="noteName" value=""></p>
<p><input type="submit" value="submit"></p>
</form>
</body>
</html>