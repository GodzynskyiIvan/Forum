<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NoWorkForum - Edit?id=${testEntity.id}</title>
</head>
<body>

<form action="testEntity/edit" method="POST">
		TestEntity value: 
		<input type = "text" name = "value"/><br>
		<input type="hidden" name = "id" value="${testEntity.id}"/>
		
		<input name="ADD" type="submit"/>
	</form>
</body>
</html>