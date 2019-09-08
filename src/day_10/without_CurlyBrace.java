package day_10;

public class without_CurlyBrace {
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("Class starts on Monday");
		} // can print any much lines
			
		if(false)
			System.out.println("Class starts on Monday");	
		//prints only one single line not others coming after	
			
		System.out.println("Tomorrow is day off");	
			
			
		if(true)
			System.out.println("hello");
		else 
			System.out.println("else");
		//else must be right after the single line of statement
		//otherwise else gives compiler error
		// same happens even there is curlybrace, there shouldnot be any other line statement between curlybrace and else
		
		if(true) {
			System.out.println("hello");
		}
		//System.out.println("Tomorrow is day off");  ==> gives compiler error
		else {                             
			System.out.println("else");	}
			
	}

		
		
		
}
