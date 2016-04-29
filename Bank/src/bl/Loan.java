package bl;

public class Loan {
	private enum LoanStatus{Open, Partially_Paid, Fully_Paid, Closed};

	private Account account;
	private int loanBalance;
	private TimedLoanReturnPlan loanReturns; //???
	private LoanStatus loanStatus;
	
	public Loan(Account account, int loanBalance, TimedLoanReturnPlan loanReturns) {
		this.account = account;
		this.loanBalance = loanBalance;
		this.loanBalance = loanBalance;
		
		this.loanStatus = LoanStatus.Open;
	}

	public void updateLoanBalance(int amount) {
		this.loanBalance += amount;
	}
	
	public void closeLoan() throws Exception {
		if (loanBalance == 0)
			loanStatus = LoanStatus.Closed;
		else
			throw new Exception("Can't close loan! (Balance is not 0)");
	}
	
	public void createNewReturnPlan() {
		//???
	}
	
	public Account getAccount() {
		return account;
	}
/*
	public void setAccount(Account account) {
		this.account = account;
	}
*/
	public int getLoanBalance() {
		return loanBalance;
	}

	public void setLoanBalance(int loanBalance) {
		this.loanBalance = loanBalance;
	}

	public TimedLoanReturnPlan getLoanReturns() {
		return loanReturns;
	}

	public void setLoanReturns(TimedLoanReturnPlan loanReturns) {
		this.loanReturns = loanReturns;
	}

	public LoanStatus getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatus loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	
	 
	
}
