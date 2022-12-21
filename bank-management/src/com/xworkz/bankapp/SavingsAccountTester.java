package com.xworkz.bankapp;

import com.xworkz.bankapp.saving.SavingsAccount;

public class SavingsAccountTester extends BankAccountTester{
	
	public static void main(String arg[]) {
		SavingsAccount savingsAccount = new SavingsAccount();
		SavingsAccount momAccount = new SavingsAccount();
		momAccount.deposit(3400);
		momAccount.transfer(1300, savingsAccount);
		System.out.println("My account balance = "+savingsAccount.balance);
		System.out.println("Mom account balance = "+momAccount.balance);
		savingsAccount.periodicInterest(1300, 0.5);
		System.out.println("Add interest & New balance = "+savingsAccount.newBalance);
	}
}
