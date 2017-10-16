package io;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Igor Hnes on 10/16/17.
 */
public class Find {

    public static void main(String[] args) {

//        final String path = "src/main/res/path.txt";
//        File file = new File(path);

        // version 1
        /*
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write("Hallo"); // ctrl + c
            writer.flush(); // ctrl + v
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        // version 2
//        try (FileWriter writer = new FileWriter(file)) {
//            writer.write("Hello");
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // src/main/res/path.txt


//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Enter path to file");
//        final String path = scanner2.nextLine();

        final String path = "src/main/res/path.txt";
        File file = new File(path);
//
//        try (FileWriter writer = new FileWriter(file);
//             Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Enter ur name");
//            String name = scanner.nextLine();
//            System.out.println("Enter ur city");
//            String city = scanner.nextLine();
//            writer.write("Name: " + name);
//            writer.write("\n");
//            writer.write("City: " + city);
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        scanner2.close();

//        try (FileReader reader = new FileReader(file)) {
//            int data = 0;
//            while ((data = reader.read()) != -1) {
//                System.out.print((char) data);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // version 2 for reading

//        try (final BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String data;
//            while ((data = reader.readLine()) != null) {
//                System.out.println(data);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (final BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))){
//            writer.write("Hello");
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        try (BufferedReader reader = new BufferedReader(new FileReader(file));
            Scanner scanner = new Scanner(System.in)) {
            System.out.println("Search phrase");
            final String searchPhrase = scanner.nextLine();
            String data;
            while ((data = reader.readLine()) != null) {
                if (data.equals(searchPhrase)) {
                    throw new HelloException();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
