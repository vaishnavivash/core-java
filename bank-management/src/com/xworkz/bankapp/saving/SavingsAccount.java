package com.xworkz.bankapp.saving;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingsAccount extends BankAccount{
	
	public double newBalance;

	public double periodicInterest(double amount, double interst) {
		this.newBalance = balance+(amount*interst);
		return newBalance;
	}
}
