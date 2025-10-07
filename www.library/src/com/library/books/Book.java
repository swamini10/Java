package com.library.books;

public class Book {
	
	private String name;
	private String author;
	private double price;
	private int quantity;
	private int remaingStock;
	
	
	public Book() {
		
	}
	public Book(String name,String author, double price, int quantity, int remaingStock) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
		this.remaingStock=remaingStock;
	}
	
	public String toString() {
		return "Book[name="+ name+ ", author="+ author +" , price=" + price +", quantity=" + quantity +", remaingStock="+ remaingStock +"]";
	}
	
	
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRemaingStock() {
		return remaingStock;
	}

	public void setRemaingStock(int remaingStock) {
		this.remaingStock = remaingStock;
	}
	

}
