package HshMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
/*its a Map Interface like phone dictionary
 * its contains Key value Pair
 * it allows Unique Key & Duplicate Values 
 * its used to store data in key value format
 * ex. 
 * Roll No				Name
 * 1					A
 * 2					B
 * 3					A
 * 4					C
 * 5					null
 * 6					null
 * null					D	

* can fetch value on basis of key
* 				   (Key,  Value)
* * Syntax:  HasMap<char, int> hm= new HasMap<char, int>(); 
*/
	public static void main(String[] args) {
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		hm.put('A', 1);
		hm.put('B', 2);
		hm.put('C', 1);
//		hm.put('A', null);
//		hm.put('E', null);
		hm.put(null, null);
		hm.put('E', -19);
		// op is {null=null, A=null, B=2, C=1, E=-19}
//		hm.remove('C');
		// op is {null=null, A=null, B=2, E=-19}
		
		System.out.println(hm.size()); // op is 4
		System.out.println(hm.get('B'));  // op is 2
		System.out.println(hm.containsKey('C')); // op is false
		
		for (Map.Entry<Character, Integer> hm1: hm.entrySet()) {
			System.out.println(hm1.getKey() +" "+ hm1.getValue());
		}	
/* op  is null null
		A 1
		B 2
		C 1
		E -19	*/
		
		HashMap<Character, Integer> hm2 = new HashMap<>();
		hm2.put('A', 1);
		hm2.put('B', 2);
		hm2.put('A', 3);
		hm2.put('C', 4);
		hm2.put(null, 5);
		hm2.put(null, 6);
		hm2.put('D', null);
		
		System.out.println(hm2);

	}

}
