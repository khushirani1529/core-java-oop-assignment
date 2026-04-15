/**
 * Student.java
 * US-01: Stores and displays student information.
 * US-02: Demonstrates String methods for name formatting.
 * US-03: Stores marks of 5 students using an array.
 * Concepts: Class, Object, Fields, Methods, Strings, Arrays
 */
public class Student {

    // Student fields
    int rollNo;
    String name;
    double marks;

    // Static variable to track total student count (Bonus)
    private static int studentCount = 0;

    // Constructor to initialize student details
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        studentCount++; // Increment count each time a student is created
    }

    /**
     * US-01: Displays student details
     */
    public void displayDetails() {
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Name     : " + name);
        System.out.println("Marks    : " + marks);
    }

    /**
     * US-02: Formats and prints student name in different formats
     * Demonstrates String methods: toUpperCase(), toLowerCase(), length()
     */
    public void formatName() {
        System.out.println("Original Name  : " + name);
        System.out.println("Uppercase      : " + name.toUpperCase());
        System.out.println("Lowercase      : " + name.toLowerCase());
        System.out.println("Name Length    : " + name.length());
    }

    /**
     * US-03: Creates an array of 5 marks and prints them using a loop
     * Demonstrates Arrays & for loop
     */
    public static void displayMarksArray() {
        double[] marksArray = {85.5, 90.0, 78.5, 92.0, 88.5};

        System.out.println("Marks of 5 Students:");
        for (int i = 0; i < marksArray.length; i++) {
            System.out.println("  Student " + (i + 1) + " : " + marksArray[i]);
        }

        // Bonus: Calculate average of marks array
        double sum = 0;
        for (double m : marksArray) {
            sum += m;
        }
        double average = sum / marksArray.length;
        System.out.println("  Average Marks : " + average);
    }

    /**
     * Bonus: Returns total number of Student objects created using static
     */
    public static int getStudentCount() {
        return studentCount;
    }
}
