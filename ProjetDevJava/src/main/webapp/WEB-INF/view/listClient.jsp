<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Clients</title>
</head>
<body>
	<h1>liste des clients</h1>

	<c:forEach items="${clients}" var ="client">
		<p><c:out value="${client.id}"/></p>
		<p><c:out value="${client.nom}"/></p>
		<p><c:out value="${client.prenom}"/></p>
	</c:forEach>
</body>
</html>