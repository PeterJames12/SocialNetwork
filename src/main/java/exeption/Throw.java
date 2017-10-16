package exeption;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Igor Hnes on 10/16/17.
 */
public class Throw {

    public static void main(String[] args) {

//        try {
//            String mas[] = new String[6];
//            System.out.println(Arrays.toString(mas));
//            mas[0].equals("Hola");
//        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getClass().getSimpleName());
//        }
        try {
            get();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void getName() throws RuntimeException {
        throw new RuntimeException();
    }

    private static void getNumber() throws NullPointerException {
        throw new NullPointerException();
    }

    private static void printName() throws IOException {
        throw new IOException();
    }

    private static void printNumber() throws Exception {
        throw new Exception();
    }

    private static void findFile() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    private static void get() throws FileNotFoundException {
        throw new FileNotFoundException("Hahaha");
    }
}
