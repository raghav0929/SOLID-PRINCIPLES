package com.raghav.SOLID_PRINCIPLES.OCP.GOOD_CODE;

public class PaymentProcessor {

	public void ProcessPyament(PaymentMethod pm,double amount)
	{
		pm.pay(amount);
	}
}


//This implementation follows the Open/Closed Principle (OCP).
//
//The system is designed to be open for extension but closed for modification.
//
//Instead of adding multiple conditional checks (if/else) for different payment methods,
//a common PaymentMethod interface is introduced with a pay() method.
//
//Each payment type (CreditCard, DebitCard, Cash, etc.) implements this interface
//and provides its own implementation of the pay() method.
//
//The PaymentProcessor depends on the abstraction (PaymentMethod) rather than concrete classes,
//and simply calls the pay() method.
//
//Now, to add a new payment method, we only need to create a new class implementing PaymentMethod,
//without modifying existing code.
//
//This reduces code changes, avoids condition-heavy logic, and improves scalability and maintainability.