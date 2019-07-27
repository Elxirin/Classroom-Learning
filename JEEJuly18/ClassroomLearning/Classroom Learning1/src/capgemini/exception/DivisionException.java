package capgemini.exception;

public class DivisionException extends Exception {

	public DivisionException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
	
		return super.getMessage()+"cannot Divide by zero...";
	}
}
