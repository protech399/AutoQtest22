package javabasic;


public class Pattern_1 {
	public static void main(String[] args) {

		int i,j, space =1;
//		System.out.print("Enter no of rows");
//		Scanner s= new Scanner(System.in);
//		n= s.nextInt();
		int n=7;
		space= n-1;
		for(j=1; j<=n; j++) {
			for(i=1; i<=space; i++) {
				System.out.print(" ");
			}
			space--;
			for(i=1; i<=2*j-1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		for(j=1; j<=n-1; j++) {
			for(i=1; i<=space; i++) {
				System.out.print(" ");
			}
			space++;
			for(i=1; i<=2*(n-j)-1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
		
		
		
		
		
		
		//		for(int i=0; i<=5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<=5; i++) {
//			for(int j=4; j>=i; j-- ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

//	public static void pyramid(int n) {
//		for(int i=0; i<n; i++ ) {	// outer loop for num of rows
//			for(int j=n-i; j>1; j--) {	//inner loop for space
//				System.out.println();	//for space
//			}
//			for() {
//				
//			}
//		}
//		
//		
//	}
}





