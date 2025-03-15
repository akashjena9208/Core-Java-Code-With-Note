package com;

class BankImp  implements Bank{

	int balence=5000;
	@Override
	public void deposite(int amount) {
		System.out.println("Deposting "+amount);
		balence =balence+amount;	//balance +=amount
		System.out.println("Amount Depodit Sucess Fully");
		
	}

	@Override
	public void withdraw(int amount) 
	{
		System.out.println("Withdrawing "+amount);
		balence =balence-amount;	//balance -=amount
		System.out.println("Amount Witrdraw Sucess Fully");
		
		
	}

	@Override
	public void CheackBalence() {
		
		System.out.println("Avilable Balannce "+balence);
	}

}
