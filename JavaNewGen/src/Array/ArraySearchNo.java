package Array;

public class ArraySearchNo {

	public static void main(String[] args) {
		// wap to Search no from the array
		int a[]= {4,6,7,8,2,4,8,9};
		int srachNum=6;
		boolean flag= false;
		for(int i=0; i<a.length; i++) {
			if(a[i]==srachNum) {
				flag= true;
				break;
			}
		}
			if(flag==true) {
				System.out.println("found");
			}else {
				System.out.println("not found");
			}
	}

}
