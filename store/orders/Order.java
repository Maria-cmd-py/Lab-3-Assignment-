// Order.java (Inside store.orders package)
package store.orders;
import store.products.Product;
import store.customers.Customer;
public class Order {
    private Product product;
    private Customer customer;
    // Constructor
    public Order(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }
    // Method to place an order
    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("Product: " + product.getName());
        System.out.println("Customer: " + customer.getName());
    }
}