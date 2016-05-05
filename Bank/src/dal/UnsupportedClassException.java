
public class UnsupportedClassException extends Exception {
	
    private static final long serialVersionUID = 1997753363232807009L;

	public UnsupportedClassException(String message) {
        super(message);
    }

    public UnsupportedClassException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
