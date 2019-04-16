package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramInheritance2 {

	public static void main(String[] args) {

//		Account acc = new Account(1001, "Alex", 0.0);
//		System.out.println("----------------------------------------------------------------");
//		System.out.println("Account acc = new Account(1001, \"Alex\", 0.0);");
//		System.out.println("----------------------------------------------------------------");
//		System.out.println("acc Number: " + acc.getNumber());
//		System.out.println("acc Holder: " + acc.getHolder());
//		System.out.println("acc Balance: " + acc.getBalance());
//		System.out.println("acc Class: " + acc.getClass());
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		System.out.println("----------------------------------------------------------------");
		System.out.println("BusinessAccount bacc = new BusinessAccount(1002, \"Maria\", 0.0, 500.0);");
		System.out.println("----------------------------------------------------------------");
		System.out.println("bacc Number: " + bacc.getNumber());
		System.out.println("bacc Holder: " + bacc.getHolder());
		System.out.println("bacc Balance: " + bacc.getBalance());
		System.out.println("bacc Class: " + bacc.getClass());
		
		// UPCASTING

		Account acc1 = bacc; 
		System.out.println("----------------------------------------------------------------");
		System.out.println("Account acc1 = bacc;");
		System.out.println("----------------------------------------------------------------");
		System.out.println("acc1 Number: " + acc1.getNumber());
		System.out.println("acc1 Holder: " + acc1.getHolder());
		System.out.println("acc1 Balance: " + acc1.getBalance());
		System.out.println("acc1 Class: " + acc1.getClass());
		
		Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 200.0);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Account acc2 = new BusinessAccount(1003, \"Bob\", 1000.0, 200.0);");
		System.out.println("----------------------------------------------------------------");
		System.out.println("acc2 Number: " + acc2.getNumber());
		System.out.println("acc2 Holder: " + acc2.getHolder());
		System.out.println("acc2 Balance: " + acc2.getBalance());
		System.out.println("acc2 Class: " + acc2.getClass());
		
		Account acc3 = new SavingsAccount(1004, "Anna", 2000.0, 0.01);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Account acc3 = new SavingsAccount(1004, \"Anna\", 2000.0, 0.01);");
		System.out.println("----------------------------------------------------------------");
		System.out.println("acc3 Number: " + acc3.getNumber());
		System.out.println("acc3 Holder: " + acc3.getHolder());
		System.out.println("acc3 Balance: " + acc3.getBalance());
		System.out.println("acc3 Class: " + acc3.getClass());

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		System.out.println("----------------------------------------------------------------");
		System.out.println("BusinessAccount acc4 = (BusinessAccount) acc2;");
		System.out.println("acc4.loan(100.0);");
		System.out.println("----------------------------------------------------------------");
		System.out.println("acc4 Number: " + acc4.getNumber());
		System.out.println("acc4 Holder: " + acc4.getHolder());
		System.out.println("acc4 Balance: " + acc4.getBalance()); 
		System.out.println("acc4 LoanLimit: " + acc4.getLoanLimit());
		System.out.println("acc4 Class: " + acc4.getClass());
		
		// BusinessAccount acc5 = (BusinessAccount)acc2;
		if (acc2 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc2;
			acc5.loan(200.0);
			System.out.println("----------------------------------------------------------------");
			System.out.println("BusinessAccount acc5 = (BusinessAccount)acc2");
			System.out.println("----------------------------------------------------------------");
			System.out.println("acc5 Number: " + acc5.getNumber());
			System.out.println("acc5 Holder: " + acc5.getHolder());
			System.out.println("Loan!");
			System.out.println("acc5 LoanLimit: " + acc5.getLoanLimit());
			System.out.println("acc5 Balance: " + acc5.getBalance());
			System.out.println("acc5 Class: " + acc5.getClass());
		}

		// BusinessAccount acc6 = (SavingsAccount)acc3;
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc6 = (SavingsAccount) acc3;
			acc6.updateBalance();
			System.out.println("----------------------------------------------------------------");
			System.out.println("BusinessAccount acc6 = (SavingsAccount)acc3");
			System.out.println("----------------------------------------------------------------");
			System.out.println("acc6 Number: " + acc6.getNumber());
			System.out.println("acc6 Holder: " + acc6.getHolder());
			System.out.println("Update!");
			System.out.println("acc6 InterestRate: " + acc6.getInterestRate());
			System.out.println("acc6 Balance: " + acc6.getBalance());
			System.out.println("acc5 Class: " + acc6.getClass());
		}
	}
}