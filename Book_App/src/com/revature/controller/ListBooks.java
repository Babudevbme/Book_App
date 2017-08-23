package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.DAOImplementation.BookDao;
import com.revature.Model.Book;

@WebServlet("/ListBooks")
public class ListBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListBooks() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Book book = new Book();
		book.setName(request.getParameter("name"));
		BookDao bookDAO = new BookDao();
			try {
				List<Book> List = bookDAO.listBooks(book);
				request.setAttribute("bookkey", List);
				RequestDispatcher dispatch = request.getRequestDispatcher("searchbook.jsp"); 
				dispatch.forward(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		
		

	}

	}


