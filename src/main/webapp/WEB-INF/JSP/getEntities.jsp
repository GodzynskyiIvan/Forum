<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NoWorkForum - all Entities</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Value</th>
			<th></th>
		</tr>
	
		<c:forEach var="ent" items="${entities}">
			<tr>
				<td>${ent.id}</td>
				<td>${ent.value}</td>
				<td><a href="edit?id=${ent.id}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>

<a href="add">CREATE</a>

</body>
</html>