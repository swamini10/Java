// CustomerOperations.java
import java.util.*;

public class CustomerOperations {
    Scanner sc = new Scanner(System.in);

    public Customer createCustomer() {
        Customer cs = new Customer();
        System.out.println("Enter Customer Id:");
        cs.setCusId(sc.nextInt());
        System.out.println("Enter Customer Name:");
        cs.setName(sc.next());
        System.out.println("Enter Customer City:");
        cs.setCity(sc.next());
        return cs;
    }
}