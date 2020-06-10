<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Date</title>
		<link rel="stylesheet" type="text/css" href="css/date.css">
        <script type="text/javascript" src="js/date.js"></script>
	</head>
	<body>
		<h1>Hello from Date Template</h1>
		<p><c:out value="${day}"/>, the <c:out value="${dayNumber}"/> of <c:out value="${month}"/>, <c:out value="${year}"/></p>
	</body>
</html>