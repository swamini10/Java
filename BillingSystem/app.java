// App.java
public class app {
    public static void main(String[] args) {
        System.out.println("=== Welcome to Simple Billing System ===");

        CustomerOperations co = new CustomerOperations();
        Customer customer = co.createCustomer();

        BillingService bs = new BillingService();
        bs.startBilling(customer);

        System.out.println("\n=== Thank You! Visit Again ===");
    }
}