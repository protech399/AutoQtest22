package ClassMethodOBJ;

public class Method {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		Method OBJ = new Method();
		int c = OBJ.add(a, b);
		OBJ.sub(c, 50);
		
	}
	int add(int a, int b) {
		int c= a+b;
		System.out.println(c);
		return c;
	}
	
	void sub (int a, int b) {
		int c= a-b;
		System.out.println(c);
	}
	
}
