package com.raghav.SOLID_PRINCIPLES.LSP.BAD_CODE;

public class Main {

	public static void main(String[] args) {
		File file=new ReadOnlyFile();
		file.read();//works fine
		file.write();//throw error - voilation of LSP
	}

}
