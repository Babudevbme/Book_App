<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Book add</title>
</head>
<body>
	<form action="AddBookservlet">
		<hr>
		Name:<input type="text" name="name" required autofocus> Price:<input
			type="number" name="price" required> PublishedDate:<input
			type="date" name="publisheddate" required>
		<button type="submit">Add book</button>
		<br><br><hr><a href="listbooks.jsp">List of Books</a>
		<br><a href="removebook.jsp">Remove Book</a>
		<br><a href="searchbook.jsp">search Book</a>
	</form>
</body>
</html>