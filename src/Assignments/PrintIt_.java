package Assignments;

import java.util.Scanner;

public class PrintIt_ {
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
	    int num1 = scan1.nextInt();
	    int num2= scan1.nextInt();
	    int num3 = scan1.nextInt();
	    int sum =num1+num2+num3;
	    System.out.println("Sum of numbers: "+sum);
		
		
		
	}

}
