
public class even1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=1; i<=100; i++) {
			
			if (i%2==0) {	//==1 for Odd no
				count=count+1;
				System.out.println(i+" ");
			}
		}
		System.out.println("count"+"-"+ count); // op is count 50
	}

}
