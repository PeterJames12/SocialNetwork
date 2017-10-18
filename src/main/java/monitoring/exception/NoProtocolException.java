package monitoring.exception;

import java.io.IOException;

/**
 * @author Igor Hnes on 10/18/17.
 */
public class NoProtocolException extends IOException {

    @Override
    public void printStackTrace() {
        System.out.println("Your site must be start with protocol https");
    }
}
