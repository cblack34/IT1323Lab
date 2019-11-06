/*
 * Name: Clayton Black
 * Date: 11-01-2019
 * Assignment Name: Module 5 Lab 5B
 * Assignment Brief: abstract classes
 * Sources:
 * - Book chapter 13
 */

public class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String employeeID, String employeeStreetAddress, String employeeCity, String employeeState, double hourlyRate, double hoursWorked) {
        super(firstName, lastName, employeeID, employeeStreetAddress, employeeCity, employeeState);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        return hourlyRate*hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", employeeStreetAddress='" + employeeStreetAddress + '\'' +
                ", employeeCity='" + employeeCity + '\'' +
                ", employeeState='" + employeeState + '\'' +
                '}';
    }
}
