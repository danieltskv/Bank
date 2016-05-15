package entities;

public class Restriction {
	
	private Account account;
	private int amount;
	private Loan loan;
	
	private int restrictionID;
	
	public Restriction(Account account, int amount, Loan loan) {
		this.account = account;
		this.amount = amount;
		this.loan = loan;
		
		/* restriction ID set after creation according to DB */
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public int getRestrictionID() {
		return restrictionID;
	}

	public void setRestrictionID(int restrictionID) {
		this.restrictionID = restrictionID;
	}

	@Override
	public String toString() {
		return "Restriction [account=" + account + ", amount=" + amount + ", loan=" + loan + ", restrictionID="
				+ restrictionID + "]";
	}

}
