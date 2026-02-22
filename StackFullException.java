package bluka;
/**
 * Exception thrown when attempting to push an element onto a full stack.
 * This class extends RuntimeException, so it is an unchecked exception.
 * It is used in the generic Stack class to indicate stack overflow.
 */
public class StackFullException extends RuntimeException {
    /**
     * Constructs a new StackFullException with the specified detail message.
     *
     * @param message the detail message describing the exception
     */
    public StackFullException(String message) {
        super(message);
    }
}
