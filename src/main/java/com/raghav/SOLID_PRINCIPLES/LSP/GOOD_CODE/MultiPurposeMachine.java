package com.raghav.SOLID_PRINCIPLES.LSP.GOOD_CODE;

import com.raghav.SOLID_PRINCIPLES.LSP.BAD_CODE.Document;

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
 * This implementation follows the Liskov Substitution Principle (LSP).
 *
 * MultiPurposeMachine implements only the interfaces
 * that match its actual capabilities: printing, scanning, and copying.
 *
 * Since it fully supports all the behaviors promised by
 * Printer, Scanner, and CopyMachine,
 * it can safely replace any of these abstractions
 * without causing unexpected behavior.
 *
 * This ensures reliable substitution and maintains
 * the contract defined by the parent interfaces.
 */