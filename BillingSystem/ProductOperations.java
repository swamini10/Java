// ProductOperations.java
import java.time.LocalDate;
import java.util.LinkedList;

public class ProductOperations {
    private LinkedList<Product> productList = new LinkedList<>();

    public ProductOperations() {
        productList.add(new Product(1, "Laptop", "HP 15s", 55000, 5, LocalDate.now(), LocalDate.now().plusYears(2), "HP12345"));
        productList.add(new Product(2, "Phone", "Samsung Galaxy", 25000, 10, LocalDate.now(), LocalDate.now().plusYears(1), "SM45678"));
        productList.add(new Product(3, "Mouse", "Logitech Wireless", 700, 20, LocalDate.now(), LocalDate.now().plusYears(1), "LG98765"));
    }

    public void displayProducts() {
        System.out.println("\n--- Product List ---");
        for (Product p : productList) {
            p.displayProduct();
        }
    }

    public Product getProductById(int id) {
        for (Product p : productList) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        return null;
    }
}