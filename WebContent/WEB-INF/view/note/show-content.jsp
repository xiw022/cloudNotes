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
<title>笔记内容</title>
</head>
<body>
<h1>笔记内容列表</h1>
<table border="1" style="width: 100%;">
<tr><td>ID</td><td>内容标题</td><td colspan="2" style="text-align: center;">操作</td></tr>
<c:forEach items="${content }" var="content" varStatus="status">
<tr><td>${content.contentId}</td><td>${content.title }</td><td><a href="<%=basePath%>content/updateContent?id=${content.id }&contentId=${content.contentId}">更新内容</a></td><td><a href="<%=basePath%>content/delete?id=${content.id }&contentId=${content.contentId}">删除内容</a></td></tr>
</c:forEach>
</table>
</body>
</html>