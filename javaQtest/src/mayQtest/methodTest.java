package mayQtest;

public class methodTest {
	
	public static void m5() {
		int a=10,b=20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		m1();
		
		
	}

	static void m1() {
		System.out.println("Static M1");
		methodTest ref=new methodTest();
		ref.m2();
	}
	
	public void m2() {
		System.out.println(" M2");
		m3();
	}
	
	void m3() {
		System.out.println("instance M3");
		m4();
	}
	
	void m4() {
		System.out.println("nonstatic M4");
		m5();
	}
	
}