
public class Practice {

	
	public static void main(String[] args) {
		int a=100, c=30, d=400;
		int b=20;
		// turnery operator
		int max=(a>b && a>c && a>d)?(a):((b>a && b>c && b>d)?(b):((c>a && c>b && c>d)?(c):(d)));
		System.out.println(max);
		
		
		
		String x="WeLcoMe To AutOmaTion";
		int Capital=0; String Caps="", Smll="";
		int Small=0;
		for(int i=0; i<x.length(); i++) {
			char ch=x.charAt(i);
			if(ch>=65 && ch<=90) {
				Capital++;
				Caps=Caps+x.charAt(i);
			}else {
				Small++;
				Smll=Smll+x.charAt(i);
			}
		}System.out.println(Caps+" "+Capital);
		System.out.println(Smll+" "+Small);
	}
} 