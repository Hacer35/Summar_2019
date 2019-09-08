package day_04_Variables2;

public class PrimitiveDataType2 {
	/*
	 * Primitives: byte, short, int, long, float, double, boolean, char
	 * 
	 * boolean:takes all boolean expression (true or false), and returns T ot F
	 * 
	 * char: declered with in the single quote '_'; single character only.
	 *       '_' is a must when 
	 */
 public static void main(String[] args) {
	 
	 // boolean result = Each is Flat
	 // boolean num1 = 100; boolean only takes true or false results
	 
	 
	 boolean result = true;
	 boolean result2 = false;
	 boolean result3= 9 > 3;
	 
	 System.out.println(result);   //true
	 System.out.println(result2);  //false
	 System.out.println(result3);  //true
	 
	 // char:
	 
	 char char1= 'a';
	 // char char= 'ab'; each char can one character.
			 
			 System.out.println(char1);
			 
	char char2= '9';
	char char3= '#';
	
	System.out.println("\n\n");
	
	// char with numbers
	char char4= 67; //prints what represennts from ASCII table
	
	System.out.println(char4);
	
	char char5='C';   // prints the character as it is
	System.out.println(char5);
	
	//each char4  and char5 print same
	
	//initializng char to other primitives;
	
	char myChar1 = 'b'; //prints b
	int myInt1= 'b';    //prints 98, int prints the number from ASCII
	
	System.out.println(myChar1); //b
	
	System.out.println(myInt1); //98
	
	System.out.println("=====================");
		//byte myByte =myChar1; // char's memory is 2byte, byte is 1byte so cannot print it
	 	byte myByte2= 'b';  // 'b' is 98 in ASCII so no problem here
	 	System.out.println(myByte2);
	 	System.out.println("====================");
	//short shortNum = myChar1 // char' memory is could be bigger than short, range is greater
	 	short ShortNum2= 'b'; // b's corresponding is 98 ASCII table
	 	System.out.println(ShortNum2);
	 
	 System.out.println("====================");
	//long is bigger byte than char, so there is no prob.
	 	long longNum= myChar1;
	 	long longNum2='b';
	 	System.out.println(longNum);
	 	System.out.println(longNum2); //both can print same
	 
	 System.out.println("====================");
	 //float has more memory that char so no prob
	 float floatNum= myChar1;
	 float floatNum2='b';
	 System.out.println(floatNum);    //prints decimal:98.0
	 System.out.println(floatNum2);   // prints same above
	 
	 //doube;
	 double doubleNum= myChar1;
	 double doubleNum2= 'b';
	 
	 char mycharValue= 1071;
	 System.out.println(mycharValue);
	 
	 
	 
	 
	 
	 
}
}
