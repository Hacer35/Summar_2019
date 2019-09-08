package day_07_Uneray_Shorthand;

public class UnerayOperators {
	
	public static void main(String[] args) {
		
		/*
		 * +: positive
		 * -: negative
		 * ++: increment, increases the value by 1, 
	there are 2 types:
Pre increment: operator is placed before the variable, increases the value by 1 immediatelly;
		int num1= 100;
		++num1 ==> num1+1 ==> 100+1=101
		int num2 = ++num1 ==> 101+1=102
Post increment: operator is placed after the variable, increases the value by 1 immediatelly but current the value first;
		int IntNum = 100;
		IntNum++ ==> print 100 first
		IntNum ==> then now print 101 
		 * --: decrement, decreases the value by 1
	there are 2 types:
Pre decrement: operator is placed before the variable, decreases the value by 1 immediatelly;
Post increment: operator is placed after the variable, decreases the value by 1 immediatelly but current the value first;
		
		 */
		
		int a =10;
		int b = -10;
System.out.println(b);  //-10

		int c = +b;  //==>  +(-10)  ==>-10  //same with Math
System.out.println(c);

		int d = -c;  //==>  -(-10)  ==>10   //same with Math
System.out.println(d);

		int f = -(10);
System.out.println(f);
		
        int IntNum = 100;
System.out.println( IntNum++); //100
System.out.println(IntNum); //101

		int IntNum2 = IntNum ++;  //intnum2=101
System.out.println(IntNum2);
		

		int x = 100;
		int y =x++ - 1;
		System.out.println(y); //99
		
		int Z = 100;
System.out.println(--Z);  //99

		int Y =95;
System.out.println(Y--); //95
System.out.println(Y);   //94

		int T =25;
System.out.println(++T); //26
System.out.println(--T); //25

		int P = 50;
		P= --P + P++ + P-- + P++;
		// PRE   POST  POST POST
		// 49  + 49  + 50  + 49 =197
System.out.println(P);

		short Snum= 4;
		int R = Snum * 4 - Snum--;
		//      16       - 4   =12
System.out.println(R); //12
System.out.println(Snum); //3

		int W =1;
		W= - W-- + W++ / -W-- * --W;
		// post  + post/ post * pre
		// -1 + 0 / -1 * -1
		// -1 + 0 * -1
		// -1 +0 = -1
System.out.println(W); //-1















	}

}
