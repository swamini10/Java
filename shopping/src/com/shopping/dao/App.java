package com.shopping.dao;

import com.shopping.services.BillingService;

public class App {
	
	public static void main(String[] args) {
		CustomerOperations co=new CustomerOperations();
		co.setCustomers();
		co.getCustomersList();
		
		BillingService bs=new BillingService();
		bs.makeBill();
		
	}

}