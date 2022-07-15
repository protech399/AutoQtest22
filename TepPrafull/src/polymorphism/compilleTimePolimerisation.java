package polymorphism;

public class compilleTimePolimerisation {
/*	Method overLoading			Vs				Method OverRiding
	1) method name should be same					1) method names should be same 
	2) These method should present in same class		2) these methods should present in diff. Classes
	3) Method should have different arguments		3) METHOD SHOULD HAVE sAME ARGUMENTS 
	-- no of argument								-- no of arguments
	-- arguments sequence							-- argument sequence should be same 
	-- type of arguments							-- same type of arguments
													4) inheritance concept should be used
	*/
	
	void test(int a,String b, char c) {
		System.out.println("int  a");
	}
	
	void test(String b, int a, char c) {
		System.out.println("non parameterised");
	}
	
	public static void main(String[] args) {
		compilleTimePolimerisation	r1=new  compilleTimePolimerisation();
				r1.test(1, "Abi", 'c');
				r1.test("Abi", 1, 'c');
	}
}

