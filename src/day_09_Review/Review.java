package day_09_Review;

public class Review {
/* 
 * RELATIONALS:
 * > : greater
 * >=: greater or equal
 * < : less
 * <=: less or equal
 * ==: equal
 * !=: NOT equal
 * 
 * LOGICAL OPERATORS:
 * || : true as long as one condition is true
 * && : true only if both conditions are true
 */
	public static void main(String[] args) {
		
//  > :
System.out.println('Z'>'A');   //true  
//the number of 'Z' represents in ASCII > the number of 'A' represents in ASCII

System.out.println('Z'>= 'A');  //true

System.out.println('a'>'A');   //true 

System.out.println('a'<'A');   //false

char ch1 = 123;
System.out.println(ch1);

System.out.println('A' <= 'A'); //true
System.out.println('A' <= 'a'); //true; 65<=97
System.out.println('A');
System.out.println("A");
char a = 'A';
System.out.println(a);
char b = 65;
System.out.println(b);
char c = (65);
System.out.println(c);
char d = ('A');
System.out.println(d);

System.out.println(false == false); //true
System.out.println(!(false != true)); // !true ==> false

System.out.println(true == true && false != true);
//                   true && true  ==> true
System.out.println(true !=true || false == true);
//                     false ||  false  ==> false
System.out.println("Monday" == "Funday" || true == !false);
//                        false  ||  true  ==>true


  byte X =10; int Y = 10;
  System.out.println(X==Y);  // we can use with primitives too.
  
int aa = 'A';
System.out.println(aa);



































	
		
		
		
		
		
	}

}
