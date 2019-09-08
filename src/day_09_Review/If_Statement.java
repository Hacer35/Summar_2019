package day_09_Review;

public class If_Statement {
	/*
	 * IF STATEMENT:
	 * Single if statement: if block only gets executed if the condition is true
	 * 		if (boolean expression){
	 * 			some codes to run}
	 * 		
	 */

	public static void main(String[] args) {
		
		if (9<10) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("Class starts on Monday");
		}
		
		int a = 1000; //1001
		if (true) {
		//	1000==1001 ===>false
		a=2000;
		System.out.println("a is increased");
		}
		System.out.println("a+\n\n\n");
		
		int X = 987654320;
		if (X%2 == 0) {
			//true, only if it is true it is executed
			System.out.println(X);
			System.out.println("it is an even number");
		} 

		if (X%2 != 0) {
			//false condition , not executed
			System.out.println(X);
			System.out.println("it is an odd number");
		}
			
		int Y = 23345678;
		if (Y%5 ==0) {
			// false so that not executed
			System.out.println(Y+" can be devided by 5");
		}
		
		if(Y%5 !=0) {
			// false so that not executed
			System.out.println(Y+" cannot be devided by 5");
		}

		String CEO = "Main Boss";
		String Kuzzet = "Main Boss";
		System.out.println(CEO == Kuzzet); //true
		
		if(Kuzzet == CEO) {
			//true
			System.out.println("Great Person in the world");
			System.out.println("First if block");
			System.out.println("AAA");
		}

		if(Kuzzet != CEO) {
			//false so that not executed
			System.out.println("Great Person in the world");
			System.out.println("Second if block");
		}
		
		double TotalNumber = 100;
		boolean Cybertek = true;
		boolean BestSchool= true;
		
		if (Cybertek == BestSchool) {
			//true so that executed
			TotalNumber += 500;  //600.0
		}
		if (Cybertek != BestSchool) {
			//false so that not executed
			TotalNumber -= 50;  //450.0
		}
		System.out.println(TotalNumber);
		
		/*
		 * 1.declear a variable, and initialize user age
		 * 2. write a program if the user is eligible to vote for DT
		 * 			vote age: 18
		 */
			byte PersonAge= 78;
			byte voteAge = 18;
			
			if (PersonAge >= voteAge) {
				//true so that executed
				System.out.println("Yes you are eligible to vote");
				System.out.println("have fun with building the wall");
				System.out.println("MAGA");
			}
			if (PersonAge<voteAge) {
				//false so that not executed
				System.out.println("You are not eligible to vote yet, please gorwn up");
			}
			
		
		
		
		
		
		
	}
	
	
	
}
