/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution, Exercise 45
 *  Copyright 2021 Mayank Goyal
 */

package ex45;

import java.io.IOException;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        // using try catch block to handle exceptions
        try {
            // create a scanner object that takes input from user
            Scanner SC = new Scanner(System.in);

            // ask user for output file name
            System.out.print("output file: ");
            String of = SC.nextLine();

            //assign values for input and output file
            ReadWriteFile rw = new ReadWriteFile();
            rw.inputFile = "src/main/resources/exercise45_input.txt";
            rw.outputFile = "src/main/resources/" + of;

            //call the method that reads the input file
            //find the word and replaces it
            //writes to output file
            String result = rw.readFile();
            rw.replaceAndWrite(result);
        } catch (IOException e) {
            // use catch block to handle exception
            // prints the exception message if any error occurs or file not found
            System.out.println("There are some IOException");
        }
    }
}