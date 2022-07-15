package Array;

public class arraye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] a= new int[5];
		a[0]=10;
		a[1]=14;
		a[2]=23;
		a[3]=3;
		a[4]=5;  
			
		for (int i=0; i<a.length; i++) {
		sum=sum+a[i];	
		}System.out.println(sum);  
	 
/*		for (int i=0; i<a.length; i++) {
			a[i]= i*i;		//used for to store i into a[]
			}		*/

		
		int b[]= {4, 6, 7, 8, 2, 4, 8, 9};
		int c=0;
		for (int j=0; j<b.length; j++) {
			c= c + b[j];
		}System.out.println(c);
		
		float avg =c/b.length;
		System.out.println(avg);
		
		
	}

}
