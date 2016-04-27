package bl;

import java.time.LocalDateTime;

public class Transaction {
	private static int transactionNumber = 0;
	
	private Account account;
	private LocalDateTime timeOfTransaction;
	private int amount;
	private String bankRepresentative;
	private String actionType;
	
	public Transaction(Account account, int amount, String bankRepresentative, String actionType)  {
		this.account = account;
		this.amount = amount;
		this.bankRepresentative = bankRepresentative;
		this.actionType = actionType;
		
		this.timeOfTransaction = LocalDateTime.now();
		this.transactionNumber++;
	}

	public static int getTransactionNumber() {
		return transactionNumber;
	}

	public static void setTransactionNumber(int transactionNumber) {
		Transaction.transactionNumber = transactionNumber;
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

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	
	
}
