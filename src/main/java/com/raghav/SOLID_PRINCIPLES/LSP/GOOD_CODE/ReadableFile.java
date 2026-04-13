package com.raghav.SOLID_PRINCIPLES.LSP.GOOD_CODE;

public class ReadableFile implements Readable {

	@Override
	public void read() {
		System.out.println("Reading from File");
		
	}

}


/*
 * This implementation follows the Liskov Substitution Principle (LSP).
 *
 * ReadableFile only implements reading behavior
 * because it is designed specifically for read operations.
 *
 * It fully satisfies the contract of the Readable interface
 * and can safely replace it wherever required.
 *
 * No unsupported behavior is introduced.
 */