package org;
//Shared Resources
public class Bank {
		synchronized void wihdreaw(String name)
		{
			System.out.println(name +" Withdraw  the Money");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name+"Has finshed Withdraw");
		}
}
