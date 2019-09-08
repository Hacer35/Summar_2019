package day_15;

import java.util.Scanner;

/*
 * package name : java.util
 * class name: scanner
 */
// import java.util.*; ==> wild scanner
//imports all the classes from java.util

public class ScannerClass {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	System.out.println("Enter byte value");
		byte num = input.nextByte();
		
	System.out.println("Enter short value");
		short num2 = input.nextShort();
		
	System.out.println("Enter int value");
		int num3 = input.nextInt();
		
	System.out.println("Enter long value");
		long num4 = input.nextLong();
		
	System.out.println("Enter boolean value");	
		boolean result = input.nextBoolean();
		
	System.out.println("Enter float value");
		float num5 = input.nextFloat();
		float a = 4.5f;
		
	System.out.println("Enter double value");
		double num6 = input.nextDouble();
		
		
		
		
	}

}
