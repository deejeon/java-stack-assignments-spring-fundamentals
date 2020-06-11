<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Dojo Survey Index</title>
	</head>
	<body>
		<h1>Dojo Survey</h1>
		<form method="POST" action="/">
			<div>
				<label>Your Name:</label>
				<input type="text" name="name" />
			</div>
			<div>
				<label>Dojo Location:</label>
				<select name="location">
					<option value="San Jose">San Jose</option>
					<option value="Burbank">Burbank</option>
					<option value="Oakland">Oakland</option>
				</select>
			</div>
			<div>
				<label>Favorite Language:</label>
				<select name="language">
					<option value="Python">Python</option>
					<option value="JavaScript">JavaScript</option>
					<option value="Java">Java</option>
				</select>
			</div>
			<div>
				<label>Comment (optional):</label>
				<textarea name="comment"></textarea>
			</div>
			<button>Submit Survey</button>
		</form>
	</body>
</html>