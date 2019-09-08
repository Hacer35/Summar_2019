package day_08_ShortHandOperators;

public class warmUp {
	
	public static void main(String[] args) {

//1: write a java prog that conveerts gallons to liters
//		1gallon=3.785 liters
		
		int gallon = 100;
		double liters = gallon * 3.785;  //converts gallon to liters
System.out.println(liters);
String result = gallon + " gallons egual to "+ liters + " liters.";
System.out.println(result);
		
//2:write a java prog that conveerts liters to gallons
//		1gallon=3.785 liters
//		gallon 1/ 3.785 = 1 liter
		
		double L = 1;
		double G = L/3.785;
System.out.println(G);
System.out.println(L+" liter equals to "+G+" gallons.");
		
//3:
		int x =2;
		int y = x++;  //y=2; x=3
		//      post
System.out.println(y+" "+x);

		int x2=2;
System.out.println(x2++); //2
System.out.println(x2);   //3

		int x3=2;
System.out.println(--x3); //1

		int x4=8;
		int y4=x4--;
System.out.println(y4); //8
System.out.println(x4);  //7
		
		
		
		
	}

}
