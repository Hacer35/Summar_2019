package day_05_Recap;

public class Concatenation {
	/*
	 * String:represents the sequences of characters, used for storing text
	 * 		  String values are surrendered by a double quote""
	 * Concatenation: combining, linking things together ===>
	 */
public static void main(String[] args) {
	
	String str="any text goes here";
			System.out.println( str);
	String str2 = "1";
			System.out.println(str2);
			System.out.println("Hello World");
	String Hello = "Hello World";
			System.out.println(Hello);
	String myName = "Cybertek " + "School";
			System.out.println(myName);
	String Year = "This is " + 2019;
			System.out.println(Year);
//Example;
	String name = "Muradil";
			System.out.println(name);
		
	String newStr="100"+10;
			System.out.println(newStr);   //10010
	
			System.out.println(1+2+3);  //6
			System.out.println("1"+2+3);  //"12"+3 ==>123
			//System.out.println("1"+1-3);  //"11"-3 ==>invalid
			
			System.out.println("Batch 12"+1+2);  //"Batch121" ==> Batch1212
			System.out.println(2-1+1+"4");   //1+1"4" ==> 2+"4" ==>24
			System.out.println("Batch 12"+(1+2));  //"Batch 12"+3 ==> Batch123
			System.out.println(1+"123"+4+5);  //"1123"+4+5  ==> 112345
			System.out.println("123"+(4+5));  //129
			System.out.println(1+("1"+2));   //1+"12"  ==> 112
			System.out.println(1+"123"+(4+5));  //"1123"+9 ==>11239
			System.out.println(4+3-(9+3));  //7-12 ==>-5
			System.out.println((1+2)+"3");  //33
			//System.out.println((1+2)-"3");  //3-"3" ==>invalid
	String BookName= "I like the book called \' Game of Throne\'";
			System.out.println(BookName);
	String MyInfo="My Name is: \n\tCybertek";
			System.out.println(MyInfo);
			
			System.out.println('3'+3);  //51+3  ==>54
										// '3' is char
			System.out.println("3"+3);  //33
			System.out.println("3"+'3');  //"3"+3 ==>33
			System.out.println(12+'3'); //12+51
			System.out.println(2+5);  //7
			System.out.println("2"+3);  //23
			System.out.println('7'+3);  //55+3 ==>58
			System.out.println("7"+3);  //73
//****\\	System.out.println("7"+'3'); //73  Valid
			
			
			
	
	
	
}
}
