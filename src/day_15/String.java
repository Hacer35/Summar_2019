package day_15;

public class String {
	public static void main(String[] args) {
		
		String str = "Cybertek";
		String A = "Cybertek";
		String B = "Cybertek";
		
		System.out.println(A==B); // true because both variables are in the same string pool.
		
		String str2 = new String("Cybertek");
		
		System.out.println(str==str2); 
		// false because both variables are in the different memory locations.
	}

}
