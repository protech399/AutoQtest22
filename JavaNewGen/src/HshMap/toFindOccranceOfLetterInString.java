package HshMap;

import java.util.HashMap;
import java.util.Map;

public class toFindOccranceOfLetterInString {

	public static void main(String[] args) {
		String x="myspaceclass";
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		for(int i=0; i<x.length(); i++) {
			if(hm.containsKey(x.charAt(i))) {
				int count= hm.get(x.charAt(i));
				hm.put(x.charAt(i), count+1);
			}else{
				hm.put(x.charAt(i), 1);
			}
		}
		
		for (Map.Entry<Character, Integer> hm1: hm.entrySet()) {
			System.out.println(hm1.getKey() +" "+ hm1.getValue());
		}
	}

}
