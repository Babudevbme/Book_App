<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Remove Book</title>
</head>
<body>
	<form action="removebook">
		Book Id:<input type="number" name="id" placeholder="Enter Id of Book"
			required autofocus>
		<button type="submit">Remove book</button>
		<br>
		<hr>
		<a href="addbook.jsp">Add Book</a><br>
		<a href="listbooks.jsp">List of Books</a>
		<br><a href="searchbook.jsp">Search Book</a>

	</form>

</body>
</html>