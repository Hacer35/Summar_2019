package day_01_FistProgramming;

public class PrimitiveDataType {
	
	/*
	 * byte: we can assign integers no decimals between -128 and 127
	 * short: we can only assign whole number between -32768 and 32767
	 * int: (most common to use) we can only assign whole numbers between -2147483648 and 
	 * long: whole number, between in -92233720368502 and 
	 * 		at the end of value we can give L or l 
	 * 
	 * byte< short< int< long
	 * small one can be assigned larger one
	 * 
	 * float: we can assign decimals
	 * 	(decimals must have f or F letter at the end)
	 * double (used more often): we can assign decimals.
	 */
	
public static void main(String[] args) {
	
	byte length = 3;
	System.out.println(length);
	
	byte width = 4;
	System.out.println(width);
	
	// byte 9num = 100: variables names must star with alphabet, a-z,A-Z.
	// byte num_and$ = 90; variables must
	// byte lengght=6; variables must be unique. it is not.
	// byte public= 10; variable names cannot be java reserved words.
	//byte myNum1= -129 ; out of range
	
	
	byte variableName = 127;
	
	//short num2 = & we can only assign whole numbers 
	//short num2 = 1000000; out of range
	
	int num4= -100000;
	//100,000,000
	int num5 = 1_000_000_000; // easy to use "_" instead "," in counting
	
	long longNumber =10;
	//int intnumber =10l;
	
	byte byteNumber =10;
	short shortNumber = 18;
	
	short shortNumber2 = 18 ;
	//byte byteNumber= shortNumber2; short is greater than byte
	
	int intNumber = -19562;
	
	
	
	System.out.println("===================================");
	
	byte byteNum = 10;
	short shortNum = 20;
	int intNum =30;
	long longNum = 40;
	
	float fNum = byteNum;
	float fNum1= shortNum;
	float fNum2 = intNum;
	float fNum3= longNum;
	
	System.out.println("byteNum");
	System.out.println("shortNum");
	System.out.println("intNum");
	System.out.println("longNum");
	
	System.out.println("===================================");
	
	
	
	
	
	
	
	
			
			
			
			
}
}
