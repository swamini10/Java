package com.shopping.dao;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.shopping.Product;


public class ProductOperations {
	public static List<Product>allProducts=new ArrayList<Product>();
	public void setProducts() {
		Boolean addMore=true;
		Scanner sc=new Scanner(System.in);

		
		while(addMore) {
			

		Product pd=new Product();
		System.out.println("Enter productId");
		pd.setProductId(sc.nextInt());
		
		System.out.println("Enter product name");
		pd.setName(sc.next());
		
		System.out.println("Enter product description");
		pd.setDescription(sc.next());
		
		System.out.println("Enter price of product");
		pd.setPrice(sc.nextDouble());
	
		System.out.println("Enter stock");
		pd.setStock(sc.nextInt());
		
		System.out.println("Enter year");
		int year=sc.nextInt();
		System.out.println("Enter month");
		int month=sc.nextInt();
		System.out.println("Enter date");
		int date=sc.nextInt();
		pd.setRegisterDate(LocalDate.of(year, month, date));
		
	
		System.out.println("Enter year");
		int Year=sc.nextInt();
		System.out.println("ENter month");
		int Month=sc.nextInt();
		System.out.println("Enter date ");
		int Date=sc.nextInt();
		pd.setExpiryDate(LocalDate.of(Year, Month, Date));
		System.out.println("Enter barcode no");
		pd.setBarcodeNo(sc.next());
		
		allProducts.add(pd);
	System.out.println("Enter 2 for stop adding");
	if(sc.nextInt()==2) {
		addMore=false;
	}
	}	
	
	}
public void getProductsList() {
	
	Iterator<Product> itr=allProducts.iterator();
	while(itr.hasNext()) {
		Product pd=itr.next();
		System.out.println(pd.getName());
		System.out.println(pd.getProductId());
        System.out.println(pd.getPrice());
        System.out.println(pd.getDescription());
        System.out.println(pd.getBarcodeno());
        System.out.println(pd.getStock());
        System.out.println(pd.getExpiryDate());
        System.out.println(pd.getRegisterDate());
	}
	
	
}
}