<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Business" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Business Created</title>
</head>
<body>
	<% Business business = (Business)request.getAttribute("business"); %>
	<p>Business <b><%= business.getName() %></b> created successfully</p>
</body>
</html>