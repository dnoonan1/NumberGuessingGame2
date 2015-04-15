package service;

/**
 *
 * @author Dan
 */
public class OutOfRangeException extends Exception {

    /**
     * Creates a new instance of <code>GuessOutsideRangeException</code> without
     * detail message.
     */
    public OutOfRangeException() {
    }

    /**
     * Constructs an instance of <code>GuessOutsideRangeException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public OutOfRangeException(String msg) {
        super(msg);
    }
}
