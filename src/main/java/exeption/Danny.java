package exeption;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author Igor Hnes on 10/15/17.
 */
public class Danny {

    public static void main(String[] args) throws SocketException {



//        try {
//            throw new RuntimeException("Hahaha");
//        } catch (RuntimeException e) {
//            System.out.println("Get runtime exception with message: " + e.getMessage());
//        } finally {
//            System.out.println("Hallo");
//        }
//
//        try {
//            throw new FileNotFoundException("Hahahah");
//        } catch (FileNotFoundException e) {
//            System.out.println("Get FileNotFoundException with message: " + e.getMessage());
//        } finally {
//            System.out.println("hallo");
//        }
//
//
//        try {
//            generateException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        a();

//        training();

        ask();
    }

    private static void a() throws SocketException {
        b();
    }

    private static void b() throws SocketException {
        c();
    }

    private static void c() throws SocketException {
        throw new SocketException();
    }


    private static void generateException() throws IOException {
        throw new IOException();
    }

    private static void training() {

        int mas[] = new int[5];

        try {
            mas[10] = 7;
        } catch (Exception e) {
            System.out.println("Wrong Index");
        }

        String name = "Ana";
        try {
            if (name.equals("Ana")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } catch (NullPointerException e) {
            System.out.println("Check variable name");
        }


        try {
            String text = "123";
            Integer of = Integer.valueOf(text);
            System.out.println(of);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Wrong value for integer");
        }
    }


    private static void ask() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            final String name = scanner.nextLine();
            System.out.println("Enter your ID (in number please)");
            final int id = scanner.nextInt();
            System.out.println(name + " " + id);
        } catch (Exception e) {
            System.out.println("In number!!!");;
        }finally {
            scanner.close();
            System.out.println("Scanner closed");
        }
    }
}
