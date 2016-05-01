package bl;

public class Deposit {
	private static int depositID = 0;
	private Account account;
	private int depositBalance;
	
	public Deposit(Account account) {
		this.account = account;
		
		this.depositBalance = 0;
		depositID++;
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

	public void setDepositBalance(int depositBalance) {
		this.depositBalance = depositBalance;
	}

	
	public void updateDepositBalance(int amount) {
		this.depositBalance += amount;
	}
	
	public void closeAndWithdrew() {
		/*
		 * should be implemented in the account and not here: 
		 * update object model
		 */
	}

	@Override
	public String toString() {
		return "Deposit [account=" + account + ", depositBalance=" + depositBalance + "]";
	}

	public static int getDepositID() {
		return depositID;
	}

}
