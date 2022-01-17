package in.cognitivzen.inventoryservice.exceptions;

public class MyResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyResourceNotFoundException() {
	}
    public MyResourceNotFoundException(String message)
    {
        super(message);
    }
}