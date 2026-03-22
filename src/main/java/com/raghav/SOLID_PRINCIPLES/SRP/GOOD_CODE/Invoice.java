package com.raghav.SOLID_PRINCIPLES.SRP.GOOD_CODE;



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
	
}

//This implementation follows the Single Responsibility Principle (SRP).
//
//Responsibilities are divided into separate classes:
//- One class handles business logic
//- One class handles database operations
//- One class handles notifications
//
//Each class has only one responsibility and one reason to change.
//
//This makes the code more modular, easier to test, maintain, and extend.
//It also improves readability and reduces coupling between components.
