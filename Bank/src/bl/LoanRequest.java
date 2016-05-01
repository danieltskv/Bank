package bl;

public class LoanRequest {
	enum LoanRequestStatus{Open, Rejected, Approved};
	private static int loanRequestID = 0;

	private Account account;
	private int requestedAmount;
	private LoanRequestStatus loanRequestStatus;

	
	public LoanRequest(Account account, int requestAmount) {
		this.account = account;
		this.requestedAmount = requestAmount;
		
		loanRequestID++;
		this.loanRequestStatus = LoanRequestStatus.Open;
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

	public static int getLoanRequestID() {
		return loanRequestID;
	}

	public LoanRequestStatus getLoanRequestStatus() {
		return loanRequestStatus;
	}

	public void setLoanRequestStatus(LoanRequestStatus loanRequestStatus) {
		this.loanRequestStatus = loanRequestStatus;
	}

}
