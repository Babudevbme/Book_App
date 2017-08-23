package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.DAOImplementation.BookDao;
import com.revature.Model.Book;

@WebServlet("/AddBookservlet")
public class AddBookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddBookservlet() {     super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("AddBookservlet");
		int p = Integer.parseInt(request.getParameter("price"));
		LocalDate d = LocalDate.parse(request.getParameter("publisheddate"));
		out.println("name,price,publisheddate");
		Book book = new Book();
		book.setName(request.getParameter("name"));
		book.setPrice(p);
		book.setDate(d);
		out.println(book);
		BookDao bookDAO = new BookDao();
		try {
			bookDAO.AddBook(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("listbooks.jsp");

	}
}
