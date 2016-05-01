package bl;

public class Restriction {
	private static int restrictionID = 0;

	private Account account;
	private int amount;
	private Loan loan;
	
	public Restriction(Account account, int amount, Loan loan) {
		this.account = account;
		this.amount = amount;
		this.loan = loan;
		
		restrictionID++;
	}
	
	public void updateAmount(int amount) {
		this.amount += amount;
	}

	public Account getAccount() {
		return account;
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


	@Override
	public String toString() {
		return "Restriction [account=" + account + ", amount=" + amount + ", loan=" + loan + "]";
	}

	public static int getRestrictionID() {
		return restrictionID;
	}

}
