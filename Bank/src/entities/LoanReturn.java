package entities;

import java.time.LocalDateTime;

public class LoanReturn {
	
	private Loan loan;
	private LocalDateTime timeOfLoanReturnTransaction;
	private int amount;
	
	private int loanReturnID;
	
	public LoanReturn(Loan loan, int amount){
		this.loan = loan;
		this.amount = amount;
		
		this.timeOfLoanReturnTransaction = LocalDateTime.now();
	
		/* LoanReturn ID set after creation according to DB */
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public LocalDateTime getTimeOfLoanReturnTransaction() {
		return timeOfLoanReturnTransaction;
	}

	public void setTimeOfLoanReturnTransaction(LocalDateTime timeOfLoanReturnTransaction) {
		this.timeOfLoanReturnTransaction = timeOfLoanReturnTransaction;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getLoanReturnID() {
		return loanReturnID;
	}

	public void setLoanReturnID(int loanReturnID) {
		this.loanReturnID = loanReturnID;
	}

	@Override
	public String toString() {
		return "LoanReturn [loan=" + loan + ", timeOfLoanReturnTransaction=" + timeOfLoanReturnTransaction + ", amount="
				+ amount + ", loanReturnID=" + loanReturnID + "]";
	}	
	
 }
