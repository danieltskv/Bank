package controllers;

import interfaces.ClerkControllerInterface;

public class ClerkController implements ClerkControllerInterface {

	@Override
	public Integer connect(int userID, int userPass, String type) throws Exception {
		// TODO create connection
		return null;
	}

	@Override
	public int openAccount(Long customerID, String customerName, String city, String street, int apartmentNumber,
			Long phoneNumber) {
		// TODO Roll down to account manager
		return 0;
	}

	@Override
	public String getGeneralReport() {
		// TODO Roll down to report manager
		return null;
	}

	@Override
	public void closeAccount(int accountID) throws Exception {
		// TODO Roll down to account manager

	}

	@Override
	public String getLoanRequestDetails() throws Exception {
		// TODO Roll down to account manager
		return null;
	}

	@Override
	public void loanApproval(int loanRequestID, int numberOfMonthlyPayments) {
		// TODO Roll down to account manager

	}

}
