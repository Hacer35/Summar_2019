package day_12;


public class warmUp {
	public static void main(String[] args) {
		
		
		
		
		
		int n1=1, n2=2, n3=3;
		
		
			if (n1==n2 && n1!=n3) {
				System.out.println("n1 and n2 equal");
			}
			else if(n2==n3 && n2!=n1) {
				System.out.println("n2 and n3 equal");
			}
			else if(n3==n1 && n2!=n1) {
				System.out.println("n1 and n3 equal");
			}
			else if (n1==n2 && n1==n3) {
				System.out.println("all equal");
			}
			else {
				System.out.println("none equal");
			}
		
//another way:
			
			int num1=2, num2=1, num3=5;
			
			if (num1==num2 && num1==num3) {
				System.out.println("all equal");
			}
			else if (num1==num2) {
				System.out.println("num1 and num2 are equal");
			}
			else if (num2==num3) {
				System.out.println("num2 and num3 are equal");
			}
			else if(num1==num3) {
				System.out.println("num1 nad num3 are equal");
			}
			else {
				System.out.println("none equal");
			} 
		
//nested-if way:
			
			int a=10, b=20, c=30;
			
			if (a==b && b==c) {
				System.out.println("all equal");
			}else {
				if (a==b) {
					System.out.println(" a equal b");
				}
				else if(a==c) {
					System.out.println("a equal c");
				}
				else if (b==c) {
					System.out.println("b equal c");
				}
				else {
				System.out.println("none equal");
				}
			}
				
			
/*
 * 60~70 => D
 * 70~80 => C
 * 80~90 => B
 * 90~100 => A
 * 0~59 => F
 */
			
			
			int grade =70;
			
		if (grade>=0 && grade<=100) {
			if (grade>=60) {
				if(grade>=90) {
					System.out.println("A");
				}
				else if (grade>=80) {
					System.out.println("B");
				}
				else if (grade>=70) {
					System.out.println("C");
				}
				else  {
					System.out.println("D");
				}
			}
			else {
				System.out.println("Failed");
			}
		}
		else {
			System.out.println("Invalid");
		}
					
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
