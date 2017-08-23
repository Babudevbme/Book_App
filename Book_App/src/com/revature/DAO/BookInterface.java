package com.revature.DAO;

import java.util.List;

import com.revature.Model.Book;

public interface BookInterface {
	public void AddBook(Book book)throws Exception;
	public void RemoveBook(Book book) throws Exception;
	public List<Book> listBooks(Book book)throws Exception;

}
