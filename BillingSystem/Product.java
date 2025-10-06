// Product.java
import java.time.LocalDate;

public class Product {
    private int productId;
    private String name;
    private String description;
    private double price;
    private int stock;
    private LocalDate registerDate;
    private LocalDate expiryDate;
    private String barcodeno;

    public Product(int productId, String name, String description, double price, int stock,
                   LocalDate registerDate, LocalDate expiryDate, String barcodeno) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.registerDate = registerDate;
        this.expiryDate = expiryDate;
        this.barcodeno = barcodeno;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void displayProduct() {
        System.out.println(productId + " | " + name + " | " + description + " | Rs." + price + " | Stock: " + stock);
    }
}