package cisnux.dev.errors;

public class ValidationException extends Throwable {
    public ValidationException(String message) {
        super(message);
    }
}
