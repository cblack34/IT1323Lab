/*
 * Name: Clayton Black
 * Date: 11-01-2019
 * Assignment Name: Module 5 Lab 5B
 * Assignment Brief: abstract classes
 * Sources:
 * - Book chapter 13
 * - https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Scanner.html
 * - https://stackoverflow.com/questions/12821567/java-scanner-not-accepting-input-after-the-for-loop
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int employeesToCreate = 2;
        // array to hold employee objects
        HourlyEmployee[] employees = new HourlyEmployee[employeesToCreate];

        // vars used in for loop
        String firstName, lastName, id, address, city, state;
        double hourlyRate, hoursWorked;

        // input
        for (int i = 0; i < employeesToCreate; i++) {
            System.out.println(String.format("\n\nEmployee #%d", i+1));
            firstName = getStringFromUser(String.format("Employee #%d's First Name: ", i+1));
            lastName = getStringFromUser(String.format("Employee #%d's Last Name: ", i+1));
            id = getStringFromUser(String.format("Employee #%d's ID: ", i+1));
            address = getStringFromUser(String.format("Employee #%d's Street Address: ", i+1));
            city = getStringFromUser(String.format("Employee #%d's City: ", i+1));
            state = getStringFromUser(String.format("Employee #%d's State: ", i+1));

            hourlyRate = getDoubleFromUser(String.format("Employee #%d's Hourly Rate: ", i+1));
            hoursWorked = getDoubleFromUser(String.format("Employee #%d's Hours Worked: ", i+1));

            employees[i] = new HourlyEmployee(firstName, lastName, id, address, city, state, hourlyRate, hoursWorked);
        }


        double earnings;
        for (Employee employee: employees){
            earnings = employee.earnings();
            System.out.println(employee);
            System.out.println(String.format("Employee Earnings: %f", earnings));
        }
    }

    static String getStringFromUser(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);
        return scanner.nextLine();
    }

    static Double getDoubleFromUser(String question){
        Scanner scanner = new Scanner(System.in);
        double input;

        while(true){
            try {
                System.out.print(question);
                input = scanner.nextDouble();

                return input;
            } catch (Exception e){
                scanner.nextLine();
                System.out.println("Input must be a double!\n");
            }
        }
    }
}
