package Costructor;

/*	Static
	Main
	Block
	Default Constructor
	Block
	Parameterized Constructor=7
	Instance m1	
	Static m3
	NonStatic m2
*/

public class cOnstructor {
	int a;
	int b;
	public cOnstructor() {
		System.out.println("Default Constructor");
	}
	
	public cOnstructor(int c, int d) {
		a=c;
		b=d;
		System.out.println("Parameterized Constructor="+(a+b));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
		
		cOnstructor p1=new cOnstructor();
		cOnstructor p2=new cOnstructor(3, 4);
		p1.m1();
		p2.m2();

	}
	
	void m1() {
		System.out.println("Instance m1");
		
		m3();
	}
	
	void m2() {
		System.out.println("NonStatic m2");
	}
	
	static void m3() {
		System.out.println("Static m3");
	}
	
	static {
		System.out.println("Static");
	}
	
	{
		System.out.println("Block");
	}

}
