package com.raghav.SOLID_PRINCIPLES.OCP.GOOD_CODE;

public class CreditCard implements PaymentMethod{

	@Override
	public void pay(double amount) {
		
		//Business Logic
		System.out.println("Paying through Credit Card "+amount);
		
	}

}
