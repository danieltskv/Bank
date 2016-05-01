package bl;

public class Loan {
	private enum LoanStatus{Open, Partially_Paid, Fully_Paid, Closed};

	private Account account;
	private int loanBalance;
	private LoanReturn[] loanReturns;
	private int currentPayment;
	private LoanStatus loanStatus;
	private int loanID;
	
	public Loan(int loanRequestID, Account account, int loanBalance, int numberOfMonthlyPayments) {
		this.loanID = loanRequestID;
		this.account = account;
		this.loanBalance = loanBalance;
		this.currentPayment = 0;
		this.loanReturns = new LoanReturn[numberOfMonthlyPayments];
		
		this.loanStatus = LoanStatus.Open;
		
		
	}

	public void updateLoanBalance(int amount) {
		this.loanBalance += amount;
		
		if (loanBalance == 0) {
			setLoanStatus(LoanStatus.Fully_Paid);
		} 
	}
	
	public void closeLoan() throws Exception { 
		/*
		 * Simplification: this method is not in the use case and hence
		 * badly defined (why do we need to close a loan? 
		 * when will we not be able to?), 
		 * consider removing it from the object model, no need for it.
		 */
		if (getLoanBalance() == 0)
			setLoanStatus(LoanStatus.Closed);
		else
			throw new Exception("Can't close loan! (Balance is not 0)");
	}
	
	public void createNewReturn(int amount) {
		loanReturns[currentPayment++] = new LoanReturn(this, amount);
		updateLoanBalance(amount);
		
		if (getCurrentPayment() == 1) {
			setLoanStatus(LoanStatus.Partially_Paid);
		}
	}
	
	public Account getAccount() {
		return account;
	}

	public int getLoanBalance() {
		return loanBalance;
	}

	public void setLoanBalance(int loanBalance) {
		this.loanBalance = loanBalance;
	}

	public LoanStatus getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatus loanStatus) {
		this.loanStatus = loanStatus;
	}



	@Override
	public String toString() {
		return "Loan [account=" + account + ", loanBalance=" + loanBalance + ", loanReturns=" + loanReturns
				+ ", loanStatus=" + loanStatus + "]";
	}

	public LoanReturn[] getLoanReturns() {
		return loanReturns;
	}

	public int getCurrentPayment() {
		return currentPayment;
	}

	public int getLoadID() {
		return loanID;
	}

	 
	
}
