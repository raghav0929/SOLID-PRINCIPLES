package com.raghav.SOLID_PRINCIPLES.SRP.BAD_CODE;

public class Invoice {

	private double amount;
	
	public Invoice(double amount)
	{
		this.amount=amount;
	}
	
	//addtional functionality
	public void generateInvoice()
	{
		System.out.println("Your invoice is generated with bill "+amount);
	}
	
	public void saveToDatabase()
	{
		System.out.println("Saving invoice to Database");
	}
	
	public void sendNotification()
	{
		System.out.println("Sending Notification for invoice");
	}
}


//This implementation violates the Single Responsibility Principle (SRP).
//
//Here, a single class is handling multiple responsibilities such as:
//- Business logic
//- Database operations
//- Sending notifications
//
//This makes the class tightly coupled and harder to maintain.
//
//Any change in database logic or notification logic will require modifying the same class,
//which means it has multiple reasons to change — directly violating SRP.
//
//Such code is difficult to test, reuse, and extend.