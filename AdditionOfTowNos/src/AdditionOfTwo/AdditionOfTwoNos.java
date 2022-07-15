package AdditionOfTwo;

public class AdditionOfTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 20;
		
		int b= 3000;
		int c= 5000;
		int d= 10000;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("A is Bigger");
				} else {
					System.out.println("D is Bigger");
				}
			} else {
				if (c>d) {
					System.out.println("C is Bigger");
				}else {
					System.out.println("D is Bigger");
				}
			}
		}else {
			if(b>c) {
				if(b>d) {
					System.out.println("B is Bigger");
				}else {
					System.out.println("D is Bigger");
    				}
			}else {
				if(c>d) {
					System.out.println("C is Bigger");
				}else {
					System.out.println("D is Bigger");
				}
			}
		}
		
	}
}
