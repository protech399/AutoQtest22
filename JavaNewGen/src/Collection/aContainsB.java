package Collection;

import java.util.ArrayList;
import java.util.List;

public class aContainsB {
/*	
 * Array					Vs					ArrayList
 * Fixed Size									Dynamic Size
 * Homogeneous	like only int....				Heterogeneous like int string char etc
 * insertion & Removal is Difficult				Insertion & Removal is easy 

	*/

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		List<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(2);
		B.add(3);
		B.add(4);
		
		System.out.println(A.containsAll(B)); // op is false
		System.out.println(B.containsAll(A));	// op is true
		
		A.addAll(B);  // merge B into A (B insert into A)
		// op is [1, 2, 3, 1, 2, 3, 4]
		
		
// contains (finding variable form the list)
		System.err.println(A.contains(5));	//false
		System.out.println(B.contains(4));	//true
		
//	List Q={1,2,3,4}; 
//	List Z={3,4,5,6}; // List W should be {1,2,3,4,5,6};
		List<Integer> Q = new ArrayList<Integer>();
		Q.add(1);
		Q.add(2);
		Q.add(3);
		Q.add(4);
		List<Integer> Z= new ArrayList<Integer>();
		Z.add(3);
		Z.add(4);
		Z.add(5);
		Z.add(7);
		List<Integer> W=new ArrayList<Integer>();
		W.addAll(Q); //[1, 2, 3, 4] & Z.size=4
		for(int i=0; i<Z.size(); i++) {
			if(!W.contains(Z.get(i))) {	//
				W.add(Z.get(i));
			}
		}System.out.println(W);	// op is [1,2,3,4,5,7]
		
// List S={"Cat","Dog","Elephant","Cat","Tiger","Cow"}
// List X={"Cat","Dog","Elephant","Tiger","Cow"} duplicate value avoid  
		List<String> S = new ArrayList<String>();
		S.add("Cat");
		S.add("Dog");
		S.add("Elephant");
		S.add("Cat");
		S.add("Tiger");
		S.add("Cow");
		
		List<String> X=new ArrayList<String>();
					// S.size=6
		for(int i=0; i<S.size(); i++) {
			if(!X.contains(S.get(i))) {	//
				X.add(S.get(i));
			}
		}System.out.println(X);	// op is [Cat, Dog, Elephant, Tiger, Cow]
		
// Heterogeneous Data
		List<Object> E=new ArrayList<Object>();
		E.add("Cat");
		E.add('D');
		E.add(9);
		E.add(9.3566);
		E.add('$');		
		System.out.println(E); //op is [Cat, D, 9, 9.3566, $]
		

		 
		
	}

}
