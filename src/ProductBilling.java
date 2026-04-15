/**
 * ProductBilling.java
 * US-04: Calculates bill for purchased products using Method Overloading.
 * Overloaded methods handle billing for 1, 2, and 3 products.
 * Concepts: Methods, Parameters, Method Overloading, Polymorphism
 */
public class ProductBilling {

    /**
     * Calculate bill for 1 product
     * @param price1 Price of the first product
     * @return Total bill amount
     */
    public double calculateBill(double price1) {
        System.out.println("Billing for 1 product...");
        return price1;
    }

    /**
     * Calculate bill for 2 products (Method Overloading)
     * @param price1 Price of the first product
     * @param price2 Price of the second product
     * @return Total bill amount
     */
    public double calculateBill(double price1, double price2) {
        System.out.println("Billing for 2 products...");
        return price1 + price2;
    }

    /**
     * Calculate bill for 3 products (Method Overloading)
     * @param price1 Price of the first product
     * @param price2 Price of the second product
     * @param price3 Price of the third product
     * @return Total bill amount
     */
    public double calculateBill(double price1, double price2, double price3) {
        System.out.println("Billing for 3 products...");
        return price1 + price2 + price3;
    }

    /**
     * Bonus: Calculate bill with discount
     * @param price1 Price of the product
     * @param discount Discount percentage
     * @return Total bill after discount
     */
    public double calculateBill(double price1, int discount) {
        System.out.println("Billing with " + discount + "% discount...");
        double discountAmount = price1 * discount / 100;
        return price1 - discountAmount;
    }
}
