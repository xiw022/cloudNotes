<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test主页</title>
</head>
<body>
<h1>测试页面</h1>
<c:forEach items="${list.rows }" var="l">
<h5>id:${l.id }------name:${l.name }</h5>
</c:forEach>
</body>
</html>