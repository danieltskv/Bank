package other;

import entities.Account;
import entities.Address;
import entities.CustomerDetails;
import entities.Deposit;
import entities.Loan;

public class Main {

	public static void main(String[] args) {
		CustomerDetails customer = new CustomerDetails("Michael", new Address("Tel Aviv", "Gnessin", 4), 528287182L);
		Account acc = new Account(customer);
		customer.addAccountToCustomer(acc);
		try {
			acc.withdrawOrDeposit(900);
			System.out.println(acc);
			acc.withdrawOrDeposit(-90);
			System.out.println(acc);
			Loan loan = new Loan(111, acc, 800, 8);
			acc.addLoan(loan);
			System.out.println(acc.getLoans());
			System.out.println(acc);
			acc.addDeposit(new Deposit(acc, 1000));
			System.out.println(acc);
			//acc.withdrawFromDeposit(3000);
			acc.withdrawFromDeposit(500);
			
			acc.withdrawFromDeposit(500);
			System.out.println(acc);
			acc.returnLoan();
			System.out.println(acc);
			acc.closeAccount();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
