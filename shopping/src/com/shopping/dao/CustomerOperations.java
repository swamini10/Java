package com.shopping.dao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.shopping.Customer;

public class CustomerOperations {
public static	List<Customer>allCustomers=new ArrayList<Customer>();
	Scanner sc=new Scanner(System.in);
public void setCustomers() {
	Boolean addMore=true;
	while(addMore) {
		Customer cs=new Customer();
		System.out.println("Enter Customer Id:");
		cs.setCusId(sc.nextInt());
		System.out.println("Enter Customeer Name:");
		cs.setName(sc.next());
		System.out.println("ENter Customer City");
		cs.setCity(sc.next());
		
		allCustomers.add(cs);
		System.out.println("Enter 1 for adding more customers");
		if(sc.nextInt()!=1) {
			addMore=false;
			
		}
	}
}
public void getCustomersList() {
	Iterator<Customer>itr=allCustomers.iterator();
	while(itr.hasNext()) {
		Customer cs=itr.next();
	System.out.println(cs.getCusId());
	System.out.println(cs.getName());
	System.out.println(cs.getCity());
		
		
		
	}
	//use for(Customer cs=allProducts){
	//Sysout(cs.getcusid
	
	
}
}
