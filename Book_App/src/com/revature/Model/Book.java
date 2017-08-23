package com.revature.Model;

import java.time.LocalDate;

public class Book {
	private int id;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	private String name;
	private int price;
	private LocalDate date;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + "]";
	}

	

}
