
public class factorialOfno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5! = 5*4*3*2*1
		int n=6, fact=1;
		
		for(int i=n; i>=1; i--) {
			fact = fact*i;
			
		}System.out.println(fact);
		
		
// +2-4+6-8+10....50  odd->sum & even->sub____________________________________
		
		int sum=0;
		int count=0;
		
		for(int i=2; i<=50; i=i+2) {
			if (count%2==0) {
				sum=sum+i;
			}else {
				sum=sum-i;
			}
			count=count+1;
		} System.out.println(sum+" "+ count);
		
	}

}
