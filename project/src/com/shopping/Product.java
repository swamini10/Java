
package com.shopping;
import java.time.LocalDate;
public class Product {
	private int productId;
	private String name;
	private String description;
	private double price;
	private int stock;
	private LocalDate registerDate;
	private LocalDate expiryDate;
	private String barcodeno;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getBarcodeno() {
		return barcodeno;
	}
	public void setBarcodeNo(String barcodeNo) {
		this.barcodeno = barcodeNo;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", stock=" + stock + ", registerDate=" + registerDate + ", expiryDate=" + expiryDate
				+ ", barcodeNo=" + barcodeno + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String name, String description, double price, int stock, LocalDate registerDate,
			LocalDate expiryDate, String barcodeNo) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.registerDate = registerDate;
		this.expiryDate = expiryDate;
		this.barcodeno = barcodeNo;
	}
	
	
	
	
	
	

}
