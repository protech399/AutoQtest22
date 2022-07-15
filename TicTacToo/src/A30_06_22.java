
 public class A30_06_22 {
	 
	 public String M(String Abhi, int a, int b) 
	 {
		 String Abhi1= Abhi;
		 int a1=a;
		 int b1=b;  
		 String data= Abhi1 + a1 + b1;
		return data;
	 }
  
	 public static void main(String[] args) {
		A30_06_22 x= new A30_06_22();
		String y=x.M("Swapnil", 1,1);
		String z=x.M("Akshay", 1,10);
		String c=x.M("Prafull", 1, 20);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
	}
	 
 }
		
		

