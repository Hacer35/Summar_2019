package Assignments_02;

public class Task01_greaterNumber {
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 20;
		
		
		if (num2>num1) {
			int max = num2;
			System.out.println(max);
		}
		if (num1>num2) {
			int max = num1;
			System.out.println(max);
		}
		
// another way:
		int num11=10;
		int num22=20;
		int max0=0;
		
		if (num11>num22) {
			//false
			max0=num11;
		}
		if (num11<num22) {
			//true
			max0=num22;
		}
		System.out.println("Maximum number is"+max0);
		
		
	}

}
