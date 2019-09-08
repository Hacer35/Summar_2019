package day_05_Recap;

public class primitives_Review {
	
	
	/*
	 * Primitives:
	 * 		byte: for only whole numbers,
	 * 		short:for only whole numbers,
	 * 		int:for only whole numbers, (More OFTEN)
	 * 		long:for only whole numbers,
	 * 		
	 * 		float: can take decimals(MUST have F or f at the end)
	 * 		double:can take decimals(DO NOT HAVE TO but CAN have F or f at the end) (More OFTEN)
	 * 
	 * 		boolean: for ONLY True and False expressions
	 * 		char: charahter within single quote '  ' ,also takes numbers
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
			
			//System.out.println(bNum); invalid, java app is executed from top to bottom, tha means code first then print
		byte bNum= 127;
			//byte range: -128 to 127
			//byte bNum2= 126.5; invalid 
	System.out.println(bNum);
	
		short sNum2=1000;
			//short sNum= 126.5; invalid
			//bNum=sNum2;        invalid
		sNum2= bNum;
	System.out.println(sNum2);
		short sNum3=127;
			//byte bNum5=sNum3; eventhough sNumber=127 it is still invalid, short>byte 
				
		int intNum = 100;
			//int intNum2 = 100.5; invalid
			//byte ByteNum = intNum; invalid , int>byte
			//short ShortNum = intNum; invalid,  int1> short
	System.out.println(intNum); //prints 100
	
	short ShortNum2=105;
	intNum = ShortNum2;
	System.out.println(intNum); // but this time it prints 105, because we initialized/coded new number which is ShortNum2 which is 105
	
		long LongNum= 100l;
		long LongNum2= 100L;
			//byte byteNum3 = LongNum;  invalid long> byte
			//short ShortNum4= 100l;    invalid long>short
			//int IntNum3 = 100L;       invalid long> int
		
		byte a=10;
		int b=30;
		short c=40;
		
		long LongNumber = a;
		long LongNumber2= b;
		long LongNumber3= c;
		
		
		float floatNumber = 10.5f;
		float floatNumber2= 20.5F;
		
		short a1=10;	byte b1=20;	long c1=30;	int d1=40;
		
		float Floats =a1;
		float Floats2 = b1;
		float Floats3 = c1;
		float Floats4 = d1; 
System.out.println(Floats);  //prints a decimal which is 10.0

		double DoubleNum1 = 10L;
		double DoubleNum2 = 10.5F;
		
		boolean result = true;
		boolean result2 = false;
		boolean result3= 9>10;   // prints True
		boolean result4= 10>9;   // prints False
System.out.println(result);
System.out.println(result3);

		char specialchar= 250;
System.out.println(specialchar);


//Practices:
/*
 * 8,	9,	#,	@,	8.5,	5.5F,
 * 128,	40000,	9>10,	true,	false
 */

		byte Bnum=8;	short SNum=8;	int INum =8;	long LNum =8L;	float FNum =8f;	double DNum=8F;	char character ='8';
System.out.println(Bnum);	//8
System.out.println(SNum);	//8
System.out.println(INum);   //8
System.out.println(LNum);   //8
System.out.println(FNum);   //8.0
System.out.println(DNum);   //8.0
System.out.println(character);   //8

		
	
		
		
		
	}

}
