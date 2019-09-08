package day_12;

public class IFStatement_WithoutCurlyBrace {

	public static void main(String[] args) {
		
//ex1:		
		if (true) {
			System.out.println("HELLO");
			System.out.println("HELLO");
			System.out.println("HELLO");
			System.out.println("HELLO");
			System.out.println("HELLO");
		}
		else {
			System.out.println("WORLD");
		}
		
		
//without curly brace: single line of satement
		
		if(true)
			System.out.println("HELLO");
		// System.out.println("HELLO"); cannot hold more than 1 line
		else
			System.out.println("WORLD");
		
//ex2:		
		if (true) {
			if(true) {
				System.out.println("WORLD");
			}
			else {
				System.out.println("WORLD");	
			}
			}
		
		System.out.println("==========================");
//without curly brace:	
		
		if (true) 
			if(true) 
				System.out.println("WORLD");
			else 
				System.out.println("WORLD");	
		else 
			System.out.println("invalid");
		
		
//ex3:
		int grade= 20;
		
		if(grade>=90) {
			System.out.println("A");
		}
		else if (grade>=80) {
			System.out.println("B");
		}
		else if (grade>=70) {
			System.out.println("C");
		}	
//without curly brace:		
	if (grade>=0 && grade<=100)	
		if(grade>=90) System.out.println("A");
		else if (grade>=80) System.out.println("B");
		else if (grade>=70) System.out.println("C");
		else System.out.println("Failed");
	else System.out.println("Invalid");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
