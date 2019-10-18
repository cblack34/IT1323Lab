/*
* Name: Clayton Black
* Date: 10-17-2019
* Assignment Name: Module 4 Lab 4B
* Assignment Brief: file io
* Sources:
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    File sourceFile = new File("temps.txt");
	    File destinationFile = new File("output.txt");

        int counter = 1;
        int min, max;

        try( Scanner temps = new Scanner(sourceFile)) {
            int currentElement = temps.nextInt();
            min = currentElement;
            max = currentElement;


            while (temps.hasNext()){
                // get current element
                currentElement = temps.nextInt();

                // find min
                if (currentElement < min){
                    min = currentElement;
                }

                // find max
                else if(currentElement > max){
                    max = currentElement;
                }
                // count elements
                counter++;
            }

        }

        try(
                Scanner temps = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(destinationFile);
        ) {

            int[] arr = new int[counter];

            for (int i = 0; i < counter; i++) {
                arr[i] = temps.nextInt() + 10;
            }

            output.printf("Max Temp: %d\n", max);
            output.printf("Min Temp: %d\n", min);
            output.println("\nTemperatures plus 10:");

            for (int i : arr){
                output.printf("%d ", i);
            }
        }
    }
}
