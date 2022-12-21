package com.xworkz.bankapp;

import com.xworkz.bankapp.current.CurrentAccount;

public class CurrentAccountTester {

	public static void main(String arg[]) {
		CurrentAccount teaBusiness = new CurrentAccount();
		CurrentAccount customers = new CurrentAccount();
		teaBusiness.deposit(3497);
		customers.deposit(5000);
		customers.transfer(10, teaBusiness);
		System.out.println("Customers account balance = "+customers.balance);
		System.out.println("Tea Business account balance = "+teaBusiness.balance);
	}
}
