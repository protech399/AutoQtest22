package tempPrafull1;


public class Snippet {
			

	public static void main(String [] args){
		int a[]= {4,5,6,3,5,7,1,1,3};
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}System.out.println(count);
		
	}
}