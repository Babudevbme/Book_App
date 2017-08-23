package com.revature.DAOImplementation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.BookInterface;
import com.revature.Model.Book;
import com.revature.Util.ConnectionUtil;

public class BookDao implements BookInterface {
	public void AddBook(Book book) throws Exception {

		Connection con = ConnectionUtil.getConnection();
		String sql = "insert into book(name,price,publisheddate)values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, book.getName());
		pst.setInt(2, book.getPrice());
		pst.setDate(3, Date.valueOf(book.getDate()));
		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted"+rows);

	}
	public void RemoveBook(Book book) throws Exception {

		Connection con = ConnectionUtil.getConnection();
		String sql = "DELETE FROM book WHERE id=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, book.getId());
		int rows = pst.executeUpdate();
		System.out.println("No of rows Removed"  +rows);

	}

	public List<Book> listBooks(Book book) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select * from Book where name=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,book.getName());
		List<Book> bookList = new ArrayList<Book>();
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
		    Book b = new Book();
			b.setId(rs.getInt("id"));
			b.setName(rs.getString("name"));
			b.setPrice(rs.getInt("price"));
			b.setDate(rs.getDate("publisheddate").toLocalDate());
			bookList.add(b);
		}
		return bookList;

	}
	public List<Book> ViewBooks() throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String sql = "select * from Book ";
		PreparedStatement pst = con.prepareStatement(sql);
		List<Book> bookList = new ArrayList<Book>();
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
		    Book b = new Book();
			b.setId(rs.getInt("id"));
			b.setName(rs.getString("name"));
			b.setPrice(rs.getInt("price"));
			b.setDate(rs.getDate("publisheddate").toLocalDate());
			bookList.add(b);
		}
		return bookList;

	}


}
