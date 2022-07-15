package tempPrafull1;

public class tempPrafull1 {


	public static void main(String[] args) {
		
		String x= "TODO12840 A2ruto-gr32ene3tra6ted Me236thod S23ttub";
		String y="";
		for(int i=0; i<x.length(); i++)
		{
			if(Character.isUpperCase(x.charAt(i)))
			{
				y=y+Character.toLowerCase(x.charAt(i));
			}
			else if(Character.isLowerCase(x.charAt(i)))
			{
				y=y+Character.toUpperCase(x.charAt(i));
			}
			else
			{
				y=y+x.charAt(i);
			}
				
		} System.out.println(y);
 	}

}
