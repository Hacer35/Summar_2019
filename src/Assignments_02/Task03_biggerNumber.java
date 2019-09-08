package Assignments_02;

public class Task03_biggerNumber {
	public static void main(String[] args) {
		
		int n1= 100;
		int n2= 200;
		int n3= 300;
		
		if (n3>n2 && n3>n1) {
			System.out.println("\"n3 is bigger\"");
		}
		if (n2>n3 && n2>n1) {
			System.out.println("\"n2 is bigger\"");
		}
		if (n1>n2 && n1>n3) {
			System.out.println("\"n1 is bigger\"");
		}
		
		
//another way:
		int n11= 100;
		int n22= 200;
		int n33= 300;
		int max = 0;
		
		if (n33>n22 && n33>n11) {
			max = n33;
		}
		if (n22>n33 && n22>n11) {
			max= n22;
		}
		if (n11>n22 && n11>n33) {
			max = n11;
		}
		System.out.println("Max number between "+n11+", "+n22+" and "+n-0
				33+" is "+max);
		
	}

}
