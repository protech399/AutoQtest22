
public class swapingNo {

	public static void main(String[] args) {
		// Swapping no.
				int a=10, b=20, temp;
				temp=a;
				a=b;
				b=temp;
				System.out.println(a); //20
				System.out.println(b); //10
				
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println(a);	//10
				System.out.println(b);	//20
			
				a=a*b;
				b=a/b;
				a=a/b;
				System.out.println(a);	//20
				System.out.println(b);	//10
	}

}
