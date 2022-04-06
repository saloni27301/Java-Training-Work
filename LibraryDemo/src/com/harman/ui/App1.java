package com.harman.ui;

public class App1 {

	public static void main(String[] args) {
		try {
		int FirstNumber =Integer.parseInt(args[0]);
		int SecondNumber = Integer.parseInt(args[1]);
		int Result;
		
		Result= FirstNumber+SecondNumber;
		System.out.println("Sum = "+ Result);
		
		Result= FirstNumber-SecondNumber;
		System.out.println("Difference = "+ Result);
		try {
		Result= FirstNumber/SecondNumber;
		System.out.println("Quotient = "+ Result);
		}catch(ArithmeticException excep){
			System.out.println("demonitor Should not be Zero");
		}
		}catch(ArrayIndexOutOfBoundsException excep) {
			System.err.println("No command line arguments are Given");
		}finally {
			System.out.println("Exception Handled");
		}
	
		
	}

}
