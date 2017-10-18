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

    public void printMyException(String site) {
        System.out.println("File path incorrect");
//        "https://www.facebook.com";
//        "www.facebook.com";
        // send
    }
}
