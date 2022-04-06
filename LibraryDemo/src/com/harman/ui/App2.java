package com.harman.ui;

public class App2 {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("Two arguments Must be given");
			System.exit(0);
		}
		int FirstNumber =Integer.parseInt(args[0]);
		int SecondNumber = Integer.parseInt(args[1]);
		int Result;
		
		Result= FirstNumber+SecondNumber;
		System.out.println("Sum = "+ Result);
		
		Result= FirstNumber-SecondNumber;
		System.out.println("Difference = "+ Result);
		if(SecondNumber ==0) {
			System.out.println("Second Number is zero");
			System.exit(0);
		}
		Result= FirstNumber/SecondNumber;
		System.out.println("Quotient = "+ Result);
		}
	

}
