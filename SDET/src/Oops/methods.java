package Oops;

public class methods {
	int a;
	int b;
	
//	// method not takes parameter (void)
//	void sum() {
//		System.out.println(a+b);
//	}
	
//	// method takes parameter
//	void sum (int x, int y){
//		a=x;
//		b=y;
//		System.out.println(a+b);
//	}
	
	// return sum values
	int sum(){
		return (a+b);
	}
	
	
	public static void main(String[] args) {
		methods cal=new methods();
		
		// for void()
//		cal.a=100;
//		cal.b=200;
//		cal.sum();	// op is 300
		
//		// // method takes parameter
//		cal.sum(300, 400);
//		// op is 700
//		
		
		// return sum values
		cal.a=500;
		cal.b=600;
		int r= cal.sum();
		System.out.println(r);	//op is 1100
	}
	
}
