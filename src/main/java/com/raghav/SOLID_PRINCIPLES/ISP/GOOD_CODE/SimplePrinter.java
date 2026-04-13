package com.raghav.SOLID_PRINCIPLES.ISP.GOOD_CODE;

import com.raghav.SOLID_PRINCIPLES.ISP.BAD_CODE.Document;

public class SimplePrinter implements Printer {

	@Override
	public void print(Document doc) {
		// TODO Auto-generated method stub
		
	}

}
/*
 * This implementation follows the Liskov Substitution Principle (LSP).
 *
 * SimplePrinter implements only the Printer interface
 * because it only supports printing functionality.
 *
 * Unlike the bad design, it is not forced to implement
 * unsupported methods like scan() or copy().
 *
 * This makes the class fully substitutable for Printer
 * without breaking client expectations.
 *
 * The design is clean, safe, and aligned with proper abstraction.
 */