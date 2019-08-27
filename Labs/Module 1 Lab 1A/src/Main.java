/*
* Name: Clayton Black
* Date: 08-27-2019
* Assignment Name: Module 1 Lab 1A
* Assignment Brief: Do cool stuff with 1d arrays. Pretend its about last weeks highs.
* Sources:
* - https://www.geeksforgeeks.org/for-each-loop-in-java/
*/
public class Main {

    public static void main(String[] args) {
	    // Create Variables
        int[] lastWeeksHighs  = { 82, 87, 89, 90, 95, 94, 97 };
        int[] highsPlusTen;
        int max;
        int min;

        // Process
        max = getMaxInArray(lastWeeksHighs);
        min = getMinInArray(lastWeeksHighs);
        highsPlusTen = addTenToAllElementsInArray(lastWeeksHighs);

        // Output
        printResults(max, min, highsPlusTen);
    }

    public static int getMaxInArray(int[] numbers) {
        int max = numbers[0];

        for (int num : numbers){
            if (max < num) {
                max = num;
            }
        }

        return max;
    }

    public static int getMinInArray(int[] numbers) {
        int min = numbers[0];

        for (int num : numbers){
            if (min > num) {
                min = num;
            }
        }

        return min;
    }

    public static int[] addTenToAllElementsInArray(int[] numbers){
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[i] + 10;
        }

        return results;
    }

    public static void printResults(int max, int min, int[] superHighs){
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        System.out.printf("Last Weeks Max High: %d\n", max);
        System.out.printf("Last Weeks Min High: %d\n", min);
        System.out.println(""); //Blank line
        System.out.println("Last week's highs + 10:");
        for (int i = 0; i < superHighs.length; i++) {
            System.out.printf("%12s : %3d\n", daysOfWeek[i], superHighs[i]);
        }
    }
}
