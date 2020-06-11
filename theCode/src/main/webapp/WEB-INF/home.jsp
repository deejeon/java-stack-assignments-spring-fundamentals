<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>The Code</title>
		<link rel="stylesheet" type="text/css" href="css/home.css">
	</head>
	<body>
		<h1>The Code</h1>
		<p class="errorMessage"><c:out value="${error}"/></p>
		<form method="POST" action="/">
			<label>What is the code?</label>
			<input type="password" name="code">
			<button>Try Code!</button>
		</form>
	</body>
</html>