package day_10;

public class Multi_Branch_IfStatement {
	public static void main(String[] args) {
		/*
		 * multi branch id statement
		 * if (condition1){
		 *  //A
		 * }else if condition(condition2){
		 *   //B
		 * }else{
		 *   //C
		 * }
		 * 
		 * if condition1 is true ==> A
		 * if condition1 is false and condition2 is true ==> B
		 * if none is true ==> C
		 */
	
		
		
		
		
		if (false) {
			System.out.println("if block");
		}else if (true) {
			System.out.println("else if block");
		}else {
			System.out.println("else block");
		}
		
//Task01:
		/*
		 * 90 <= grade ==> A
		 * 80 <= grade < 90 ==> B
		 * 70 <= grade < 80 ==> C
		 * 60 <= grade < 70 ==> D
		 * else ==> F
		 */
		
		int grade = 100;
		
		if (90 <= grade && grade <=100) {
			System.out.println("You have made A, Great Job!");
		} else if(80 <= grade && grade < 90) {
			System.out.println("You have made B,Good");
		} else if (70 <= grade && grade < 80) {
			System.out.println("You have made C");
		} else if (60 <= grade && grade < 70) {
			System.out.println("You have made D");
		}else {
			System.out.println("You have made F, Study more");
		}
		
//Task02:
		/*
		 * Write a program that:
		 * 1. 0~12  ==> good morning
		 * 2. 12~15  ==> good afternoon
		 * 3.15~23  ==> good night
		 */
		int hour = 23;
		if (0<hour && hour<= 12) {
			System.out.println("Good Morning");
		}else if (12<hour && hour<=15) {
			System.out.println("Good Afternoon");
		}else if (15<hour && hour<=23) {
			System.out.println("Good Night");
		}else {
			System.out.println("Noon!");
		}
		
//Task03:
		/*
		 * int num1 num2 num3
		 * find the biggest number
		 */
		
		int num1=200, num2=300, num3=50;
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1+" is the biggest number");
		} else if (num2>num1 && num2>num3) {
			System.out.println(num2+" is the biggest number");
		} else if (num3>num2 && num3>num1) {
			System.out.println(num3+" is the biggest number");
		} else if (num3==num2 && num3>num1) {
			System.out.println(num2+" and "+num3+" are the biggest number");
		} else if (num1==num3 && num1>num2) {
			System.out.println(num1+ " and "+num3+" are the biggest number");
		} else if (num1==num2 && num1>num3) {
			System.out.println(num1+ " and " + num2+ " are the biggest number");
		} else {
			System.out.println("All of them are equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
