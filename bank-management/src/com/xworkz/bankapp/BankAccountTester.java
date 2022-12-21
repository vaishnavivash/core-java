package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;

public class BankAccountTester {
	
	public static void main(String arg[]) {
		BankAccount account = new BankAccount();
		account.name = "SIB";
		account.ifscCode = "SIBN000099";
		account.accountNo = 25678954;
		
		account.deposit(3000);
		System.out.println("My account balance = "+account.balance);
		
		BankAccount friendAccount = new BankAccount();
		friendAccount.deposit(400);
		System.out.println("Friend account balance = "+friendAccount.balance);
		
		account.transfer(700, friendAccount);
		System.out.println("My account balance = "+account.balance);
		System.out.println("Friend account balance = "+friendAccount.balance);
		
		System.out.println(account.name+" "+account.ifscCode+" "+account.accountNo);
	}
}//Inheritance:- Acquiring properties from one class to Another class i.e from Parent to child class/ Super to sub class/ Base to derived class
//is a relationship
//extends keyword
//class level
