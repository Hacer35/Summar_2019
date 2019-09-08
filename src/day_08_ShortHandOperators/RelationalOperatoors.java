package day_08_ShortHandOperators;

public class RelationalOperatoors {
	public static void main(String[] args) {
		/*
		 * >:
		 * >=: greater or equal
		 * <:
		 * <=:
		 * ==:
		 * !=: not equal
		 * ! :logical opposite
		 * =: assign
		 */
		
System.out.println(10>9);  // true
boolean resultA = 10>9;
System.out.println(resultA); // true

System.out.println(10>=9);
boolean resultB = 10>=9;
System.out.println(resultB);// true

boolean resultC = 10<=9;
System.out.println(resultC); //false

boolean resultD = 1100<1200;
System.out.println(resultD);// true

boolean resultE =1000<1000;
System.out.println(resultE); //false

boolean resultF = 1000<=1000;
System.out.println(resultF);  // true

//==:

boolean resultG = 19 ==19;
System.out.println(resultG);

//! : opposite

boolean resultH = 20!=20;
System.out.println(resultH);

boolean A = ! false; //true
System.out.println(A);

boolean B = !true; // false


/*
 * in java  
 * true==true; ==>true
 * false==false; ==>true
 * !false = true; ==> true
 * !true = false; ==> true
 * !false 
 * 
 */
		boolean C = !false != !true;
		System.out.println(C);
		
		boolean D = true == !true;
		System.out.println(D);  //false
		
		boolean E = !(!false);
		System.out.println(E); //false
		
		boolean F = 10>9 == 9<10;
		//          true == true ==>true
		System.out.println(F);
		
		
		
		
		
		
	}

}
