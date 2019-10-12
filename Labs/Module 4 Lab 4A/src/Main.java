/*
* Name: Clayton Black
* Date: 10-10-2019
* Assignment Name: Lab Assignment 4A
* Assignment Brief: File io and error handling
* Sources:
*   -
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length != 2){
            System.out.println("improper args");
            System.out.println("Usage: java Main source destination");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        File destinationFile = new File(args[1]);

        if(!sourceFile.exists()){
            System.out.println("Source File Does Not Exist!");
            throw new IOException("Source File Does Not Exist!");
        }
        if (destinationFile.exists()){
            System.out.println("Destination file already exist.\nPlease delete it or choose another destination");
            throw new IOException("Destination File Already Exist!");
        }

        try (
                Scanner lines = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(destinationFile);
                ) {
            int count = 1;
            while (lines.hasNext()){
                output.printf("%d. %s\n", count++, lines.nextLine());
            }
        }

    }
}
