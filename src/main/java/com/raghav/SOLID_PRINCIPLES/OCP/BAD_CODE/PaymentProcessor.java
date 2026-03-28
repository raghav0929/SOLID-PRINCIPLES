package com.raghav.SOLID_PRINCIPLES.OCP.BAD_CODE;

public class PaymentProcessor {

	public void ProcessPyament(String PaymentMethod,double amount)
	{
		if(PaymentMethod.equals("CreditCard"))
		{
			//Business Logic 
			System.out.println("Paying through Credit Card "+amount);
		}
		if(PaymentMethod.equals("Cash"))
		{
			//Business Logic 
			System.out.println("Paying through Cash "+amount);
		}
		if(PaymentMethod.equals("DebitCard"))
		{
			//Business Logic 
			System.out.println("Paying through Debit Card  "+amount);
		}
	}
	
}


//This implementation violates the Open/Closed Principle (OCP).
//
//The PaymentProcessor class directly handles multiple payment types using conditional logic
//(if/else or switch statements) to determine how each payment is processed.
//
//Whenever a new payment method is introduced, the existing PaymentProcessor class must be modified
//to add new conditions.
//
//This makes the code:
//- Hard to extend without changing existing logic
//- Prone to bugs when modifying working code
//- Difficult to maintain as the number of conditions grows
//
//The class is not closed for modification, as every new feature requires editing the same code,
//which directly violates OCP.
