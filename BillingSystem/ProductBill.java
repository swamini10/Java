// ProductBill.java
public class ProductBill {
    private String productName;
    private int quantity;
    private double productBill;
    

    public ProductBill(String productName, int quantity, double productBill) {
        this.productName = productName;
        this.quantity = quantity;
        this.productBill = productBill;
    }

    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getProductBill() { return productBill; }
}