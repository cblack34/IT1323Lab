/* 
* Name: Clayton Black
* Date: date("MM-dd-YYYY")
* Assignment Name: Module 0 Assignment
* Assignment Brief: Create a program that takes a subtotal and a gratuity rate and calculates the total.
* Sources: w3schools.com and java docs
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create Variables
        Double cost, gratuityRate, gratuityAmount, total;

        // Input
        cost = getDoubleFromUser("How much is the subtotal?");
        gratuityRate = getDoubleFromUser("How much is the gratuity rate?");

        // Process
        gratuityAmount = cost * gratuityRate/100;
        total = cost + gratuityAmount;

        // Output
        System.out.println("\n\n\n");
        System.out.println("Your Input:");
        System.out.println("========================================");
        System.out.printf("Cost: $%.2f\n", cost);
        System.out.printf("Gratuity Rate: %.1f %%\n\n", gratuityRate);
        System.out.println("Calculations:");
        System.out.println("========================================");
        System.out.printf("Gratuity Amount: $%.2f\n", gratuityAmount);
        System.out.printf("Total Amount: $%.2f\n", total);
    }

    private static Double getDoubleFromUser(String question) {
        Scanner input = new Scanner(System.in);
        Double userResponse;

        try {
            System.out.print(question + "  ");
            userResponse = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Input must be a number.\n\n");
            userResponse = getDoubleFromUser(question);
        }

        return userResponse;
    }
}
