# Student Product Billing & Management System

## Author
Khushi Rani

## Date
April 15, 2026

## Assignment Overview
This is a Core Java console-based application designed for a training institute to manage student information, employee details, product details, and billing. The project demonstrates fundamental Object-Oriented Programming (OOP) concepts.

## Concepts Used
- **Classes & Objects**: Fundamental building blocks for Student, Employee, and Product entities.
- **Encapsulation**: Implementation of data hiding using `private` variables and `getter/setter` methods in the `Product` class.
- **Inheritance**: Demonstration of the `extends` keyword where `CollegeStudent` inherits from the `Student` class.
- **Polymorphism (Method Overloading)**: Overloaded `calculateBill` methods in `ProductBilling` to handle different numbers of products.
- **Arrays & Loops**: Using arrays to store marks and `for` loops to iterate through them.
- **Strings**: Manipulation of student names using `toUpperCase()`, `toLowerCase()`, and `length()`.
- **Constructors & `this` keyword**: Efficient object initialization and distinguishing instance variables.
- **Static Keyword**: Implementation of shared data (Company Name) and a global counter for student objects.

## Folder Structure
- `src/`: Contains all `.java` source files.
- `screenshots/`: Reserved for output screenshots.
- `README.md`: Project documentation.

## How to Run
1. Open your terminal or command prompt.
2. Navigate to the project `src` folder:
   ```bash
   cd src
   ```
3. Compile all Java files:
   ```bash
   javac *.java
   ```
4. Run the Main class:
   ```bash
   java Main
   ```

## Sample Output
```text
========================================
  US-01: Student Object Creation
========================================
Roll No  : 101
Name     : Khushi Sharma
Marks    : 89.5

========================================
  US-02: String Formatting
========================================
Original Name  : Khushi Sharma
Uppercase      : KHUSHI SHARMA
Lowercase      : khushi sharma
Name Length    : 13

========================================
  US-03: Marks Array Display
========================================
Marks of 5 Students:
  Student 1 : 85.5
  Student 2 : 90.0
  Student 3 : 78.5
  Student 4 : 92.0
  Student 5 : 88.5
  Average Marks : 86.9

========================================
  US-04: Product Billing (Overloading)
========================================
Billing for 1 product...
Total Bill: Rs.250.0

Billing for 2 products...
Total Bill: Rs.700.0

Billing for 3 products...
Total Bill: Rs.1000.0

Billing with 10% discount...
Total Bill after discount: Rs.900.0

========================================
  US-05: Employee Constructor Demo
========================================
Employee ID   : 201
Employee Name : Rahul Verma
Salary        : Rs.55000.0
Company       : ABC Training Institute

========================================
  US-06: Static Variable Demo
========================================
--- Employee 1 ---
Employee ID   : 201
Employee Name : Rahul Verma
Salary        : Rs.55000.0
Company       : ABC Training Institute

--- Employee 2 ---
Employee ID   : 202
Employee Name : Priya Singh
Salary        : Rs.60000.0
Company       : ABC Training Institute

Both employees share the same company: ABC Training Institute

========================================
  US-07: Encapsulation Demo
========================================
--- Product 1 (using setters) ---
Product ID   : 301
Product Name : Java Programming Book
Price        : Rs.599.0

--- Product 2 (using constructor) ---
Product ID   : 302
Product Name : Laptop Stand
Price        : Rs.1299.0

Accessing via Getters:
Product Name: Laptop Stand
Product Price: Rs.1299.0

========================================
  US-08: Inheritance Demo
========================================
--- College Student Details ---
Roll No  : 102
Name     : Ankit Kumar
Marks    : 91.0
College  : IIT Delhi
Course   : B.Tech CSE

========================================
  Bonus: Student Count (static)
========================================
Total Students Created: 2

========================================
  Program Execution Complete!
========================================
```
