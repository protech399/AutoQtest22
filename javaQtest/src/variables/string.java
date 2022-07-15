package variables;


public class string {
	 static int a= 12;					//static variable
	 String name1= "hello word";		//instance varible
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string name = new string();// is object
									 
		System.out.println(name.name1);	//string data type
		
	int roll = 106;
	System.out.println("roll no. is"+roll);
	
	string t= new string();//new varTest();is object
	//new varTest().test();
	t.test();
	
	}
	
	int test() {  //instance
		int a=8;
		int b=5;
		int c=a+b;
		System.out.println(c);
		return 0;
	}   
	
}
	