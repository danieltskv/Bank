package interfaces;

public interface BlController /*unused*/{
	Integer connect(int userID, int userPass, String type) throws Exception;
	/*
	 * Exceptions: connection errors, no such id, incorrect password
	 * integer = account ID if customer and null if clerk
	 */
	void transactionOut (int sourceAccountNumber, int targetAccountNumber, int amount) throws Exception;
	/*
	 * Exceptions: no such target account, no such source account, insufficient funds
	 */
	void transactionIn (int targetAccountNumber, int amount) throws Exception; //outer system use
	/*
	 * Exceptions: no such target account
	 */
	String getGeneralReport();
	/* 
	 * json, no exceptions
	 */
	int openAccount(Long customerID, String customerName, String city, String street, int apartmentNumber, Long phoneNumber);
	/* 
	 * BL team
	 * Simplification: if existing customer by details, 
	 * add another account to the same customer
	 */
	/*
	 * Exceptions: account isn't valid (to fit use case)
	 * return the account ID
	 */
	void initiateMonthlyTransaction();
	/* 
	 * timer use, assumes there's always sufficient funds (because of restriction)
	 */
	void requestLoan(int accountID, int amount) throws Exception;
	/*
	 * Exceptions: no such account
	 */
	String getLoanRequestDetails() throws Exception;//json
	/*
	 * Exceptions: no loan requests in the system
	 */
	void loanApproval(int loanRequestID, int numberOfMonthlyPayments);
	/*
	 * No exception, app logic protects errors (no input, approve/reject only)
	 */
	void createDeposit(int accountID, int amount) throws Exception;
	/*
	 * Exceptions: no such account, insufficient funds
	 */
	void closeAccount(int accountID) throws Exception;
	/*
	 * Exceptions: no such account, active loans, deposits, debt, remainder (need to transact first) - update use case & sequence diagram
	 */
/*	
 	Removing from use cases and doing the restriction internally, at the value of each monthly return, one per loan
 	void createRestriction(int loanID, int amount); 
	
	 * BL team 
	 * Simplification: highest payment (sequence diagram) can be of the
	 * highest payment of all loans for this account 
	 * (due to "return plan" modification to be just a monthly constant payment for each loan)
	 
	void cancelRestriction(int restrictionID) throws Exception;
	
	 * Exceptions: no such restriction
	 
*/
}
