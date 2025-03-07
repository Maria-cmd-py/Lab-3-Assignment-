// Product.java (Inside store.products package)
package store.products;
public class Product {
    private String name;
    private double price;
    private int stock;
    // Constructor
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    // Method to display product details
    public void displayProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }
}