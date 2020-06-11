<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dojo Survey Result</title>
	</head>
	<body>
		<h1>Submitted Info:</h1>
		<ul>
			<li>Name: ${name }</li>
			<li>Location: ${location }</li>
			<li>Language: ${language }</li>
			<li>Comment: ${comment }</li>
		</ul>
	</body>
</html>