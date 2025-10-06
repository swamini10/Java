package com.shopping.services;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.shopping.dao.*;
import com.shopping.Customer;
import com.shopping.Product;
public class BillingService {
	Scanner sc=new Scanner(System.in);
public void makeBill() {
	System.out.println("*");
	System.out.println("Enter customer Id");
	int custId=sc.nextInt();
	
	List<Customer>allcustomers=CustomerOperations.allCustomers;
	Iterator<Customer>itr=allcustomers.iterator();
	List<Customer>cm=new LinkedList<>();
	boolean customerFound=false;
	while(itr.hasNext()) {
		Customer customer=itr.next();
		if(customer.getCusId()==custId) {
			System.out.println("Enter ProductId");
			int productId=sc.nextInt();
			System.out.println("Enter Quality");
			int quantity=sc.nextInt();
			
			System.out.println(customer.getName());
			System.out.println(customer.getCity());
			customerFound=true;
			
		}
	}
	if(!customerFound) {
		System.out.println("Customer not found");
	}
	
	
}
}