/*
 * Name: Clayton Black
 * Date: 11-01-2019
 * Assignment Name: Module 5 Lab 5B
 * Assignment Brief: abstract classes
 * Sources:
 * - Book chapter 13
 */

public abstract class Employee {
    String firstName;
    String lastName;
    String employeeID;
    String employeeStreetAddress;
    String employeeCity;
    String employeeState;

    public Employee(String firstName, String lastName, String employeeID, String employeeStreetAddress, String employeeCity, String employeeState) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.employeeStreetAddress = employeeStreetAddress;
        this.employeeCity = employeeCity;
        this.employeeState = employeeState;
    }

    public abstract double earnings();
}
