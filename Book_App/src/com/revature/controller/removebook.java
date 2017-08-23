package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.DAOImplementation.BookDao;
import com.revature.Model.Book;

@WebServlet("/removebook")
public class removebook extends HttpServlet {

	public removebook() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int p = Integer.parseInt(request.getParameter("id"));
		Book book = new Book();
		book.setId(p);
		BookDao bookDAO = new BookDao();
		try {
			bookDAO.RemoveBook(book);;
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("listbooks.jsp");

	}
}
