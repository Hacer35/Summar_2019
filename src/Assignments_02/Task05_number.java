package Assignments_02;

public class Task05_number {
	public static void main(String[] args) {
		
		int num = 155;
		if (num>0) {
			System.out.println("\"positive\"");
		}
		if (num==0) {
			System.out.println("\"zero\"");
		}
		if (num<0) {
			System.out.println("\"negative\"");
		}
		
		int num2 = -155;
		if (num2>0) {
			System.out.println("\"positive\"");
		}
		if (num2==0) {
			System.out.println("\"zero\"");
		}
		if (num2<0) {
			System.out.println("\"negative\"");
		}
		
		int num3 = 0;
		if (num3>0) {
			System.out.println("\"positive\"");
		}
		if (num3==0) {
			System.out.println("\"zero\"");
		}
		if (num3<0) {
			System.out.println("\"negative\"");
		}
		
// another way:
		
		int n1 = 155;
		String result = n1+" is \"zero\"";
		
		if (n1>0) {
			result = n1+" is \"positive\"";
		}
		if (n1<0) {
			result =n1+" is \"negative\"";
		}
		System.out.println(result);
		}
	}


