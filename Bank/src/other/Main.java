package other;

import entities.Account;
import entities.Address;
import entities.CustomerDetails;
import entities.Deposit;
import entities.Loan;
import entities.Restriction;

public class Main {

	public static void main(String[] args) {
		Address add = new Address("Tel Aviv", "Gnessin", 4);
		add.setAddressID(1);
		System.out.println(add);
		CustomerDetails customer = new CustomerDetails("Michael", add, 528287182L);
		customer.setCustomerID(1);
		Account acc = new Account(customer);
		acc.setAccountID(1);
		customer.addAccountToCustomer(acc);
		try {
			acc.withdrawOrDeposit(900);
			System.out.println(acc);
			acc.withdrawOrDeposit(-90);
			System.out.println(acc);
			Loan loan = new Loan(111, acc, 800, 8);
			loan.setLoanID(1);
			acc.addLoan(loan);
			System.out.println(acc.getLoans());
			System.out.println(acc);
			Deposit dep = new Deposit(acc, 1000);
			dep.setDepositID(1);
			acc.addDeposit(dep);
			System.out.println(acc);
			//acc.withdrawFromDeposit(3000);
			acc.withdrawFromDeposit(500);
			
			acc.withdrawFromDeposit(500);
			System.out.println(acc);
			acc.returnLoan();
			System.out.println(acc);
			//acc.closeAccount();
			Restriction res = new Restriction(acc, 800, loan);
			System.out.println(res);
			res.setRestrictionID(1);
			System.out.println(res);

			acc.addRestriction(res);
			System.out.println(acc);
			acc.cancelRestriction();
			System.out.println(acc);
			acc.withdrawOrDeposit(-810);
			acc.closeAccount();
			System.out.println(acc);
			//keep testing close account, restrictions, maybe fix print of arraylist
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
