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
<title>Update Content</title>
</head>
<body>
<form action="<%=basePath%>content/changeContent" method="post">
<p><input type="hidden" name="id" value="${id }"></p>
<p><input type="hidden" name="contentId" value="${contentId }"></p>
<p>Content:<textarea name="content" rows="30" cols="80">${content }</textarea></p>
<p><input type="submit" value="submit"></p>
</form>
</body>
</html>