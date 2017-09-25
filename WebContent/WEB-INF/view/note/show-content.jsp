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
<title>Note Content</title>
</head>
<body>
<form method="get" action="<%=basePath%>note/list">
<p><input type="hidden" name="id" value="${id }"></p>
<p><input type="submit" value="Back"></p>
</form>
<h1>Content List</h1>
<table border="1" style="width: 100%;">
<tr><td>ID</td><td>Content Title</td><td colspan="2" style="text-align: center;">Operation</td></tr>
<c:forEach items="${content }" var="content" varStatus="status">
<tr><td>${content.contentId}</td><td>${content.title }</td><td><a href="<%=basePath%>content/updateContent?id=${content.id }&contentId=${content.contentId}">Update Content</a></td><td><a href="<%=basePath%>content/delete?id=${content.id }&contentId=${content.contentId}">Delete Content</a></td></tr>
</c:forEach>
</table>
</body>
</html>