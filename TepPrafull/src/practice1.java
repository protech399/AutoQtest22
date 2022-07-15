
public class practice1 {

	public static void main(String[] args) {
		
		// wap to find sum of Array Elements
		
		int[] a= {4,6,7,8,2,4,8,9};
		int sum= 0;
		int count=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+ a[i];
			if (a[i]%2==0) {	// wap to find.. 
				count=count+1;	//count even no..
			}	System.out.println(count); // of Array Elements
			
		}System.out.println(sum);
		
		// wap to find AVG of Array Elements
		
		double avg= sum/a.length;
		System.out.println(avg);

		// wap to find count even no of Array Elements
		
/*		int[] a= {4,6,7,8,2,4,8,9};
		int count=0;
		for(int i=0; i<a.length; i++) {	
  			if (a[i]%2==0) {
			count=count+1;
		}	System.out.println(count);		
		}									*/	

		// wap to find count even & odd no of Array Elements
		
/*		int[] a= {4,6,7,8,2,4,8,9};
		int Evencounter=0;
		int Oddcounter=0;
		for(int i=0; i<a.length; i++) {	
  			if (a[i]%2==0) {
			Evencounter=Evencounter+1;
		}else{
			Oddcounter=Oddcounter+1;
		}	System.out.println(Evencount);		
		}									*/	
		
		
	}

}
