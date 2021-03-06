package mayQtest;

public class operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++++ PRE - INCR ++++++++++++++++++++");
		int i = 3;				
		int a = ++i + ++i;		/*	a= 4 + 5							increment & then assign     */
		
		System.out.println(i); // 5
		System.out.println(a); // 9
		
		System.out.println("+++++++++++++++++++ POST - INCR ++++++++++++++++++++");
		int j = 3;
		int b = j++ + j++;				// b = 3  + 4 				First assign & then next time increment it
		
		System.out.println(j);   			// 5
		System.out.println(b);				//7
		
		System.out.println("+++++++++++++++++++ PRE - DECR ++++++++++++++++++++");
		int k = 3;					// k will change to 2 
		int c = --k + k;			// C= 2+2
		
		System.out.println(k);		//k= 2
		System.out.println(c);		//c= 4
		
		System.out.println("+++++++++++++++++++ POST - DECR ++++++++++++++++++++");
		int l = 3;
		int d = l-- + l--;			//d = 3 + 2   = 5;
		
		System.out.println(l);		// 1
		System.out.println(d);		// 5
		
		System.out.println("+++++++++++++++++++Assignment Operators ++++++++++++++++++++");
		int x = 4 ;
		x *= 5; 			//x = x * 5;
		System.out.println(x);	//x= 4*5
		
		int y = 20 ;
		y /= 5; 			//y = y / 5;
		System.out.println(y);	//y= 20/5
	
		System.out.println("+++++++++++++++++++Logical Operators ++++++++++++++++++++");
		int z = 3;	
		System.out.println(z < 4 && z < 2);
		System.out.println(!(z < 4 && z < 2));					
		System.out.println((z < 4 || z < 2));
		
	}

}
