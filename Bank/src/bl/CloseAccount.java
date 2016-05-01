package bl;

import java.time.LocalDateTime;

public class CloseAccount {
	private LocalDateTime timeOfClose;
	private Account account;
	private String reason;
	
	public CloseAccount(Account account, String reason) {
		this.account = account;
		this.reason = reason;
		
		this.timeOfClose = LocalDateTime.now();
	}

	public LocalDateTime getTimeOfClose() {
		return timeOfClose;
	}

	/*
	public void setTimeOfClose(LocalDateTime timeOfClose) {
		this.timeOfClose = timeOfClose;
	}
	*/

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "CloseAccount [timeOfClose=" + timeOfClose + ", account=" + account + ", reason=" + reason + "]";
	}
	
	
	
}
