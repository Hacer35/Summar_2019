package day_13_ReviewDay;

public class QuizReview {
	public static void main(String[] args) {
		
// Kahoot:
//Q1:		
		if (!true != !false){
			//true
			System.out.println("Cybertek");
		}else {
			System.out.println("BAtch12");
		}
		//prints: Cybertek
	
//Q2:
		boolean resultA = 9>=9 || 10<=10,         //true||true => true
				resultB= 'A'>=128 && 'B'<128;     // false&&true => false
				
				if (resultA) {
					if(resultB) {
						System.out.println(resultA);
					}else {
						System.out.println(resultB);
					}
				}
		//prints: false	
				
//Q3:
		// In Multi-branch if statement, else block is mandatory
		// false
		
//Q4:
				int num =9;
				
				if(++num<10) {      //++num=10 => false
					System.out.println(num+"Hello World");
				}else {             // true
					System.out.println(num+"Hello Universe");
					                // 10
				}
		// prints: 10Hello Universe
		
//Q5:
				int x=1;
				int y=0;
				
				if(x++ > ++y) { //=>false
				//1 > 1 => false	so  now x=2 and y=1
					System.out.println("Hello");
				}else {        //=>true
					System.out.println("Welcome");
				}
				System.out.println("log"+x+":"+y);
		
		//print: log2:1
				
//Q6:
				//double y =200;
				//float flt=y; => false
				
//Q8:
				boolean result = true;		
				int N =100;
				
				if (result) {
				// true	
					N/=10; // 100/10=10
					result = !result; // result=false;
				}
				if (result) {
				// false
					N*=2;  // N=10
					
				}else { //true
					N-=5; // N=10-5=5;
					System.out.println(N);
				}
		// prints: 5
		
//Q8:
				boolean X=true;
				if (X==false) {
					// true==false ==> false
					System.out.println("One");
				}
				else if (X== false !=true) {
					 // false != true ==> true
					System.out.println("two");
				}
				else if (X==true) {
					//true but first true will be printed
					System.out.println("Three");
				}
				else if (X!=false) {
					//true != false => true but first true statement will be printed
					System.out.println("Four");
				}
		//prints: two
//Q9:
				
//Q10:
				int n1='B';
				System.out.println(n1); //66
				System.out.println('B');//B
				
				if (n1>128 || n1<=129 ) {
					//false||true ==> true
					System.out.println('B');
				}
				else {
					System.out.println('A');
				}
		//prints: B
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
