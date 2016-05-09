package interfaces;

public interface ClerkControllerInterface {
	Integer connect(int userID, int userPass, String type) throws Exception;
	/*
	 * Exceptions: connection errors, no such id, incorrect password
	 * integer = account ID if customer and null if clerk
	 */
	
	/* Remove create restriction use case entirely */
	
	int openAccount(Long customerID, String customerName, String city, String street, int apartmentNumber, Long phoneNumber);
	/* 
	 * BL team
	 * Simplification: if existing customer by details, 
	 * add another account to the same customer
	 */
	/*
	 * Exceptions: account isn't valid (to fit use case)
	 */
	
	String getGeneralReport();
	/* 
	 * json, no exceptions
	 */
	
	void closeAccount(int accountID) throws Exception;
	/*
	 * Exceptions: no such account, active loans, deposits, debt, remainder (need to transact first) - update use case & sequence diagram
	 */
	
	String getLoanRequestDetails() throws Exception;//json
	/*
	 * Exceptions: no loan requests in the system
	 */
	void loanApproval(int loanRequestID, int numberOfMonthlyPayments);
	/*
	 * No exception, app logic protects errors (no input, approve/reject only)
	 */
}
