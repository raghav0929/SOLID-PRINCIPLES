package com.raghav.SOLID_PRINCIPLES.LSP.GOOD_CODE;

public class Main {

	public static void main(String[] args) {
		ReadableFile file=new ReadableFile();
		file.read();//works fine
		
		WriteableFile file2=new WriteableFile();
		file2.read();
		file2.write();
	}

}
