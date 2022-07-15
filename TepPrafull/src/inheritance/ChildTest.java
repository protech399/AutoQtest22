package inheritance;

public class ChildTest extends ParentTest {
	
	
	public static void main(String[] args) {
		
		ChildTest ch=new ChildTest();
		m1();
		m2();
		ch.m3();
		ch.m4();
		
//		ChildTest ch1=new ParentTest(); // Invalid 
//		m1();
//		m2();
//		ch.m3();
//		ch.m4();
		
		ParentTest ch2=new ChildTest();
		m1();
		m2();
		ch2.m3();
		
		ParentTest ch3=new ParentTest();
		m1();
		m2();
		ch3.m3();
		
		
	}
	void m4() {
		System.out.println("method 4 in child class");
	}
}
