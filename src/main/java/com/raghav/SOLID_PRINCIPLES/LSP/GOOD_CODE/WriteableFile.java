package com.raghav.SOLID_PRINCIPLES.LSP.GOOD_CODE;

public class WriteableFile extends ReadableFile implements Writeable{

	@Override
	public void write() {
		System.out.println("Writing in File");
		
	}

}


/*
 * This implementation follows the Liskov Substitution Principle (LSP).
 *
 * WritableFile extends ReadableFile and also implements
 * writing functionality through the Writable interface.
 *
 * Since it supports all behaviors it promises,
 * it can safely be used wherever a readable or writable
 * file is expected.
 *
 * This design preserves substitutability and
 * avoids breaking parent contracts.
 */