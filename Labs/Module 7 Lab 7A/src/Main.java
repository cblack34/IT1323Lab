/*
 * Name: Clayton Black
 * Date: 11-21-2019
 * Assignment Name: Module 7 Lab 7A
 * Assignment Brief: Sorts
 * Sources:
 * - Book Chapter 20, 23, and 24
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int high = 0;
        int low = 1;
        int[][] calendar = new int[12][2];

        int monthCount = 1;

        // Input
        for (int[] mon: calendar){
            mon[high] = getIntInput(String.format("Please Enter Month %d's High: ", monthCount));
            mon[low] = getIntInput(String.format("Please Enter Month %d's Low: ", monthCount++));
        }

        // Output
        System.out.println("Original Lows");
        printCal(calendar, low);
        System.out.println("\nOriginal Highs");
        printCal(calendar, high);

        // Process
        // Lows :: lowest to highest
        System.out.println("\n\nSorted Lows");
        sort(calendar, low);
        printCal(calendar, low);

       // Process
        // Highs :: Highest to lowest
        System.out.println("\n\nSorted Highs");
        sort(calendar, high, true);
        printCal(calendar, high);

    }

    private static int getIntInput(String prompt){
        int ret;
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        try{
            ret = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Input must be an Integer!");
            ret = getIntInput(prompt);
        }

        return ret;
    }

    private static void printCal(int[][] calendar, int index){
        for (int[] mon: calendar){
            System.out.print(mon[index] + " ");
        }
    }

    private static void sort(int[][] calendar, int index){
        sort(calendar, index, false);
    }

    private static void sort(int[][] calendar, int index, boolean reverse){
        if (calendar.length > 1) {
            int[][] halfOne = new int[calendar.length/2][2];
            System.arraycopy(calendar, 0, halfOne, 0, calendar.length/2);
            sort(halfOne, index, reverse);

            int halfTwoLength = calendar.length - halfOne.length;
            int[][] halfTwo = new int[halfTwoLength][2];
            System.arraycopy(calendar, calendar.length/2, halfTwo, 0, halfTwoLength);
            sort(halfTwo, index, reverse);

            if (reverse)
                reverseMerge(halfOne, halfTwo, calendar, index);
            else
                merge(halfOne, halfTwo, calendar, index);
        }
    }

    private static void merge(int[][] list1, int[][] list2, int[][] temp, int index){
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        while(c1 < list1.length && c2 < list2.length){
            if(list1[c1][index] < list2[c2][index])
                temp[c3++] = list1[c1++];
            else
                temp[c3++] = list2[c2++];
        }

        while(c1 < list1.length)
            temp[c3++] = list1[c1++];

        while (c2 < list2.length)
            temp[c3++] = list2[c2++];
    }

    private static void reverseMerge(int[][] list1, int[][] list2, int[][] temp, int index){
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        while(c1 < list1.length && c2 < list2.length){
            if(list1[c1][index] > list2[c2][index])
                temp[c3++] = list1[c1++];
            else
                temp[c3++] = list2[c2++];
        }

        while(c1 < list1.length)
            temp[c3++] = list1[c1++];

        while (c2 < list2.length)
            temp[c3++] = list2[c2++];
    }
}