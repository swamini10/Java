// BillingService.java
import java.util.Scanner;

public class BillingService {
    Scanner sc = new Scanner(System.in);
    private ProductOperations po = new ProductOperations();

    public void startBilling(Customer customer) {
        Bill bill = new Bill();
        bill.setCustomerName(customer.getName());

        po.displayProducts();
        System.out.println("\nEnter Product ID (Enter -1 to stop):");

        while (true) {
            int productId = sc.nextInt();
            if (productId == -1) break;

            Product selected = po.getProductById(productId);
            if (selected == null) {
                System.out.println("Invalid product ID. Try again.");
                continue;
            }

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();

            double total = selected.getPrice() * qty;
            bill.addProduct(new ProductBill(selected.getName(), qty, total));

            System.out.println("Product added. Add another (-1 to finish):");
        }

        bill.displayBill();
    }
}