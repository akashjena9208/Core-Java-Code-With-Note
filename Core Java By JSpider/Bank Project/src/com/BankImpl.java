package com;

public class BankImpl implements Bank {
	int balence=5000;
	@Override
	public void deposite(int amount) {
		System.out.println("Deposting "+amount);
		balence =balence+amount;	//balance +=amount
//		System.out.println(" Deposit Sucess Fully $ "+balence);
		System.out.println("----------------------------");
		
	}

	@Override
	public void withdraw(int amount) 
	{
		System.out.println("Withdrawing "+amount);
		balence =balence-amount;	//balance -=amount
//		System.out.println("Amount Witrdraw Sucess Fully");
		System.out.println("----------------------------");
		
		
	}

	@Override
	public void CheackBalence() {
		
		System.out.println("Avilable Balannce "+balence);
		System.out.println("-------------Thank You---------------");
	}

	

}
