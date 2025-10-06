// Bill.java
import java.util.LinkedList;

public class Bill {
    private String customerName;
    private double totalBill;
    private long invoiceNo;
    private LinkedList<ProductBill> productList = new LinkedList<>();

    public void addProduct(ProductBill pb) {
        productList.add(pb);
        totalBill += pb.getProductBill();
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void displayBill() {
        System.out.println("\n--- Bill Summary ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Invoice No: " + System.currentTimeMillis());
        System.out.println("---------------------");
        for (ProductBill p : productList) {
            System.out.println(p.getProductName() + " | Qty: " + p.getQuantity() + " | Rs." + p.getProductBill());
        }
        System.out.println("---------------------");
        System.out.println("Total Bill: Rs." + totalBill);
    }
}