package day_13_ReviewDay;

public class AssesmentQuiz03 {
	public static void main(String[] args) {
//Q1:
		int num =9;

		if(num++ == 10) {  // line 1
//         9 == 10 ==> false but num becomes 10
		System.out.println("Hello World "+num);    // line 2
		}
		else {
//      true
		System.out.println("Hello Universe "+num);  // line 3
		}
//prints: Hello Universe10
		
	
//Q2:
		int score=0;

		if(score == 0) {
//        0==0 ==>true
		score += 50; // score=0+50=50
		}
		if(score !=0 ) {
//          50!=0 ==>false 
		score +=50; // score=50+50=100
		}
		System.out.println(score);
		
	//prints: 100
	
//Q3:
	char grade ='A';

	boolean Passed = grade == 'A' || grade =='B';
//                    true||false ==> true
	boolean Passed2 = grade == 'C' || grade =='D';
//                    false || false  ==> false
	 

	if( Passed || Passed2) {
//      true || flase => true
	System.out.println("You've passed the exam");
	}
	else { // false
	System.out.println("You failed");
	}
//prints: You've passed the exam 
		
//Q4:
	boolean A = true, B =  !false;
//               A=True,B=True
	if(B) {
//True
	System.out.println("B");
//the first block will be printed
	}
	else if(A) { //true
	System.out.println("A");
	}
	else { // prints if any others are false
	System.out.println("C");
	}
	
//Prints: B	

//Q5:
boolean result = true;

if(result) {
System.out.println("it's true");
}

//else { else must be end of the all statements
//System.out.println("it's false");

else if(result) {
System.out.println("None of the above");
}
//without the correction it prints: compiler error

//Q6:
// In multi-branch if statement we can give as many "else-if" statements 
// as we want
// True

//Q7:
//when we declare  if statement, it is mandatory to give the else block
//False

//Q8:
boolean A1 = true, B1 = !A;
// A1=true and B1 =false
if(A1) {
//true
	if(B1) {//   false
System.out.println("Monday");
	}else {// true
System.out.println("Tuesday");
	}
}
else { //false
	if(A1) { // true but because else is false it cannot printed
System.out.println("Thursday");
}else {  // false
System.out.println("Friday");
}
}
//prints: Tuesday

//Q9:
int number =10;

if(--number > 10) {
//9>10 ==> false
System.out.println("Hello Cybertek "+number);
}
else if(number ==9) {
// 9==9 ==>true
System.out.println("Hello World "+number);
                               // 9
}
//prints: Hello World9

//Q10:
boolean X = true;      // x=true
boolean Y = !X==false; // false==false ==> y=true
boolean Z = Y;         // z=true
//these are all single if statements! so if all is true it prints all of them
if( X ) {// true
System.out.println("Hello Everyone");
} if( Y ) {// true
System.out.println("Today is great day");
} if( Z ) {// true
System.out.println("We have picnic on Saturday");
}
//prints:Hello Everyone
//       Today is great day
//       We have picnic on Saturday

/*
 * 50>age>18 ==> can vote 1time
 * 70>age>50 ==> can vote 2times
 * age>70 ==> can vote 3times
 * age<18 ==> cannot vote
 */

int age=45;
if (age>18) {
	if (age>=70) {
		System.out.println("You can vote three times");
	}else if (age>=50) {
		System.out.println("You can vote two times");
	}else {
		System.out.println("You can vote one time");
	}
}else {
	System.out.println("Not eligible to vote");
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
