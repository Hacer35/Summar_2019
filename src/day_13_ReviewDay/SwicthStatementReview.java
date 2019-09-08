package day_13_ReviewDay;

public class SwicthStatementReview {
	public static void main(String[] args) {
		/*
		 * switch expressions must be evaluate to single value
		 * (either char, digits or text)
		 * therefore 4datatype gives compile error
		 * long
		 * float
		 * double
		 * boolean
		 */
		
		long N1 = 10;
		//switch (N1) {} not accept
		float N2 =100; // (int) 100 ; still not accept
		//switch(N2) {} not accept
		double N3 = 10;
		//switch (N3) {} not accept
		boolean N4 = true;  //9<8
		//switch (N4) {} not accept
		
		char ch = 'A';
		switch (ch) {} // accept
		char ch2 = 123;
		switch (ch2) {} // accept
		
		/*
		 * or logic in switch statement:
		 * 
		 */
		char grade ='B';
		if (grade =='A'||grade=='B') {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		switch (grade) {
			case'A':
			case'B':
				System.out.println("passed");
				break;
			default:
				System.out.println("failed");
				break;
		}
		
		String US = "USA";
		if (US == "USA" || US =="America" || US == "US") {
			System.out.println("American");
		}else {
			System.out.println("Not American");
		}
		
		switch (US) {
		case "US":
		case "USA":
		case "America":
			System.out.println("American");
			break;
		default:
			System.out.println("Not American");
			break;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		int num =5;
		 switch (num) {
		 	case 7:
		 		System.out.println("Sunday");
		 		break; // case closed
//this is used to exit switch statement after the case is executed
		 		default:
		 			System.out.println("Invalid");
		 			break;
		 		case 10-5:
		 			System.out.println("Friday");
		 			break;
		 		//case 5: ==> cannot have same value in different cases
		 		//	System.out.println("Friday2");
		 		//	break;
		 }
		
		
String days = "Tuesday";

switch (days) {
	
	case "Monday":
		System.out.println("Monday is FunDay");	
	case "Wednesday":
		System.out.println("Wednesday is Day-Off");
	default:
		System.out.println("Invalid");
		break;
	case "Tuesday":
		System.out.println("Tueday is great day");
	
}
		
		
		
		
		
		
	}

}
