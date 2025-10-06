package com.shopping.dao;

public class Bill {
	private int customerName;
	private double totalBill;
	private long invoiceNo;
	public int getCustomerName() {
		return customerName;
	}
	public void setCustomerName(int customerName) {
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
	public Bill(int customerName, double totalBill, long invoiceNo) {
		super();
		this.customerName = customerName;
		this.totalBill = totalBill;
		this.invoiceNo = invoiceNo;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
