package bl;

public class LoanRequest {
	private Account account;
	private int requestedAmount;
	
	public LoanRequest(Account account, int requestAmount) {
		this.account = account;
		this.requestedAmount = requestAmount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(int requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	@Override
	public String toString() {
		return "LoanRequest [account=" + account + ", requestedAmount=" + requestedAmount + "]";
	}
}
