/**
 *  Java to print a file to console.
 */

package com.myreading;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an ArrayList to store file data.
        ArrayList<String> list = new ArrayList();

        try {

            // Reading file.
            Scanner scanner = new Scanner(Paths.get("song.txt"));
            while(scanner.hasNextLine()) {

                // reading a line from song.txt.
                String line = scanner.nextLine();
                // Saving data in ArrayList.
                list.add(line);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Printing file data.
        for(String el : list) {
            System.out.println(el);
        }
    }
}