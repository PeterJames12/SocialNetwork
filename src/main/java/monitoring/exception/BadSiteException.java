package monitoring.exception;

import java.io.IOException;

/**
 * @author Igor Hnes on 10/18/17.
 */
public class BadSiteException extends IOException {

    @Override
    public void printStackTrace() {
        System.out.println("This site is bad!");
    }
}
