package bl;

import java.util.ArrayList;

public class CustomerDetails {
	private String customerName;
	private ArrayList<Account> accounts;
	private Address address;
	private Long phoneNumber;
	
	public CustomerDetails(String customerName, Address address, Long phoneNumber) {
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
		this.accounts = new ArrayList<>();
	}
	
	public void addAccountToCustomer(Account account) {
		this.accounts.add(account);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
