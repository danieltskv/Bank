package bl;

import java.time.LocalDateTime;

public class Transaction {
	enum TransactionType{Inner, Outer};
	private static int transactionID = 0;
	
	private Account account;
	private LocalDateTime timeOfTransaction;
	private int amount;
	private String bankRepresentative;
	private TransactionType type;
	
	public Transaction(Account account, int amount, String bankRepresentative, TransactionType type)  {
		this.account = account;
		this.amount = amount;
		this.bankRepresentative = bankRepresentative;
		this.type = type;
		
		this.timeOfTransaction = LocalDateTime.now();
		transactionID++;
	}

	public static int getTransactionID() {
		return transactionID;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public LocalDateTime getTimeOfTransaction() {
		return timeOfTransaction;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getBankRepresentative() {
		return bankRepresentative;
	}

	public void setBankRepresentative(String bankRepresentative) {
		this.bankRepresentative = bankRepresentative;
	}

	public TransactionType getActionType() {
		return type;
	}

	public void setActionType(TransactionType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [account=" + account + ", timeOfTransaction=" + timeOfTransaction + ", amount=" + amount
				+ ", bankRepresentative=" + bankRepresentative + ", type=" + type + "]";
	}
	
	
	
}
