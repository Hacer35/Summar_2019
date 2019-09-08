package day_03_Variables;

public class EscapeSequences {
	/*
	 * \n(or \r): starts from new line
	 * \t: horizontal tab
	 * \\: prints a back slash
	 * \': prints single code
	 * \": prints double code
	 * 
	 * \:backslash
	 */:frontslash
	 */

	public static void main(String[] args) {
		
		System.out.println("Hello Cybertek \nBatch12 students");
		
		System.out.print("Tomorrow is off\n");
		System.out.print("True\n");
		System.out.print("False\n\n\n");
		
		System.out.println("\tClass starts tomorrow.");
		
		System.out.println("\\hacer");
		System.out.println("\'java");
		System.out.println("Book is called \"Hello\".");
	}
}
