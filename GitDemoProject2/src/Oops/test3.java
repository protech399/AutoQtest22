package Oops;

public class test3 {
	
	int a;
	int b;
	//method takes parameters & does not return any values
	void sum() {
		System.out.println(a+b);
	}
	
	// method takes parameter
	void aDD(int x, int y){
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
	// method return some values 
	int sum1(){
		return(a+b);
		
	}
	
		
	public static void main(String[] args) {
		
		test3 cal=new test3();
		cal.a=100;	//method takes parameters		
		cal.b=200;
		cal.sum();
		
		cal.aDD(300, 400);	// method takes parameter
		
		
		cal.a=500; cal.b=600;	// method returns some values
		int r= cal.sum1();
		System.out.println(r);
		
		
		
	}

}
