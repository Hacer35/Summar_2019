package day_06_ArithmaticOperators;

public class PrimitivesCasting {
	
	public static void main(String[] args) {
		/*
		 * casting: converting larger primitive to smaller size
		 * 		datatype variablename = (datatype) value;
		 * casting has two types : Explicit & Implicit
		 * 
		 * Primitives: byte, short, int, long, float, double
		 */
		
	// Explicit casting:
		
	int a = 128;
	byte b = (byte) a;  //explicit casting
System.out.println(b);
	
	
	double DecimalNumber = 10.5;
	float FloatNumber = (int) DecimalNumber; // double>Float
											// FloatNumber=10;
System.out.println(FloatNumber);

	long LongNum =300L;
	int IntNum = (int)LongNum;
	int IntNum2= (short)LongNum;
System.out.println(IntNum);
System.out.println(IntNum2);

	// Implicit casting:

	byte ByteNum =100;
	int IntNumber= ByteNum;	//implicit casting
	//SAME WITH:
	int IntNumber2 = (int)ByteNum;
	
	short shortNum =100;
	long LongNum2=shortNum;
	//SAME WITH:
	long LongNum3=(long)shortNum;
	
	


//explicit casting practices:
 //ex_01:
	double LargerstNumber = 100.8765;
	
	byte ByteValue = (byte)LargerstNumber;
System.out.println(ByteValue);//100
	
	float FloatValue = (byte) LargerstNumber; 
System.out.println(FloatValue); //=100.0
	float FloatValue2= (short)LargerstNumber; 
System.out.println(FloatValue2); //=100.0
	float FloatValue3= (float)LargerstNumber; 
System.out.println(FloatValue3); //=100.8765
	float FloatValue4= (int) LargerstNumber;
System.out.println(FloatValue4); //= 100.0
	float FloatValue5=(long)LargerstNumber; 
System.out.println(FloatValue5); //=100.0
 
 //ex_02:
	float FloatNumber2 = 500.67f;
	
	int myNumber = (short)FloatNumber2;
System.out.println(myNumber); //500
	int myNumber2= (int)FloatNumber2;
System.out.println(myNumber2); //500

//Important Shortcut:

/* int Num1 =100; called local veriable
 * int Num2=200;  called local veriable
 * int Num3=300;  called local veriable
 * same with below written version:
 */
int Num1 =100, Num2=200,  Num3=300; //called local veriable with multible variables

// all local variables must be initialized tha means int Num1 needs to equals a value => int Num1=100;




}
}
	

