<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Time</title>
		<link rel="stylesheet" type="text/css" href="css/time.css">
        <script type="text/javascript" src="js/time.js"></script>
	</head>
	<body>
		<h1>Hello from Time Template</h1>
		<p><c:out value="${hour}"/>:<c:out value="${minute}"/> <c:out value="${ampm}"/></p>
	</body>
</html>