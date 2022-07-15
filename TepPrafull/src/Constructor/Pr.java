package Constructor;

public class Pr {
	
	Pr(){			//Default Constructor, always created no need to create (no argument constructor & does not have any return(no void)
		System.out.println("inside the constructor");
	}	// execute automatically
		
	Pr(int a){		// Parameterized constructor
		System.out.println("Parameterised costructor");
	}
	
	public static void main(String[] args) {
	System.out.println("main");
	
	Pr a= new Pr(5);
	a.m1();
	
	System.out.println("main1");
	}
	
	void m1() {
		System.out.println("m1");
		m2();
		m3();
	}

	void m2() {
		System.out.println("m2");
	}
	static void m3() {
		System.out.println("m3");
	}
	
	static{
		System.out.println("execute 1st static always");
	}
	
	{
		System.out.println("in insatnce block");
	}
}
