package day_08_ShortHandOperators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		/*
		 * && : and logic
		 * 			true  && false ==> false
		 * 			false && true ==> false
		 * 			true  && true  ==> true
		 * 			false && false  ==> false
		 * || : or logic
		 * 			true  || false ==> true
		 * 			false || true ==> true
		 * 			true  || true  ==> true
		 * 			false || false  ==> false
		 */
		
//&&:
		boolean ResultA = 9 == 0 && "Muhtar" == "Good";
		//                 false    &&    false  ==> false
System.out.println(ResultA);

		boolean ResultB = 8>5 && 7==(8-2+1);
		//                true && true  ==> true
System.out.println(ResultB);

		boolean ResultC = !false !=true && !false ==!(!true);
		//                true!=true    && true == true
		//                 false        &&   true  ==> false
System.out.println(ResultC);

//|| :
		boolean A = "Monday" == "Funday" || 6==6;
		//                  false        || true  ==> true
System.out.println(A);
	
		boolean B = true || false;  // ==>true
System.out.println(B);

		boolean C = !(8>5) || !("Today" != "Friday");
		//			false  ||  false    ==> false
System.out.println(C);
		
		
		
	}

}
