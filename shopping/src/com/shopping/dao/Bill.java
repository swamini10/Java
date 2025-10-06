
package com.shopping.dao;

public class Bill {
	private String customerName;
	private double totalBill;
	private long invoiceNo;
	private java.util.List<ProductBill> productBills;
	// Static list to store all bills
	private static java.util.List<Bill> allBills = new java.util.ArrayList<>();
	public static java.util.List<Bill> getAllBills() {
		return allBills;
	}
	public static void addBill(Bill bill) {
		allBills.add(bill);
	}
	public java.util.List<ProductBill> getProductBills() {
		return productBills;
	}
	public void setProductBills(java.util.List<ProductBill> productBills) {
		this.productBills = productBills;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public long getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(long invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	@Override
	public String toString() {
		return "Bill [customerName=" + customerName + ", totalBill=" + totalBill + ", invoiceNo=" + invoiceNo + "]";
	}
	public Bill(String customerName, double totalBill, long invoiceNo) {
		super();
		this.customerName = customerName;
		this.totalBill = totalBill;
		this.invoiceNo = invoiceNo;
		this.productBills = new java.util.ArrayList<>();
	}
	public Bill() {
		super();
		this.productBills = new java.util.ArrayList<>();
	}
	

}
