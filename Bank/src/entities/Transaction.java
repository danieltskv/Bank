package entities;

import java.time.LocalDateTime;

public class Transaction {
	enum TransactionType{Inner, Outer};

	private TransactionType type;
	private Account account;
	private LocalDateTime timeOfTransaction;
	private int amount;
	private String bankRepresentative;
	
	private int transactionID;
	
	public Transaction(Account account, int amount, String bankRepresentative, TransactionType type)  {
		this.account = account;
		this.amount = amount;
		this.bankRepresentative = bankRepresentative;
		this.type = type;
		
		this.timeOfTransaction = LocalDateTime.now();
		/* transaction ID set after creation according to DB */
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
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

	public void setTimeOfTransaction(LocalDateTime timeOfTransaction) {
		this.timeOfTransaction = timeOfTransaction;
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

	@Override
	public String toString() {
		return "Transaction [type=" + type + ", account=" + account + ", timeOfTransaction=" + timeOfTransaction
				+ ", amount=" + amount + ", bankRepresentative=" + bankRepresentative + ", transactionID="
				+ transactionID + "]";
	}
	
	
	
}
