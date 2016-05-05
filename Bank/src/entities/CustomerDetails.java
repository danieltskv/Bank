package entities;

import java.util.ArrayList;

public class CustomerDetails {
	private String customerName;
	private ArrayList<Account> accounts;
	private Address address;
	private Long phoneNumber;
	
	private int customerID;
	
	public CustomerDetails(String customerName, Address address, Long phoneNumber) {
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
		this.accounts = new ArrayList<>();
		
		/* customer ID set after creation according to DB */
	}
	
	public void addAccountToCustomer(Account account) {
		getAccounts().add(account);
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

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", accounts=" + accounts + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", customerID=" + customerID + "]";
	}


}
