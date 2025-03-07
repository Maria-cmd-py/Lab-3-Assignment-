// Customer.java (Inside store.customers package)
package store.customers;
public class Customer {
    private String name;
    private String contactNumber;
    private String address;
    // Constructor
    public Customer(String name, String contactNumber, String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    // Method to display customer details
    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + address);
    }
}