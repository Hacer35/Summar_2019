package day_07_Uneray_Shorthand;

public class quiz {
	public static void main(String[] args) {
		
	
	
	
	
//Q2:
/*System.out.println(a);
  int a = 10;
it is given error, because int must be before print line.
*/

//Q3:
System.out.println("Result A"+0+1);  //"Result A0"+1 => "Result A01"
System.out.println(" ; Result B"+(1)+(2)); //"Result B12"

//Task converts the ones coming after him.

//Q4:
System.out.println("5+2="+3+4); // "5+2=3"+4 => "5+2=34"
System.out.println("5+2="+(3+4));  // "5+2="+7 => "5+2=7"

//Q5:
	float FloatNum= 100.987456321f;  //converting float> to short is explicit casting.
	short ShortNum= (byte)FloatNum; //short>byte so there is no error
System.out.println(ShortNum); //100

//Q6:
/*byte a =200;  200 is larger than byte's range
  byte b = 2;
System.out.println(a+b-a*b+a/b); //gives error because byte range smaller than 200.
				// 200+2-400+100= -98
*/

//Q7:
System.out.println((3+2)*2/3%2);
				// 5*2/3%2= 10/3%2 =3 % 2 = 1

//Q8:
/*int num1=9, num2=0, num3=num1/num2;
System.out.println(num3); gives error because denominator cannot be 0 as it is in Math.
*/

//Q9:
long LNum=3_000L;
double DNum= (float) LNum;

//Q10:
double result1 = 10/3;
	// reslut1=3; =>3.0
//Q11:
double result2 = 10.0/3;
	//result2=3f; => 3.33
//these below will also print decimal
System.out.println(10/3L); //3.33
System.out.println(10/3f);  //3.33
System.out.println(10/3D);  //3.33

//quick note: the differemce between float and double:
 		//float=3.5f; f is required
		//double=3.5; f/d/l is not required
//Q12:
//Q13:

int I1 =10, I2=20, I3=30;





}
}
