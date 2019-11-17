package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Flow {
	static void db() throws ArithmeticException {
		try {
		System.out.println("DB Connection Open");
		int e = 10/0; // throw new ArithmeticException();
		if(10>2) {
		//return ;
			//System.exit(0);
		}
		System.out.println("DB get Data");
		System.out.println("fill the data in array and return the result");
		}
		finally {
		System.out.println("DB Connection Close");
		}
	}
	static void logic() throws ArithmeticException {
		System.out.println("BL Call Start");
		db();
		System.out.println("Doing some calc on DB Data");
		System.out.println("BL Ends");
	}
	
	static void ui() {
		System.out.println("Output Start");
		try {
		logic();
		}
		catch(ArithmeticException e) {
			System.out.println("U Divide a Number with Zero ");
			// All these messages maintain in log file.
			//System.out.println(e);
			//e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Mis Exception");
		}
		System.out.println("Output Ends");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ui();
		String path = "/Users/amit/Documents/javabatchaugws/exceptionhandling/src/exceptionhandling/Flow.java";
		//int e = 100/0;
		try {
			FileReader fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
