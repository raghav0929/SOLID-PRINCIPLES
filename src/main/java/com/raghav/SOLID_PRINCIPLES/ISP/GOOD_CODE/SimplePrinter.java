package com.raghav.SOLID_PRINCIPLES.ISP.GOOD_CODE;

import com.raghav.SOLID_PRINCIPLES.ISP.BAD_CODE.Document;

public class SimplePrinter implements Printer {

	@Override
	public void print(Document doc) {
		// TODO Auto-generated method stub
		
	}

}



/*
 * This implementation follows the Interface Segregation Principle (ISP).
 *
 * SimplePrinter implements only the Printer interface
 * because it only supports printing functionality.
 *
 * It is not forced to implement unnecessary methods
 * like scan() or copy().
 *
 * This prevents unused methods and avoids
 * UnsupportedOperationException scenarios.
 *
 * The design ensures that classes depend only
 * on the methods they actually use.
 */