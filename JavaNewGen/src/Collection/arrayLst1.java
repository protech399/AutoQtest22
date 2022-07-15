package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class arrayLst1 {

	public static void main(String[] args) {
		ArrayList<String> x= new ArrayList<String>();
		x.add("Z");
		x.add("H");
		x.add("S");
		x.add("S");
		x.add("E");
		x.add("L");
		x.add("E");
		x.add("T");
		
		for(int i=0; i<x.size(); i++) {
		Collections.sort(x);
		System.out.println(x.get(i));
		}	
	}

}
