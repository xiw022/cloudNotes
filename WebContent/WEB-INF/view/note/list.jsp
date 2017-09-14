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
<title>笔记本列表</title>
</head>
<body>
<h1>笔记本列表</h1>
<form method="post" action="<%=basePath%>note/add">
<p><input type="text" name="createUser" value="${createUser }"></p>
<p><input type="submit" value="添加笔记"></p>
</form>
<form method="post" action="<%=basePath%>user/updatePage">
<p><input type="hidden" name="createUser" value="${createUser }"></p>
<p><input type="submit" value="编辑个人信息"></p>
</form>
<table border="1" style="width: 100%;">
<tr><td>ID</td><td>笔记本名称</td><td>创建时间</td><td colspan="4" style="text-align: center;">操作</td></tr>
<c:forEach items="${notes }" var="note" varStatus="status">
<tr><td>${status.index+1}</td><td>${note.noteName }</td><td><fmt:formatDate value="${note.createTime }" /></td><td><a href="<%=basePath%>note/update?id=${note.id }&createUser=${createUser }">更新笔记</a></td><td><a href="<%=basePath%>note/delete?id=${note.id }&createUser=${createUser }">删除笔记</a></td><td><a href="<%=basePath%>content/addContent?id=${note.id}&createUser=${createUser }">新增笔记内容</a></td><td><a href="<%=basePath%>content/showContent?id=${note.id}&createUser=${createUser }">查看笔记内容</a></td></tr>
</c:forEach>
</table>
</body>
</html>