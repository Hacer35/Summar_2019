package day_08_ShortHandOperators;

public class ShortHand {
	public static void main(String[] args) {
		/*
		 *  += : addition assignment :  x+=y =x+y
		 *  -= : subtruction assignment: x-=y = x-y
		 *  *= : x*=y = x*y
		 *  /= : x/=y = x/y
		 */
		
// +=  :
		
		int a=9;
		a += 3; // a= a=3 => 12
System.out.println(a);  //12
		
		int b = a += 5;
		//     12+5=17
		//a+=5 ==> post increment makes a=17, b=17
System.out.println(b);  //17
		
		int c =a+= b;
		//     17+17=29
		// a+=b ==> post increment makes a=34, c=34, b=17
System.out.println(c); //34
		
		int d = a+=c;
		//     34+34=
		// a+=c ==> post increment makes a=68 , d=68, c=34, b=17
System.out.println(d);

		int e =(d+=b)*2;
		//     (68+17)*2=85*2=170
		// d+=b ==>post increment makes d=85, b=17, e=170, c=34
System.out.println(e);

		int f = b+=d *2;
			//	b+=170;
			//  17+=170 ==> 187
		
//  -=  :
		
		int g = 101;
		int h = g-= 1;  // 101-1=100
		//h=100 g=100
System.out.println(h);

		int i = g+=h+5;  //100+100+5=205
		// g=205 i=205 h=100
System.out.println(i);

		int j = h+=g%i; // 100 + 205%205 = 100+0 =100
		//j=100 h=100
System.out.println(j);

		int k = j -=h*2%5;  // 100-100*2%5 = 100-0=100
		//k=100 j=100 h=100
System.out.println(k);

// *=  :

	int A = 100;
	A*= 200;  //A=A*200
System.out.println(A);  //A=20000

	int B = 100;
	B *= 100/10;  // B*100/10 = 10000/10 = 1000
System.out.println(B);  //1000

	B*=B-=1000; //1000 * 1000
	
	
	
	
	
	
	
	
	
	
	
//%=  :
	
	int E =10;
	E %= 2; // E=10%2
System.out.println(E);

	int F = 100;
	F %=2;  // F=F%2  ==>0
System.out.println(F);

System.out.println(-100%3);  //-1
System.out.println(10.5%3);  //1.5
System.out.println(10.0%3);  //1.0

	int J = 300;
	int K = 10;
	J+= J%= K; //300+300%10 = 300+0 = 300
System.out.println(J);
	
	
	
	
	
	
				
		
		
		
		
	}

}
