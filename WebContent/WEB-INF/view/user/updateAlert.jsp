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
<title></title>
</head>
<body>
<h1>Please fill out the form completely</h1>
<form method="post" action="<%=basePath%>user/update">
<p>User ID:<input type="hidden" name="id" value="${createUser }"></p>
<p>User Name:<input type="text" name="userName" value="${userName}"></p>
<p>User Password:<input type="text" name="userPassword" value="${userPassword}"></p>
<p>Phone:<input type="text" name="phone" value="${phone}"></p>
<p>Email:<input type="text" name="email" value="${email}"></p>
<p><input type="submit" value="提交"></p>
</form>
</body>
</html>>