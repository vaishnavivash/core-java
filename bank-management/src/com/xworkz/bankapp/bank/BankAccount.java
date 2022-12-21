package com.xworkz.bankapp.bank;

public class BankAccount {

	public String name;
	public String ifscCode;
	public int accountNo;
	public double balance;
	
	public double withDraw(double balance) {
		System.out.println("Amount to be withDraw = "+balance);
		this.balance = this.balance-balance;
		return this.balance;
	}
	
	public double deposit(double balance) {
		System.out.println("Amount to be desposited = "+balance);
		this.balance = this.balance+balance;
		return this.balance;
	}
	
	public void transfer(double amount, BankAccount friendAccount) {
		withDraw(amount);
		friendAccount.deposit(amount);
		System.out.println("Amount Transfer is done");
	}
}
