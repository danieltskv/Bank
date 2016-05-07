package boundaries;

import controllers.customerController;

public class CustomerBoundary implements customerController{

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
	public void requestLoan(int accountID, int amount) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDeposit(int accountID, int amount) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
