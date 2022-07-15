package array;

public class TowDimArry {
	
	public static void main(String[] args) {
		int a[][]= new int[3][2];	// declaration of row & columns
		
		// storing values in array
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
//		// classic for loop
//		for(int i=0; i<=2; i++) {	//incrementing rows
//			for (int j=0; j<=1; j++) {	//incrementing columns
//				System.out.print(a[i][j]+" ");	//op is 10,20,30,40,50,60
//			}
//			System.out.println(); //op is 1020, 3040, 5060
//		}
		
		// for each loop
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");	//10,20,30,40,50,60
			}
			System.out.println();	//op is 10 20, 30 40, 50 60
		}
		
		// multi dimenstional array
		int b[][]= {{10,20,25},{30,40,45},{50,60,65},{70,80,85},{90,100,105}};
		for(int k[]:b) {
			for(int l:k) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
		//
		
	}
}
