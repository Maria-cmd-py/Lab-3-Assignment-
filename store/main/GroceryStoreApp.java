// GroceryStoreApp.java (Inside store.main package)
package store.main;
import store.products.Product;
import store.customers.Customer;
import store.orders.Order;
public class GroceryStoreApp {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Apple", 1.5, 100);
        Product product2 = new Product("Bread", 2.0, 50);
        // Create customers
        Customer customer1 = new Customer("Ali", "123456789", "Rawalpindi");
        Customer customer2 = new Customer("Sara", "987654321", "Islamabad");
        // Place orders
        Order order1 = new Order(product1, customer1);
        Order order2 = new Order(product2, customer2);
        // Display product and customer details
        product1.displayProductInfo();
        product2.displayProductInfo();
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        // Place and display orders
        order1.placeOrder();
        order2.placeOrder();
    }
}