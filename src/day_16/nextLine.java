package day_16;

import java.util.Scanner;

public class nextLine {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name and phone num");
		int pn=scan.nextInt();
		// to be able to use nextline with other next, nextbyte, nextint,.. 
				//you must give one another nexline first
		scan.nextLine();  //if you do not give this line it does not let you type and move on
		String name=scan.nextLine();
		//nextline will take everything in scanner's memory up to the new line
		
	}

}
