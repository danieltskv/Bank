package entities;

public class Deposit {
	private Account account;
	private int depositBalance;

	private int depositID;

	public Deposit(Account account, int depositBalance) {
		this.account = account;
		this.depositBalance = depositBalance;
	
		
		/* Deposit ID set after creation according to DB */
	}

/*
	public void closeAndWithdrew() {
		 *
		 * should be implemented in the account and not here: 
		 * update object model
		 * 
		 *
	}
*/
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


	public int getDepositID() {
		return depositID;
	}


	public void setDepositID(int depositID) {
		this.depositID = depositID;
	}


	@Override
	public String toString() {
		return "Deposit [account=" + account + ", depositBalance=" + depositBalance + ", depositID=" + depositID + "]";
	}



}
