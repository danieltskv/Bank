package bl;

import java.time.LocalDateTime;

public class LoanReturn {
	private static int loanReturnNumber = 0;
	
	private Loan loan;
	private LocalDateTime timeOfTransaction;
	private int amount;
	
	public LoanReturn(Loan loan, int amount){
		this.loan = loan;
		this.amount = amount;
		
		this.timeOfTransaction = LocalDateTime.now();
		LoanReturn.loanReturnNumber++;
	}

	public static int getLoanReturnNumber() {
		return loanReturnNumber;
	}
/*
	public static void setLoanReturnNumber(int loanReturnNumber) {
		LoanReturn.loanReturnNumber = loanReturnNumber;
	}
*/
	public Loan getLoan() {
		return loan;
	}
/*
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
*/
	public LocalDateTime getTimeOfTransaction() {
		return timeOfTransaction;
	}
/*
	public void setTimeOfTransaction(LocalDateTime timeOfTransaction) {
		this.timeOfTransaction = timeOfTransaction;
	}
*/
	public int getAmount() {
		return amount;
	}
/*
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public static void setLoanReturnNumber(int loanReturnNumber) {
		LoanReturn.loanReturnNumber = loanReturnNumber;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public void setTimeOfTransaction(LocalDateTime timeOfTransaction) {
		this.timeOfTransaction = timeOfTransaction;
	}
*/	
	
 }
