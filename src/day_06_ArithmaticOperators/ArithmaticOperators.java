package day_06_ArithmaticOperators;

public class ArithmaticOperators {
	
	/*
	 * +: addition
	 * -:suptraction
	 * *: multiplication
	 * /: division
	 *  %: remainder, returns the remainder from division
	 */

	public static void main(String[] args) {
		
		int a =100;
		int b = a - 400; // -300;
		int c = a+b ; // 100+ -300 = -200
System.out.println(c);
		int X =3, Y=5, Z=X*Y;  //15;
System.out.println(Z);
		
		double length =100,
				wedith=10,
				Area= length * wedith;
System.out.println(Area);  

System.out.println( 3+ 5+ 4 -2 );
			//8+ 4- 2 =10

		//double resultNum = 9/0; Denomitor cannot be 0 as it is in Math.
				
	    //short Number1= 10/3;not a whole number so invalid
		double Number1=10/3.0; // if you want whole number, you write 10\3
System.out.println(Number1);   // if you want decimal, then write 10.0/3 or 10/3.0, or 10/3f;
	
		int outcome = 12+6/3;  // apply order of operation as it is in Math.
		//6/3=2   12+2=14   
System.out.println(outcome);

System.out.println(10/2-3);  //=2
System.out.println(8+12*2);  //14

//%: same as it is in MAth
		/*
		 * 10/3 ==> 3with remainder of 1
		 * 12/5 ==> 2with remainder (12- (5*2) )=2
		 * 20/3 =6 ==> the remainder is 20-(6*3) =2
		 */
double result1 = 12/5;
System.out.println(result1);
System.out.println(12%5); //2
 
		int Number20= 20%2; //even number
		int Number45 = 45%2; //odd number
		
System.out.println(Number20);
System.out.println(Number45);

System.out.println(4+17%2-1); //4+1-1=4
System.out.println(6-3*2+7-1); //6-6+7-1=6

/*order of operation
 * 
 * (), %, (*,/), (+,-)
 * 
 */

System.out.println(3+4*4+5*(4+3));  // 3+4*4+5*7=3+16+35=54






	}
}
