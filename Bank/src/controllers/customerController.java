package controllers;

public interface customerController {
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
	void requestLoan(int accountID, int amount) throws Exception;
	/*
	 * Exceptions: no such account
	 */
	void createDeposit(int accountID, int amount) throws Exception;
	/*
	 * Exceptions: no such account, insufficient funds
	 */
}
