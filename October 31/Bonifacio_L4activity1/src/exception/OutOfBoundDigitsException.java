package exception;

public class OutOfBoundDigitsException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfBoundDigitsException(String message) {
        super(message);
    }
	
	public static void validateDigits(long number) throws OutOfBoundDigitsException {
	    String str = String.valueOf(number);
	    int strLength = str.length();

	    boolean isValid = false;

	    if (strLength == 10) {
	        isValid = true;
	    }

	    if (isValid) {
	        throw new OutOfBoundDigitsException("Number of digits is not 10.");
	    }
	}
}