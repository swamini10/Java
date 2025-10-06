package com.shopping.dao;

import com.shopping.services.BillingService;

public class Test {
	public static void main(String[] args) {
		CustomerOperations co=new CustomerOperations();
		co.setCustomers();
		co.getCustomersList();
		
		ProductOperations po=new ProductOperations();
		po.setProducts();
		po.getProductsList();
		
		BillingService bs = new BillingService();
		bs.makeBill();
	}

}