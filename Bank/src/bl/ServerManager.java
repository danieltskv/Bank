package bl;

import controllers.BlController;

public class ServerManager implements BlController {

	@Override
	public Integer connect(int userID, int userPass, String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transactionOut(int sourceAccountNumber, int targetAccountNumber, int amount) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transactionIn(int targetAccountNumber, int amount) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getGeneralReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int openAccount(Long customerID, String customerName, String city, String street, int apartmentNumber,
			Long phoneNumber) {
		// TODO Auto-generated method stub
		return 0;
		
	}

	@Override
	public void initiateMonthlyTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestLoan(int accountID, int amount) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLoanRequestDetails() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loanApproval(int loanRequestID, int numberOfMonthlyPayments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDeposit(int accountID, int amount) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount(int accountID) throws Exception {
		// TODO Auto-generated method stub
		
	}
/*
	@Override
	public void createRestriction(int loanID, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelRestriction(int restrictionID) throws Exception {
		// TODO Auto-generated method stub
		
	}
*/
}
