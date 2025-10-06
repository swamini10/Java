// Customer.java
public class Customer {
    private int cusId;
    private String name;
    private String city;

    public int getCusId() { return cusId; }
    public void setCusId(int cusId) { this.cusId = cusId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public void displayCustomer() {
        System.out.println("ID: " + cusId + " | Name: " + name + " | City: " + city);
    }
}