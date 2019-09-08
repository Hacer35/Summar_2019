package Assignments;

public class WorkingOnTasks {
	public static void main(String[] args) {
		
		
//1:
System.out.println((5+2)*4);
				//  7*4 =28
System.out.println(10/(5-3));
				// 10/2 =5
System.out.println(8+12*(6-2));
				//8+12*4 = 8+48 =56
System.out.println((4+17)%2-1);
				// 21%2-1 = 1-1 =0
System.out.println((6-3)*(2+7)/3);
				// 3*9/3 = 9

//2:
	int num1 = 46;
	int num2 = 90;
	int sum = num1+num2;
System.out.println(sum);

//3:
	int C =1;
	int F=9*C/5+32;
System.out.println(F);

//4:
	double km =1;
	double mile = 1.609344*km;
System.out.println(mile);

//5:
	double radius = 5.5;
	double perimeter = 2*radius*'π';
	double area = radius*radius*'π';
System.out.println(perimeter);
System.out.println(area);

//6:
	double width = 4.5;
	double height = 7.9;
	double Area = width*height;
System.out.println(Area);

//7:
	double a = 3, b = 4, c = 5;
	double average = (a+b+c)/3;
System.out.println(average);

//8:
	int pies=10, people=4;
	double piesPerson;
	piesPerson = pies/people;
System.out.println(piesPerson);  //2.0
	int pies1=10, people1=4;
	double piesPerson1;
	piesPerson1 = (double) pies1/people1;
System.out.println(piesPerson1);  //2.5
	int pies2=10, people2=4;
	double piesPerson2;
	piesPerson2 = pies2/(double) people2;
System.out.println(piesPerson2);  //2.5
	int pies3=10, people3=4;
	/*double piesPerson3;
	piesPerson3 = double (pies3/people3); //given error
System.out.println(piesPerson3);
	*/	
		
//9:
	int A = (int)(7.9) + (int)(6.7);
System.out.println(A);	//13
	int B = (int)(7.9+6.7);
System.out.println(B);  //14
	double Cc = (double)(17); // 17.0
System.out.println(Cc);
	double D = (double)(8+3);
System.out.println(D);  //11.0
	double E = (double)(7)/2;
System.out.println(E);  //3.5
	double Ff = (double)(7/2);
System.out.println(Ff);  //3.0
	int G = (int)(7.8+(double)(15)/2);
System.out.println(G); //15

//10:
	/*short firstN = 10, secondN=20, thirdN;
	thirdN = firstN + secondN; // error
	When values of the byte or shortdata types are used in arithmetic expressions, 
they are temporarily converted to intvalues.
	The result of an arithmetic operation using only a mixture of byte, short, 
or intvalues will always be an int
	*/
	short firstN = 10, secondN=20;
	int thirdN;
	thirdN = firstN + secondN;
System.out.println(thirdN);
	
	}

}
