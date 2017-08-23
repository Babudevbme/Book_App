<%@page import="com.revature.DAOImplementation.BookDao"%>
<%@page import="java.util.List"%>
<%@page import="com.revature.Model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="nav.css">
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>
	<form action="ListBooks">
	
		<hr>
		<a href="removebook.jsp">Remove Book</a><br> 
		<a href="addbook.jsp">Add Book</a><br>
				<a href="searchbook.jsp">Search Book</a>
			</form>

	<br>
	<%
		String val = request.getParameter("bookname");

		if (val == null) {
	%>
	<table border="1">
		<thead>
			<tr>
				<th>BookId</th>
				<th>BookName</th>
				<th>Price</th>
				<th>Date of Publish</th>
			</tr>
		</thead>
		<%
			BookDao dao = new BookDao();
				List<Book> bookList = dao.ViewBooks();
				for (Book b : bookList) {
		%>

		<tbody>
			<tr>
				<td><%=b.getId()%></td>
				<td><%=b.getName()%></td>
				<td><%=b.getPrice()%></td>
				<td><%=b.getDate()%></td>
			</tr>
		</tbody>
		<%
			}
		%>
	<%} %>
</body>
</html>