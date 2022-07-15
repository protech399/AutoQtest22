package Array;

public class ArrayEven {

	public static void main(String[] args) {
		// wap to find even & odd of array elements
		int a[]= {4,6,7,8,2,4,8,9};
		int even=0;
		int odd=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even= even+1;
			}else {
				odd= odd+1;
			}
		}System.out.println(even);
		System.out.println(odd);
	}
}