<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.Business" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Businesses</title>
</head>
<body>
	<p>Businesses:</p>
	<ul>
		<% List<Business> businesses = (List<Business>)request.getAttribute("businesses"); %>
		<c:forEach items="${businesses}" var="business">
			<li>${business.name}</li>
		</c:forEach>
	</ul>
</body>
</html>