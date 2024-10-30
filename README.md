Overview
This Java project demonstrates the use of interfaces and method overriding. It includes an interface Person with a single method getInfo(), which is implemented by two classes: Student and Employee. Each class provides specific information based on the type of person.

Classes and Interface
Person (Interface): Defines the getInfo() method to be implemented by subclasses.
Student (Class): Represents a student with properties studentID, name, surname, and age. Overrides getInfo() to display student details.
Employee (Class): Represents an employee with properties name, surname, and age. Also calculates years left until retirement (age 62) and overrides getInfo() to show employee details.
Usage
To run the program:

Compile and run Main.java.
The output will display the information for both Student and Employee objects created in the Main class.
