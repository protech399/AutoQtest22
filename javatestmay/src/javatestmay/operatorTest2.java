package javatestmay;

public class operatorTest2 {

	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++ PRE - INCR ++++++++++++++++++++");
		int i = 3;
		int a = ++i + ++i;										//increment & then assign
		
		System.out.println(i);
		System.out.println(a);
		
		System.out.println("+++++++++++++++++++ POST - INCR ++++++++++++++++++++");
		int j = 3;
		int b = j++ + j++;				// b = 3  + 4 				First assign & then next time increment it
		
		System.out.println(j);   			// 5
		System.out.println(b);				//7
		
		System.out.println("+++++++++++++++++++ PRE - DECR ++++++++++++++++++++");
		int k = 3;
		int c = --k + k;
		
		System.out.println(k);
		System.out.println(c);
		
		System.out.println("+++++++++++++++++++ POST - DECR ++++++++++++++++++++");
		int l = 3;
		int d = l-- + l--;			//d = 3 + 2   = 5;
		
		System.out.println(l);		// 1
		System.out.println(d);		// 5
		
		System.out.println("+++++++++++++++++++Assignment Operators ++++++++++++++++++++");
		int x = 4 ;
		x *= 5; 			//x = x * 5;
		System.out.println(x);
		
		int y = 20 ;
		y /= 5; 			//y = y / 5;
		System.out.println(y);
	
		System.out.println("+++++++++++++++++++Logical Operators ++++++++++++++++++++");
		int z = 3;
		System.out.println(z < 4 && z < 2);
		System.out.println(!(z < 4 && z < 2));					
		System.out.println((z < 4 || z < 2));
	}

}
