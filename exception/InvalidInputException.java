package exception;

/**
 * Exception class of the application for calculating arithmetic or geometric
 * sequence elements. It indicates general input errors.
 *
 * @author Szczepan Dwornicki
 * @version 1.1
 */
public class InvalidInputException extends Exception {

    /**
     * Non-parameter constructor
     */
    public InvalidInputException() {
    }

    /**
     * Exception class constructor
     *
     * @param message display message
     */
    public InvalidInputException(String message) {
        super(message);
    }
}