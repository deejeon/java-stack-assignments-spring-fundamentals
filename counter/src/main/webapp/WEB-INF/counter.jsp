<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Counter</title>
	</head>
	<body>

		<h1>You have visited home <c:out value="${counter}"/> times</h1>
		<a href="/">Test another visit?</a>
	</body>
</html>