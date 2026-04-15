/**
 * Employee.java
 * US-05: Initializes employee/trainer details using constructor.
 * US-06: Uses static variable for shared company/institute name.
 * Concepts: Constructor, this keyword, Object Initialization, static keyword
 */
public class Employee {

    // Instance variables
    int empId;
    String empName;
    double salary;

    // US-06: Static variable shared across all Employee objects
    static String companyName = "ABC Training Institute";

    /**
     * US-05: Constructor to initialize employee details directly
     * Uses 'this' keyword to distinguish instance variables from parameters
     */
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    /**
     * Displays employee details along with the shared company name
     */
    public void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : Rs." + salary);
        System.out.println("Company       : " + companyName); // Static variable access
    }
}
