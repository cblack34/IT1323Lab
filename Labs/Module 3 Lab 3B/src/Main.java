/* 
* Name: Clayton Black
* Date: 10-03-2019
* Assignment Name: Module 3 Lab 3B
* Assignment Brief: ArrayList and inheritance
* Sources: 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final int hourlyClientCount = 5;

    public static void main(String[] args) {
        ArrayList<HourlyClient> clients = new ArrayList<>();
        double totalBillingAmount = 0;

        for (int i = 0; i < hourlyClientCount; i++) {
            String companyName = getStringInput("What is the client's name? ");
            String companyID = getStringInput("What is the client's ID? ");
            String billingAddress = getStringInput("What is the client's billing address? ");
            String billingCity = getStringInput("What is the client's billing city? ");
            String billingState = getStringInput("What is the client's billing state? ");
            double hourlyRate = getDoubleInput("What is the client's hourly rate? ");
            double hoursBilled = getDoubleInput("What is the client's hours billed? ");
            System.out.println("\n");

            clients.add(new HourlyClient(companyName, companyID, billingAddress, billingCity, billingState, hourlyRate, hoursBilled));
        }

        for (HourlyClient client: clients){
            System.out.println(client);
        }

        System.out.printf("\n\n%20s %15s\n", "Company Name", "Billing Amount");
        for (int i = 0; i < 36; i++) {
            if(i == 20 || i == 21){
                System.out.print(' ');
            } else {
                System.out.print('=');
            }
            if (i == 35) {
                System.out.println(' ');
            }
        }

        for (HourlyClient client: clients){
            System.out.printf("%20s %15.2f\n", client.companyName, client.billing());
            totalBillingAmount = totalBillingAmount + client.billing();
        }

        System.out.printf("\n%20s %15.2f\n", "Total Billing", totalBillingAmount);
    }

    private static String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String ret = scanner.nextLine();
        return ret;
    }

    private static double getDoubleInput(String prompt){
        double ret;
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        try{
            ret = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("Input must be a double!");
            ret = getDoubleInput(prompt);
        }

        return ret;
    }
}
