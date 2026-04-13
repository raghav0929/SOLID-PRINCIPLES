package com.raghav.SOLID_PRINCIPLES.ISP.GOOD_CODE;

import com.raghav.SOLID_PRINCIPLES.ISP.BAD_CODE.Document;

public class MultiPurposeMachine implements Printer,CopyMachine,Scanner{

	@Override
	public void print(Document doc) {
		System.out.println("Printing Document");
		
	}

	@Override
	public void scan(Document doc) {
		System.out.println("Scanning Document");
		
	}

	@Override
	public void copy(Document doc) {
		System.out.println("Copying Document");
		
	}

	

}

/*
 * This implementation follows the Interface Segregation Principle (ISP).
 *
 * Instead of using one large interface with multiple methods,
 * the functionality is divided into smaller, specific interfaces
 * such as Printer, Scanner, and CopyMachine.
 *
 * MultiPurposeMachine implements all the interfaces
 * because it supports all these operations.
 *
 * This design keeps interfaces focused and allows classes
 * to implement only the behaviors they actually need.
 *
 * It improves flexibility, readability, and maintainability.
 */