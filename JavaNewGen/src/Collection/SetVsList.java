package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* SET - allows only unique values, 
		 Insertion order is not preserved
       	allows one null value
       	SET					Vs					List		
* allows only unique values				allows Duplicate values
* Insertion order is not preserved		Insertion order is preserved
* allows one null value					allows multiple null value
*
*/

public class SetVsList {

	public static void main(String[] args) {
		List<Integer> A=new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(1);
		A.add(null);
		A.add(null); //op is [1, 2, 3, 1, null, null]
		
		Set<Integer> B=new HashSet<Integer>();
		B.add(1);
		B.add(2);
		B.add(3);
		B.add(1);
		B.add(null);
		B.add(null);	// op is [null, 1, 2, 3]
		
		System.out.println(A);
		System.out.println(B);
	}

}
