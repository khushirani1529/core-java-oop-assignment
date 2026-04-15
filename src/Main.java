/**
 * Main.java
 * Main execution file for Student Product Billing & Management System.
 * Demonstrates all user stories (US-01 to US-08) and bonus tasks.
 */
public class Main {

    public static void main(String[] args) {

        // ===================================================
        // US-01: Create Student object and display details
        // ===================================================
        System.out.println("========================================");
        System.out.println("  US-01: Student Object Creation");
        System.out.println("========================================");
        Student student1 = new Student(101, "Khushi Sharma", 89.5);
        student1.displayDetails();

        // ===================================================
        // US-02: String formatting on student name
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  US-02: String Formatting");
        System.out.println("========================================");
        student1.formatName();

        // ===================================================
        // US-03: Array of marks + Bonus: Average calculation
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  US-03: Marks Array Display");
        System.out.println("========================================");
        Student.displayMarksArray();

        // ===================================================
        // US-04: Method Overloading for Product Billing
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  US-04: Product Billing (Overloading)");
        System.out.println("========================================");
        ProductBilling billing = new ProductBilling();

        double bill1 = billing.calculateBill(250.0);
        System.out.println("Total Bill: Rs." + bill1);

        System.out.println();
        double bill2 = billing.calculateBill(250.0, 450.0);
        System.out.println("Total Bill: Rs." + bill2);

        System.out.println();
        double bill3 = billing.calculateBill(250.0, 450.0, 300.0);
        System.out.println("Total Bill: Rs." + bill3);

        // Bonus: Bill with discount
        System.out.println();
        double bill4 = billing.calculateBill(1000.0, 10);
        System.out.println("Total Bill after discount: Rs." + bill4);

        // ===================================================
        // US-05: Employee object using Constructor + this
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  US-05: Employee Constructor Demo");
        System.out.println("========================================");
        Employee emp1 = new Employee(201, "Rahul Verma", 55000.0);
        emp1.displayDetails();

        // ===================================================
        // US-06: Static company name shared across objects
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  US-06: Static Variable Demo");
        System.out.println("========================================");
        Employee emp2 = new Employee(202, "Priya Singh", 60000.0);
        System.out.println("--- Employee 1 ---");
        emp1.displayDetails();
        System.out.println("\n--- Employee 2 ---");
        emp2.displayDetails();
        System.out.println("\nBoth employees share the same company: " + Employee.companyName);

        // ===================================================
        // US-07: Encapsulation with Product class
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  US-07: Encapsulation Demo");
        System.out.println("========================================");

        // Using setter methods
        Product product1 = new Product();
        product1.setProductId(301);
        product1.setProductName("Java Programming Book");
        product1.setPrice(599.0);
        System.out.println("--- Product 1 (using setters) ---");
        product1.displayDetails();

        // Bonus: Using overloaded constructor
        System.out.println("\n--- Product 2 (using constructor) ---");
        Product product2 = new Product(302, "Laptop Stand", 1299.0);
        product2.displayDetails();

        // Demonstrating getter methods
        System.out.println("\nAccessing via Getters:");
        System.out.println("Product Name: " + product2.getProductName());
        System.out.println("Product Price: Rs." + product2.getPrice());

        // ===================================================
        // US-08: Inheritance - CollegeStudent extends Student
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  US-08: Inheritance Demo");
        System.out.println("========================================");
        CollegeStudent cs1 = new CollegeStudent(102, "Ankit Kumar", 91.0, "IIT Delhi", "B.Tech CSE");
        cs1.displayDetails();

        // ===================================================
        // Bonus: Student count using static variable
        // ===================================================
        System.out.println("\n========================================");
        System.out.println("  Bonus: Student Count (static)");
        System.out.println("========================================");
        System.out.println("Total Students Created: " + Student.getStudentCount());

        System.out.println("\n========================================");
        System.out.println("  Program Execution Complete!");
        System.out.println("========================================");
    }
}
