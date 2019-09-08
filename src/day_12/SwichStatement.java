package day_12;

public class SwichStatement {
	
	public static void main(String[] args) {
		
		/*
		 * switch statement is like multi-branch statement
		 * 		switch(Expression){
		 * 			case CaseVale :
		 * 					statement1;
		 * 					statement2;
		 * 					break; => exiting case
		 * 			default:
		 * 					statement;
		 * 					break;
		 * }
		 */
		
		
		int score =1;
		if(score==1) {  // must give boolean expression
			System.out.println("1");
		}
		else if (score==2) {  //like case
			System.out.println("2");
		}
		else					//like default
			System.out.println("Invalid");
		
		switch (score) { //must give an expression: data
			case 1:
				System.out.println("1");
				break; //closing statement
			case 2:
				System.out.println("2");
				break;
			default: // default does not have to be at the end, can be anywhere at the top or in the middle
				System.out.println("invalid");
				break;
		}
		
		String str ="Java";
		
		switch (str) {			
			case "C#":
				System.out.println("C# programming lang");
				break;
	// System.out.println("C# programming lang"); ==> after break nothing can be executed
			case "Python":
				System.out.println("Python programming lang");
				break;
			default: //like else
				System.out.println("Invalid");
				break;
	// since the value JAva doesnt macth with none of them above, it prints invalid
		}
				
		
		char ch = 'A';
		
		
		switch(ch) {
		case 'B':
			System.out.println("Passed with B");
			
		case 'C':
			System.out.println("Passed with A");
			
			default:
				System.out.println("Failed");
//swicth statement only exit when there is break or }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
