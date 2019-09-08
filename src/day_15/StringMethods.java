package day_15;

public class StringMethods {
	public static void main(String[] args) {
		
		
		String str ="Cybertek";
		//index num:  01234567
		
		//charAt(index):
		
		//System.out.println(str.charAt(4));
		
		char ch = str.charAt(4);
		
		System.out.println(ch);
		
		String str2 = "Muh tar";
		//index num:   0123456
		
		System.out.println(str2.charAt(4));
		
//length(): shows how many cahracter is there
		
		String name ="Donald J Trump";
		
		System.out.println(name.length() );
		// shows how many cahracter is there
		int n = name.length();
		
//concat(): it takes a String and concats it to the String variable,
//  		and then returns a New String value.
		
		String s1 = "Cyertek";
		s1.concat(" School"); // attempt to modify String s1
		System.out.println(s1);
		// string is immutable, cannot be modified,
		//so prints the original one "Cybertek"
		
		s1 =s1.concat(" School");
		System.out.println(s1);
		// now it prints Cybertek School

//toUpperCase(): convert to uppercase
		
		String N = "cybertek";
		N.toUpperCase();
		System.out.println(N); // print cybertek, because string is immutable
		
		N=N.toUpperCase();
		System.out.println(N); //CYBERTEK
		
//toLowerCase():
		
		String name1 = "ABDURRAHMAN";
		name1=name1.toLowerCase();
		System.out.println(name1);  // abdurrahman
		
/*
 * charAt(index), length(), concat(), toUpperCase(), toLowerCase();
 * 
 */
		
		
		
	}

}
