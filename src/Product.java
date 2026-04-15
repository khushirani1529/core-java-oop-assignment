/**
 * Product.java
 * US-07: Protects product price details using Encapsulation.
 * Private variables are accessed through getter and setter methods.
 * Concepts: Encapsulation, private access modifier, Getter, Setter
 */
public class Product {

    // Private fields - cannot be accessed directly from outside
    private int productId;
    private String productName;
    private double price;

    // Default constructor
    public Product() {
    }

    // Bonus: Overloaded constructor for direct initialization
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // --- Getter Methods ---

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // --- Setter Methods ---

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        // Validation: price should not be negative
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative!");
        }
    }

    /**
     * Displays product details using getter methods
     */
    public void displayDetails() {
        System.out.println("Product ID   : " + getProductId());
        System.out.println("Product Name : " + getProductName());
        System.out.println("Price        : Rs." + getPrice());
    }
}
