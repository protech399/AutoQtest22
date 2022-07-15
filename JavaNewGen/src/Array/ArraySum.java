package Array;

public class ArraySum {

	public static void main(String[] args) {
		int[] a= {4,6,7,8,2,4,8,9};
		int sum= 0;
		
		for(int i=0; i<a.length; i++) {
			sum= sum+a[i];
		
		}
		double avg = sum/a.length;
		System.out.println("avg="+avg);
		

	}

}
