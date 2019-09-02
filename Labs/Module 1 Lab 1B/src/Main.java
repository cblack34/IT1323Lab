/*
* Name: Clayton Black
* Date: 09-01-2019
* Assignment Name: Module 1 Lab 1B
* Assignment Brief: 2d array totaling and averaging
* Sources:
* - https://stackoverflow.com/questions/2550123/java-printf-using-variable-field-size
*/

public class Main {

    public static void main(String[] args) {
        double [] weeklyTotals;
        double avgSaleAmount;

        // Input
        double [][] sales = {
            {1234.55, 2222.35, 2400.15, 2523.73, 567.84},
            {1001.13, 1101.01, 923.92, 907.57, 250.15},
            {732.87, 494.15, 502.85, 323.50, 214.17},
            {551.15, 442.25, 383.89, 627.19, 239.18}
        };

        // Process
        weeklyTotals = new double[sales.length];
        for (int i = 0; i < sales.length; i++) {
            weeklyTotals[i] = totalSales(sales[i]);
        }

        avgSaleAmount = averageSales(sales);

        // Output
	    printTableHeader(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"},"", 13);

        for (int i = 0; i < sales.length; i++) {
            printRow(sales[i], "Week "+ (i+1) + ": ", 13);
        }

        System.out.printf("\nAverage Sales Per Day: $%.2f\n\n", avgSaleAmount);

        System.out.println("Total Sales Per Week:");
        for (int i = 0; i < weeklyTotals.length; i++) {
            System.out.printf("Week %d Sales: $%.2f\n", (i+1), weeklyTotals[i]);
        }

    }

    private static double averageSales(double [] [] sales){
        double total = 0;
        int count = 0;

        for( double[] week : sales){
            for (double day : week){
                total = total + day;
                count = count + 1;
            }
        }

        return total/count;
    }

    private static double totalSales(double [] week){
        double total = 0;

        for (double day : week){
            total = total + day;
        }

        return total;
    }

    private static void printTableHeader(String [] headers) {
        printTableHeader(headers, null, 13);
    }

    private static void printTableHeader(String [] headers, String rowHeader){
        printTableHeader(headers, rowHeader, 13);
    }

    private static void printTableHeader(String [] headers, int columnWidth){
        printTableHeader(headers, null , columnWidth);
    }

    private static void printTableHeader(String [] headers, String rowHeader, int columnWidth){
        if(rowHeader != null){
            System.out.printf("%"+columnWidth+"s", rowHeader);
        }

        for (String header: headers){
            System.out.printf("%" + columnWidth + "s", header);
        }

        System.out.print("\n");
    }


    private static void printRow(double [] row){
        printRow(row, null, 13);
    }

    private static void printRow(double [] row, String rowHeader){
        printRow(row, rowHeader, 13);
    }

    private static void printRow(double [] row, int columnWidth){
        printRow(row, null, columnWidth);
    }

    private static void printRow(double [] row, String rowHeader, int columnWidth){
        if(rowHeader != null){
            System.out.printf("%"+columnWidth+"s", rowHeader);
        }

        for( double cell : row){
            System.out.printf("%" + columnWidth + "s", cell);
        }

        System.out.print('\n');
    }
}
