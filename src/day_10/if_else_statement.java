package day_10;

public class if_else_statement {
	public static void main(String[] args) {
		/*
		 * if&else:
		 * if (condition){
		 *   //A ==> if block only gets executed if the condition is true
		 *   }
		 *   else{
		 *     //B  ==> otherwise else block gets executed
		 *     }
		 */
		
		if (9<=8) {
			System.out.println("9 is less or equal to 8");
		}else {
			System.out.println("9 is greater than 8");
		}
		
		if(false == !false) {
			//false
			System.out.println("if block");
		}else {
			System.out.println("else block");
		}
		
		
//Task01:
		/*
		 * if score < 60 ==> failed
		 * if score > 60 but score <90 ==> pass
		 */
		
		int score =50;
		if (score >=60) {
			System.out.println("Passed");
	} else {
		System.out.println("Failed");
	}
	
		
//Task02:
		/*
		 * triangle: has tree angles,
		 * 				and sum of three angles must be equal to 180
		 * 1.declare three variables angle1,angle2,angle3
		 * 2.write a program to check if the triangle is valid or not
		 */
		
		int angle1 = 25, angle2=80, angle3= 75;
		boolean valid = (angle1+angle2+angle3)==180;
		if(valid) {
			System.out.println("it is a valid triangle");
		} else {
			System.out.println("Invalid tringle, do some math");
		} //this works but there is a bug
		
		
		
		
		
		
		
		
		
		
		
	}
}
