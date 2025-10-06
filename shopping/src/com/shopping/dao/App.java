
package com.shopping.dao;
import com.shopping.Product;
public class App {
	
	public static void main(String[] args) {
		CustomerOperations co = new CustomerOperations();
		co.setCustomers();
		co.getCustomersList();

	// BillingService bs = new BillingService();
	// bs.makeBill(); // Commented out to allow product entry code to run

		// Add products for a customer and display purchased products and total bill
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter customer ID to add products:");
		int customerId = sc.nextInt();

		java.util.LinkedList<ProductBill> purchasedProducts = new java.util.LinkedList<>();
		double totalBill = 0;
	// Add products from user input and display all product info before billing
	ProductOperations po = new ProductOperations();
	po.setProducts(); // User adds products interactively
	System.out.println("All Products:");
	po.getProductsList();

		// Billing process
		boolean addMore = true;
		while (addMore) {
			System.out.println("Enter Product ID (or -1 to stop):");
			int productId = sc.nextInt();
			if (productId == -1) {
				break;
			}
			System.out.println("Enter Quantity:");
			int quantity = sc.nextInt();

			// Find product by ID
			Product foundProduct = null;
			if (ProductOperations.allProducts != null) {
				for (Product p : ProductOperations.allProducts) {
					if (p.getProductId() == productId) {
						foundProduct = p;
						break;
					}
				}
			}
			if (foundProduct != null) {
				int price = (int) (foundProduct.getPrice() * quantity);
				ProductBill pb = new ProductBill();
				pb.setProductName(foundProduct.getName());
				pb.setQuantity(quantity);
				pb.setProductBill(price);
				purchasedProducts.add(pb);
				totalBill += price;
			} else {
				System.out.println("Product not found.");
			}
		}

		// Display all products purchased and total bill
		System.out.println("Products purchased by customer ID " + customerId + ":");
		for (ProductBill pb : purchasedProducts) {
			System.out.println("Product: " + pb.getProductName() + ", Quantity: " + pb.getQuantity() + ", Price: " + pb.getProductBill());
		}
		System.out.println("Total Bill: " + totalBill);
	}

}