package com.raghav.SOLID_PRINCIPLES.ISP.BAD_CODE;

public interface Machine {

	void print(Document doc);
	
	void scan(Document doc);
	
	void copy(Document doc);
}
