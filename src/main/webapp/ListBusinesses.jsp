<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.Business" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Businesses</title>
</head>
<body>
	<ul>
		<% List<Business> businesses = (List<Business>)request.getAttribute("businesses"); %>
		<% for(Business business : businesses) { %>
			<li><% out.print(business.getName()); %></li>
		<% } %>
	</ul>
</body>
</html>