package bl;

public class Deposit {
	private Account account;
	private int depositBalance;
	
	public Deposit(Account account) {
		this.account = account;
		
		this.depositBalance = 0;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getDepositBalance() {
		return depositBalance;
	}

	/*
	public void setDepositBalance(int depositBalance) {
		this.depositBalance = depositBalance;
	}
	*/
	
	public void updateDepositBalance(int amount) {
		this.depositBalance += amount;
	}
	
	public void closeAndWithdrew() {
		
	}
}
