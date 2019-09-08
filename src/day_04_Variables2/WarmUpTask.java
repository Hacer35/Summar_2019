package day_04_Variables2;

public class WarmUpTask {
	/*
	 * 1. Cucumber       => 2.5$
	 * 2. Onion          => 1.5$
	 * 3. Green Pepper   => 2$
	 * 4. Tomato         => 3$
	 * 5. Carrots        => 4$
	 */

	public static void main(String[] args) {
			// Cucumber:
		// int Cucumber = 2.5; we can only assign whole numbers to int, byte, short, long
		
		float Cucumber = 2.5f;  
		// float Cucumber = 2.5; //float cannot contain double
		double Cucumber2= 2.5f;  //double can contain float
		double Cucumber3 = 2.5;
		
			//Onion: 1.5
		float Onion = 1.5F;
		double Onion2 = 1.5;
		
			//Green Pepper: 2
		byte GreenPepper= 2;
		short GreenPepper2 = 2;
		int GreenPepper3 = 2;
		long GreenPepper4= 2l;
		float GreenPepper5= 2;  //only time we add f/F is, when are assigning decimal
		double GreenPepper6 =2; // we can write 2F ot 2f or 2l or 2L too
		
		
		System.out.println(GreenPepper);
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5); // double and float convert it to decimal
		System.out.println(GreenPepper6);
		
		
	}
}
