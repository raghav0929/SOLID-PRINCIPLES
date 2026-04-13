package com.raghav.SOLID_PRINCIPLES.ISP.BAD_CODE;

public class SimplePrinter implements Machine {

	@Override
	public void print(Document doc) {
		System.out.println("Printing Document");
		
	}

	@Override
	public void scan(Document doc) {
		throw new UnsupportedOperationException("Scan Not supproted"); 
		
	}

	@Override
	public void copy(Document doc) {
		throw new UnsupportedOperationException("Copy Not supproted"); 
		
	}

}



/*
 * This implementation violates the Interface Segregation Principle (ISP).
 *
 * The Machine interface contains multiple methods
 * such as print(), scan(), and copy().
 *
 * SimplePrinter is forced to implement all these methods
 * even though it only supports printing.
 *
 * This leads to unnecessary methods and runtime exceptions
 * for unsupported operations.
 *
 * Classes should not be forced to depend on methods
 * they do not need.
 */