package bluka;
/**
 * Exception thrown when attempting to push onto a full stack.
 */
public class StackEmptyException extends RuntimeException {
    /**
     * Constructs a new StackFullException with the specified detail message.
     *
     * @param message the detail message
     */
    public StackEmptyException(String message) {
        super(message);
    }
}
