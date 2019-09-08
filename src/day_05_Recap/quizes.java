package day_05_Recap;

public class quizes {
	
	public static void main(String[] args) { // static public void main(String[] args){} 
											//  public static void main (String...) {}   are also correct.
		
	
	
	/*not valid codes:						valid codes:
	 
	 * int _abc=20;							int abc_ =10;
	 * int &abc=30;							int abc$ =20;
	 * int 3abc=10;							int abc3 =30;
	 * long abc=1,000,000;					long abc= 1_000_000;
	 * float abc = 5.5;						float abc=5;			(with decimals there is used with f or F)
	 * 										float abc=2.5f;
	 * 
	 * 
	 * 
	 * 
	 */
	
// Range: double > float > long > int > short > byte
		
		
// examples of valid/invalid command
		
		
		int myNum3 = '9';
		System.out.println( myNum3 );  // prints the corresponding number in ASCII 57
		
		int i =100;
		double d = 300L;
		float f =200f;
		 //i=f;
		 f=i;
		 
		
		
// javac: java command to change java doc to class doc		
// pwd(print working directory): shows us which dir we are in
// ls: lists all the sources in the current dir
// JVM: java virtual machine
// JRE: java runtime enviroment
// JDK: java development kid
		 
		 /*
		  * \n(or \r): breaks the line goes to next line
		  * \t: horizontal tab
		  * \\: prints single slash
		  *\': prints ' 
		  
		  */
		
		System.out.println("Line1 \nline2");
		System.out.println("/tabcd\tABCD");
		System.out.println();
		System.out.println();
}
}
