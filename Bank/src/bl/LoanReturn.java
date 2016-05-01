package bl;

import java.time.LocalDateTime;

public class LoanReturn {

	private static int loanReturnID = 0;
	
	private Loan loan;
	private LocalDateTime timeOfLoanReturnTransaction;
	private int amount;
	
	public LoanReturn(Loan loan, int amount){
		this.loan = loan;
		this.amount = amount;
		
		this.timeOfLoanReturnTransaction = LocalDateTime.now();
		loanReturnID++;
	}

	public static int getLoanReturnID() {
		return loanReturnID;
	}

	public Loan getLoan() {
		return loan;
	}

	public LocalDateTime getTimeOfTransaction() {
		return timeOfLoanReturnTransaction;
	}

	public int getAmount() {
		return amount;
	}


	@Override
	public String toString() {
		return "LoanReturn [loan=" + loan + ", timeOfTransaction=" + timeOfLoanReturnTransaction + ", amount=" + amount + "]";
	}	
	
 }
