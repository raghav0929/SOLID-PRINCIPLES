package com.raghav.SOLID_PRINCIPLES.LSP.BAD_CODE;

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
 * This implementation violates the Liskov Substitution Principle (LSP).
 *
 * The Machine interface forces every implementing class to provide
 * print(), scan(), and copy() methods.
 *
 * However, SimplePrinter only supports printing.
 * It is still forced to implement scan() and copy(),
 * where it throws UnsupportedOperationException.
 *
 * This is a violation of LSP because a subclass or implementation
 * should be completely replaceable for its parent type without
 * breaking expected behavior.
 *
 * If any code uses Machine and calls scan() or copy(),
 * substituting it with SimplePrinter will cause runtime failure.
 *
 * This indicates that the abstraction is poorly designed.
 */