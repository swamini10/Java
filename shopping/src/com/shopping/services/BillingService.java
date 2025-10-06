package com.shopping.services;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.shopping.dao.*;
import com.shopping.Customer;
import com.shopping.Product;
public class BillingService {
	Scanner sc=new Scanner(System.in);
	private int productId;
	private double quantity;
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
			boolean addMoreProduct =true;

			List<ProductBill>pb=new ArrayList<ProductBill>();
			while(addMoreProduct) {
			System.out.println("Enter ProductId");
			int productId=sc.nextInt();
			System.out.println("Enter Quality");
			int quantity=sc.nextInt();
			
//			System.out.println(customer.getName());
//			System.out.println(customer.getCity());
//			customerFound=true;
			}
		}
	}
	List<ProductBill>pb=new ArrayList<ProductBill>();
	Iterator<Product> products =ProductOperations.allProducts.iterator();
	  while(products.hasNext()) {
		Product pd=products.next();
		if (pd.getProductId()==productId) {
		int price =(int)(pd.getPrice()*quantity);
		ProductBill productBill =new ProductBill();
		productBill.setProductName(pd.getName());
		productBill.setQuantity((int) quantity);
		productBill.setProductBill(price);
		pb.add(productBill);
		}
	
	System.out.println("enter 1 for add more :");
	if (1!=(sc.nextInt())) {
		boolean addMoreProducts = false;
	
	  double totalBill=0;
	  Iterator<ProductBill> iterator =pb.iterator();
	  while(iterator.hasNext()) {
		  ProductBill productBill =iterator.next();
		  totalBill=(int)(totalBill+productBill.getProductBill());
	  }
	  customerFound=true;
	}
 }
   
	  
	if(!customerFound) {
		System.out.println("Customer not found");
	}
}}