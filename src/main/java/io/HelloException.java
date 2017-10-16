package io;

/**
 * @author Igor Hnes on 10/16/17.
 */
public class HelloException extends RuntimeException {

    public void sayHello() {
        System.out.println("You get Hello in file");
    }
}
