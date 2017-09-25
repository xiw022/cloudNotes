<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Note List</title>
</head>
<body>
<h1>Note List</h1>
<form method="post" action="<%=basePath%>note/add">
<p><input type="hidden" name="createUser" value="${createUser }"></p>
<p><input type="submit" value="Add Note"></p>
</form>
<form method="post" action="<%=basePath%>user/updatePage">
<p><input type="hidden" name="createUser" value="${createUser }"></p>
<p><input type="submit" value="Edit Personal Information"></p>
</form>
<table border="1" style="width: 100%;">
<tr><td>ID</td><td>Note Name</td><td>Last Update Time</td><td colspan="4" style="text-align: center;">Operation</td></tr>
<c:forEach items="${notes }" var="note" varStatus="status">
<tr><td>${status.index+1}</td><td>${note.noteName }</td><td><fmt:formatDate value="${note.createTime }" /></td><td><a href="<%=basePath%>note/update?id=${note.id }&createUser=${createUser }">Change Note Name</a></td><td><a href="<%=basePath%>note/delete?id=${note.id }&createUser=${createUser }">Delete Note</a></td><td><a href="<%=basePath%>content/addContent?id=${note.id}&createUser=${createUser }">Add Content</a></td><td><a href="<%=basePath%>content/showContent?id=${note.id}&createUser=${createUser }">Content</a></td></tr>
</c:forEach>
</table>
</body>
</html>