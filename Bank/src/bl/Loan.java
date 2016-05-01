package bl;

import java.util.ArrayList;

public class Loan {
	private enum LoanStatus{Open, Partially_Paid, Fully_Paid, Closed};

	private Account account;
	private int loanBalance;
	private ArrayList<LoanReturn> loanReturns;
	private LoanStatus loanStatus;
	
	public Loan(Account account, int loanBalance) {
		this.account = account;
		this.loanBalance = loanBalance;
		this.loanReturns = new ArrayList<LoanReturn>();
		
		this.loanStatus = LoanStatus.Open;
	}

	public void updateLoanBalance(int amount) {
		this.loanBalance += amount;
		
		if (loanBalance == 0) {
			loanStatus = LoanStatus.Fully_Paid;
		} 
	}
	
	public void closeLoan() throws Exception {
		if (getLoanBalance() == 0)
			loanStatus = LoanStatus.Closed;
		else
			throw new Exception("Can't close loan! (Balance is not 0)");
	}
	
	public void createNewReturn(int amount) {
		loanReturns.add(new LoanReturn(this, amount));
		updateLoanBalance(amount);
		
		if (getLoanReturns().size() == 1) {
			loanStatus = LoanStatus.Partially_Paid;
		}
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

	public LoanStatus getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatus loanStatus) {
		this.loanStatus = loanStatus;
	}

	public ArrayList<LoanReturn> getLoanReturns() {
		return loanReturns;
	}

	public void setLoanReturns(ArrayList<LoanReturn> loanReturns) {
		this.loanReturns = loanReturns;
	}

	@Override
	public String toString() {
		return "Loan [account=" + account + ", loanBalance=" + loanBalance + ", loanReturns=" + loanReturns
				+ ", loanStatus=" + loanStatus + "]";
	}
	
	
	 
	
}
