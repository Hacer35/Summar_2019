package day_10;

public class Nested_if {
	/*
	 * Nested if:
	 * if (condition){
	 * 	if (condition2){
	 *      //some codes to run
	 * 	}
	 * }
	 */

	
	
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello"); //prints
			if (false) {
				System.out.println("WWW");
			}else {
				System.out.println("Team"); //prints too
			}
		}
		
		
		/*
		 *  90 <= grade <=100 ==> A
		 * 80 <= grade < 90 ==> B
		 * 70 <= grade < 80 ==> C
		 * 60 <= grade < 70 ==> D
		 * 50<=grade<60 ==>F
		 * 40<=grade<50 ==>G
		 * 30<=grade<40 ==>H
		 * 20<=grade<30 ==> I
		 * 10<=grade<20 ==>J
		 * 0<=grade<10 ==> K
		 */
		
		
int grade = 0;
		if (grade >=0 && grade<=100) {
			System.out.print("you passed");
		
			if (90 <= grade && grade <=100) {
			System.out.println(" within A, Great Job!");
		} else if(80 <= grade && grade < 90) {
			System.out.println("within B,Good");
		} else if (70 <= grade && grade < 80) {
			System.out.println("within C");
		} else  if (60<=grade && grade<70){
			System.out.println("within D");
		} else if (50<=grade && grade<60) {
			System.out.println("within F");
		} else if (40<=grade && grade<50) {
			System.out.println(" within G");
		} else if (30<=grade && grade<40) {
			System.out.println(" within H");
		}else if (20<=grade && grade<30) {
			System.out.println(" within I");
		} else if (10<=grade && grade<20) {
			System.out.println("within J");
		}else  {
			System.out.println("within K");
		}
		}
		
			else {  // greater than 100 or less than 0
				System.out.println("Invalid error-404");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
