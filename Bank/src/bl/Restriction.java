package bl;

public class Restriction {
	private Account account;
	private int amount;
	private Loan loan;
	
	public Restriction(Account account, int amount, Loan loan) {
		this.account = account;
		this.amount = amount;
		this.loan = loan;
	}
	
	public void updateAmount(int amount) {
		this.amount += amount;
	}

	public Account getAccount() {
		return account;
	}
/*
	public void setAccount(Account account) {
		this.account = account;
	}
*/
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Loan getLoan() {
		return loan;
	}
/*
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
*/	
	
}
