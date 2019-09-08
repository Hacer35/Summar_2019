package day_14;

public class Ternary {
	public static void main(String[] args) {
		
		
		
		
		/* In Ternary:
		 * if(condition) ==> (Condition)?
		 * else          ==>  :
		 * else if(condition)==> :(Condition)?
		 * in ternary's body we can give only a  single value
		 * () is not required
		 * 
		 */
		
		int num = 0;
		if (true) {
			num = 100;
		}else {
			num = 50;
		}
		//num = (true) ? 100
		
		
		
		
		
		String Schoolname="";
		boolean Batch12=true;
		
		if(Batch12) {
			Schoolname="Cybertek";
		}else {
			Schoolname="Invalid";
		}
		
	System.out.println(Batch12 ? "Cybertek" : "Invalid"); // Cybertek
	
	String Bestschool = Batch12 ? "Cybertek" : "Invalid";
	
	System.out.println(Bestschool);  // Cybertek
	
	
	double d = 10;
	if (true) {
		d=10.5;
	}
	
	double z = true ? 10.5 : 0; // in ternary, total number of ? and : has to be equal
		
	double interestRate =0;
	boolean GoodCredit = true;
	
	interestRate =(GoodCredit == true) ? 0.5 : 0.9;
	System.out.println(interestRate);
	
	
	char Finalgrade ='A';
	String Group ="";
	/* covert this if statement to Ternary
	if (Finalgrade == 'A') {
		Group = "Earlybird";
	}else if (Finalgrade =='B') {
		Group = "Group 1";
	}else {
		Group= "Afret Group 1";
	}
	*/
	Group = (Finalgrade == 'A') ? "Earlybird" : (Finalgrade =='B') ? "Group 1" : "Afret Group 1";
	
	
	int score =80;
	char Finals =' ';
	
	if (score >=80 && score<=100)
		Finals ='A';
	else if (score>=80 && score<=89)
		Finals ='B';
	else if (score>=70 && score<=79)
		Finals ='C';
	else if (score>=60 && score<=69)
		Finals ='D';
	else if (score>=0 && score<=59)
		Finals ='F';
	else
		Finals =' ';
	
	Finals= (score >=80 && score<=100) ? 'A'
			:(score>=80 && score<=89) ? 'B'
			:(score>=70 && score<=79) ? 'C'
			:(score>=60 && score<=69) ? 'D'
			:(score>=0 && score<=59) ? 'F'
			:  ' ';
	System.out.println(Finals);
	
	
	int n1 = 100, n2=300, n3=400;
	
	int max = (n1>n2 && n1>n3) ? n1
				:(n2>n1 && n2>n3) ? n2
					: n3;
	System.out.println(max);
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	}

}
