/**
 * CollegeStudent.java
 * US-08: Demonstrates Inheritance by extending Student class.
 * CollegeStudent is a child class of Student with additional fields.
 * Concepts: Inheritance, Parent Class, Child Class, extends keyword
 */
public class CollegeStudent extends Student {

    // Additional fields specific to college students
    String collegeName;
    String course;

    // Constructor using super() to call parent class constructor
    public CollegeStudent(int rollNo, String name, double marks, String collegeName, String course) {
        super(rollNo, name, marks); // Call parent class (Student) constructor
        this.collegeName = collegeName;
        this.course = course;
    }

    /**
     * Overridden method to display both parent and child class properties
     */
    @Override
    public void displayDetails() {
        System.out.println("--- College Student Details ---");
        super.displayDetails(); // Display parent class details
        System.out.println("College  : " + collegeName);
        System.out.println("Course   : " + course);
    }
}
