<%@page import="com.revature.DAOImplementation.BookDao"%>
<%@page import="java.util.List"%>
<%@page import="com.revature.Model.Book"%><%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ListBooks">
		<br>Search Book Here=><input type="text" name="name"
			class="search" placeholder="Enter Book Name" required>
		<button type="submit" name="bookname">submit</button>
		<br>
		<hr>
		<a href="removebook.jsp">Remove Book</a><br> 
		<a href="addbook.jsp">Add Book</a> <br>
		<a href="listbooks.jsp">List of Books</a>


		<%
			String val = request.getParameter("bookname");

			if (val != null) {
		%>

		<table border="1">
			<thead>
				<tr>
					<th>BookId</th>
					<th>BookName</th>
					<th>Price</th>
					<th>PublishDate</th>
				</tr>
			</thead>

			<tbody>
				<%
					List<Book> booklist = (List<Book>) request.getAttribute("bookkey");

						for (Book b : booklist) {
				%>

				<tr>
					<td><%=b.getId()%></td>
					<td><%=b.getName()%></td>
					<td><%=b.getPrice()%></td>
					<td><%=b.getDate()%></td>
				</tr>

				<%
					}
				%>

			</tbody>
		</table>
		<%
			}
		%>
	
</body>
</html>