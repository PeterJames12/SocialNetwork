package io;

import java.io.IOException;

/**
 * @author Igor Hnes on 10/16/17.
 */
public class MyException extends IOException {

    @Override
    public void printStackTrace() {
        System.out.println("File path incorrect");
    }


    public void printMyException(String message) {
        System.out.println("File path incorrect");
        // send
    }
}
