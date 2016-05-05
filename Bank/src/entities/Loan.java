package entities;

import java.util.Arrays;

public class Loan {
	private enum LoanStatus{Open, Partially_Paid, Fully_Paid, Closed};

	private Account account;
	private int loanBalance;
	private LoanReturn[] loanReturns;
	private int currentPayment;
	private LoanStatus loanStatus;
	private int loanRequestID;
	
	private int loanID;
	
	public Loan(int loanRequestID, Account account, int loanBalance, int numberOfMonthlyPayments) {
		this.loanRequestID = loanRequestID;
		this.account = account;
		this.loanBalance = loanBalance;
		this.currentPayment = 0;
		this.loanReturns = new LoanReturn[numberOfMonthlyPayments];
		
		this.loanStatus = LoanStatus.Open;
		
		/* Loan ID set after creation according to DB */
	}

	public void updateLoanBalance(int amount) {
		this.loanBalance += amount;
		
		if (loanBalance == 0) {
			setLoanStatus(LoanStatus.Fully_Paid);
		} 
	}
	
	public void closeLoan() throws Exception { 
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

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getLoanBalance() {
		return loanBalance;
	}

	public void setLoanBalance(int loanBalance) {
		this.loanBalance = loanBalance;
	}

	public LoanReturn[] getLoanReturns() {
		return loanReturns;
	}

	public void setLoanReturns(LoanReturn[] loanReturns) {
		this.loanReturns = loanReturns;
	}

	public int getCurrentPayment() {
		return currentPayment;
	}

	public void setCurrentPayment(int currentPayment) {
		this.currentPayment = currentPayment;
	}

	public LoanStatus getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatus loanStatus) {
		this.loanStatus = loanStatus;
	}

	public int getLoanRequestID() {
		return loanRequestID;
	}

	public void setLoanRequestID(int loanRequestID) {
		this.loanRequestID = loanRequestID;
	}

	public int getLoanID() {
		return loanID;
	}

	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}

	@Override
	public String toString() {
		return "Loan [account=" + account + ", loanBalance=" + loanBalance + ", loanReturns="
				+ Arrays.toString(loanReturns) + ", currentPayment=" + currentPayment + ", loanStatus=" + loanStatus
				+ ", loanRequestID=" + loanRequestID + ", loanID=" + loanID + "]";
	}

	public boolean isActive() {
		if (loanStatus == LoanStatus.Closed)
			return false;
		else
			return true;
	}

	 
	
}
