package com.shopping.dao;

public class ProductBill {
   private String productName;
   private int quantity;
   private double productBill;
   @Override
   public String toString() {
	return "ProductBill [productName=" + productName + ", quantity=" + quantity + ", productBill=" + productBill + "]";
   }
   public String getProductName() {
	return productName;
   }
   public void setProductName(String productName) {
	this.productName = productName;
   }
   public int getQuantity() {
	return quantity;
   }
   public void setQuantity(int quantity) {
	this.quantity = quantity;
   }
   public double getProductBill() {
	return productBill;
   }
   public void setProductBill(double productBill) {
	this.productBill = productBill;
   }
   public ProductBill(String productName, int quantity, double productBill) {
	super();
	this.productName = productName;
	this.quantity = quantity;
	this.productBill = productBill;
   }
   public ProductBill() {
	super();
	// TODO Auto-generated constructor stub
   }
   
   
}
