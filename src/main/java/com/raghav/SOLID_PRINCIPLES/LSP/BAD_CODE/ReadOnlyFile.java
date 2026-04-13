package com.raghav.SOLID_PRINCIPLES.LSP.BAD_CODE;

public class ReadOnlyFile extends File {

	public void write()
	{
		throw new UnsupportedOperationException("Cant write in Read Only File");
	}
}



/*
 * This implementation violates the Liskov Substitution Principle (LSP).
 *
 * ReadOnlyFile extends File, which means it should be
 * usable anywhere a File object is expected.
 *
 * However, the parent class provides both read() and write() methods,
 * while ReadOnlyFile cannot support write().
 *
 * Throwing UnsupportedOperationException in write()
 * breaks the expected behavior of the parent class.
 *
 * This means ReadOnlyFile cannot safely replace File
 * without causing runtime failures.
 *
 * A child class must preserve the contract of its parent.
 */