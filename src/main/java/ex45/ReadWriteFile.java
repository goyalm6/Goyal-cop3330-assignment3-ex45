/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution, Exercise 45
 *  Copyright 2021 Mayank Goyal
 */

package ex45;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

    public String inputFile;
    public String outputFile;

    public ReadWriteFile(){}

    public String readFile() throws IOException {
        // Create a FileReader object and
        // pass input file as parameter
        FileReader fr = null;
        String str = "";

        try {
            fr = new FileReader(inputFile);

            //declaring variables
            int i;
            // check if EOF using read() method which
            // returns -1 at EOF while reading
            while ((i = fr.read()) != -1) {
                // Storing every character in the string
                str += (char)i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //closing file and stream to release resources that were busy in stream
        fr.close();
        return str;
    }

    public void replaceAndWrite(String str) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(outputFile);
            // Replace and write above string data from input file to FileWriter object
            fw.write(str.replaceAll("utilize","use"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //closing file and stream to release resources that were busy in stream
        fw.close();
    }
}