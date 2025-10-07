package com.shopping.dao;

import com.shopping.services.BillingService;

public class Test1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		CustomerOperations co = new CustomerOperations();
		ProductOperations po = new ProductOperations();
		BillingService bs = new BillingService();
		while (true) {
			System.out.println("\npress 1 for add customer, press 2 for add product, press 3 for billing, press 0 to exit");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					co.setCustomers();
					co.getCustomersList();
					break;
				case 2:
					po.setProducts();
					po.getProductsList();
					break;
				case 3:
					bs.makeBill();
					break;
				case 0:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}

}
