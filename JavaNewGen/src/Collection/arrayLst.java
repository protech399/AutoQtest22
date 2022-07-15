package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class arrayLst {

	public static void main(String[] args) {
		ArrayList<String> x= new ArrayList<String>();
		x.add("A");
		x.add("B");
		x.add("C");
		x.add("D");
		x.add("D");
//		x.add(null);
//		x.add(null);
		x.remove(2);
		x.add(2, "Z");
		Collections.sort(x);
		System.out.println(x);	//op is [A, B, D, D, Z]
		
//		it allows Dynamic size
//		it contains duplicate value
//		it allows multiple values
//		insertion order is preserved	
		
	}

}
