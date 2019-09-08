package day_15;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
/*
 * Write a program that asks user to enter first name and then last name.
 * At the end system should display user full name.
 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
			String firstName = input.nextLine();
			
		System.out.println("Enter your last name: ");
		    String lastName = input.next();
		    
		    String fullname= lastName+" "+firstName;
		    
		System.out.println("Your full name is : " + firstName+lastName);
		System.out.println(fullname);
		
		System.out.println("Enter");
		
		input.close();
		
		
		
	}

}
