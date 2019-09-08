package day_11;

public class review {
	public static void main(String[] args) {
		
		/*
		 * A
		 * A
		 * C
		 * D
		 * F
		 */
		
		
		int grade=68;
		boolean A=grade >= 90 && grade <=100;
		boolean B=grade >= 80 && grade <=89;
		boolean C=grade >= 70 && grade <=79;
		boolean D=grade >= 60 && grade <=69;
		boolean validGrade = grade>=0 && grade<=100;
		
	if (validGrade) {
		//in order to multi-branch if gets executed, first validGrade must be true.
		System.out.print("You passed and ");
		
		if (A) {               // 100<=grade<=90
			System.out.println("You made A");
		}
		else if (B) {         // 90<=grade<=80
			System.out.println("You made B");
		}
		else if (C) {         // 80<=grade<=70
			System.out.println("You made C");
		}
		else if (D) {        // 70<=grade<=60
			System.out.println("You made D");
		}			
		else {              // 60<=grade<=0
			System.out.println("You made F");
		}
	}
	else {                // grade<0 && grade>100
		System.out.println("Not valid-404");
	}	
		
		
		
		/*
		 * declare an int variable called Age
		 * declare a boolean variable called "GoodPerson"
		 * if goodperson is false:
		 * age>=18 => cigra
		 * age >=21 => Hookah
		 * age>= 25 => alcohol
		 * 
		 * age< 18 => milk
		 * 
		 * else:
		 * bad your health
		 */
	int age =20;
	boolean GoodPerson = false;
	if (age>=18) {
		if (GoodPerson) { // goodperson=true && age>=18
			System.out.println("Alchol is bad for you");
		}
		else {// goodperson=false && age>=18
			System.out.println("You can buy cigaras");
			if (age>=21) {
				System.out.println("You can buy Hookah");
			}
			if(age >=25) {
				System.out.println("You can buy Alchol");
			}
		}
	}
	else { // age<18
		System.out.println("buy milk");
	}	
		
		/*
		 * 1.write a program that can find the number of days in a month
		 * (Assume that Feb has 28 days)
		 * 2.Nested if must be used 
		 * int month = 0~12:
		 * 
		 * 1.Jan31, 2.Feb28, 3.Mar31, 4.Apr30, 5.May31, 6.Jun30, 7.Jul31, 8.Aug31, 9.Sep30, 10.Oct31, 11.Nov30, 12.Dec31;
		 * 
		 * 28 days: 2
		 * 30 days: 4, 6, 9, 11
		 * 31 days: 1, 3, 5, 7, 8, 10, 12
		 * 
		 * 	even number of 30 days: 4&6
		 * 	odd number of 30 days : 9&11
		 * 
		 * 	even number of 31 days: 8, 10, 12
		 * 	odd number of 31 days: 1, 3, 5, 7
		 */
	int month=5;
	if (month>0 && month<13) {
		if(month==1) {
			System.out.println("31 days");
		}
		else if (month==2) {
			System.out.println("28 days");
		}
		else if (month==3) {
			System.out.println("31 days");
		}
		else if (month==4) {
			System.out.println("30 days");
		}
		else if (month==5) {
			System.out.println("31 days");
		}	
		else if (month==6) {
			System.out.println("30 days");
		}
		else if (month==7) {
			System.out.println("31 days");
		}
		else if (month % 2 ==0) {
			System.out.println("31 days");
		}
		else {
			System.out.println("30 days");
		}
	}
	else {
		System.out.println("Invalid Entry");
	}
	
	/*
	 * 28days: 2
	 * 30days: 4,6,9,11
	 * 31days: 1,3,5,7,8,10,12
	 */
	
		
		
		
	
			
			
			
			
		/*
		 * 1.write a program that can find the number of days in a month
		 * (Assume that Feb has 28 days)
		 * 2.Nested if must be used 
		 * int month = 0~12:
		 * 
		 * 1.Jan31, 2.Feb28, 3.Mar31, 4.Apr30, 5.May31, 6.Jun30, 7.Jul31, 8.Aug31, 9.Sep30, 10.Oct31, 11.Nov30, 12.Dec31;
		 * 
		 * 28 days: 2
		 * 30 days: 4, 6, 9, 11
		 * 31 days: 1, 3, 5, 7, 8, 10, 12
		 * 
		 * 	even number of 30 days: 4&6
		 * 	odd number of 30 days : 9&11
		 * 
		 * 	even number of 31 days: 8, 10, 12
		 * 	odd number of 31 days: 1, 3, 5, 7
		 */
		
		
		int m =5;
		int year = 2000;
		
		if (m>0 && m<13) {
			if (m==2) {
				if(year%4==0) {
					System.out.println("29 days");
				}else {
					System.out.println("28days");
				}
			}
			if (m<8 && m>0 && m!=2) {
				if (m%2==0) {
					System.out.println("30days");
				}else {
					System.out.println("31days");
				}
			}
			if (m>=8 && m<13) {
				if (m%2==0) {
					System.out.println("31days");
				}else {
					System.out.println("30 days");
				}
			}
			}	
		else {
			System.out.println("Invalid-404");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		}		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	


