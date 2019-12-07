/*
* Name: Clayton Black
* Date: 12-06-2019
* Assignment Name: Final Lab
* Assignment Brief: Sorts and stuff
* Sources:
* - The textbook.
*/
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File input = new File("input.txt");
        File output = new File("output.txt");
        int sales_count = countLines(input);
        int[] sales = new int[sales_count];

        try(Scanner inputFile = new Scanner(input)){
            for (int i = 0; i < sales_count; i++) {
                sales[i] = inputFile.nextInt();
            }
        } catch (Exception e){
            System.out.println(e);
        }

        bubbleSort(sales);

        try(PrintWriter out = new PrintWriter(output)){
            out.println("Sorted Values:");
            for (int sale : sales){
                out.println(sale);
            }

            out.printf("\nAverage Value: %f\n", averageOfArray(sales));
            out.printf("Max Value: %d\n", max(sales));

        }catch (Exception e){
            System.out.println(e);
        }
    }


    public static int countLines(File file){
        int count = 0;

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                scanner.next();
                count++;
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return count;
    }

    public static void bubbleSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j+1]){
                    swapElements(array, j, j+1);
                }
            }
        }
    }

    public static void swapElements(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public static float averageOfArray(int[] array){
        float total = 0;

        for (int current : array){
            total += current;
        }

        return total/array.length;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }

        return max;
    }

}
