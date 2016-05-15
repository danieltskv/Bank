package entities;

public class LoanRequest {
	enum LoanRequestStatus{Open, Rejected, Approved};

	private Account account;
	private int requestedAmount;
	private LoanRequestStatus loanRequestStatus;
	
	private int loanRequestID;
	
	public LoanRequest(Account account, int requestAmount) {
		this.account = account;
		this.requestedAmount = requestAmount;
		
		this.loanRequestStatus = LoanRequestStatus.Open;
		
		/* LoanRequest ID set after creation according to DB */
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

	public LoanRequestStatus getLoanRequestStatus() {
		return loanRequestStatus;
	}

	public void setLoanRequestStatus(LoanRequestStatus loanRequestStatus) {
		this.loanRequestStatus = loanRequestStatus;
	}

	public int getLoanRequestID() {
		return loanRequestID;
	}

	public void setLoanRequestID(int loanRequestID) {
		this.loanRequestID = loanRequestID;
	}

	@Override
	public String toString() {
		return "LoanRequest [account=" + account + ", requestedAmount=" + requestedAmount + ", loanRequestStatus="
				+ loanRequestStatus + ", loanRequestID=" + loanRequestID + "]";
	}


}
