
public class ifElse1 {

	public static void main(String[] args) {
		// if else
		int a=10, b=20, c=50, d=200;		
		
	/*		if (a>b) {
			if (a>c) {
			System.out.println("A is Bigger");
			}else {
				System.out.println("c is Bigger");
			}
		}
		else {if (b>c) {
			System.out.println("B is Bigger");
		}
		else {
			System.out.println("C is Bigger");
		}
		} */
		
		if (a>b) {
			if (a>c) {
				if (a>d) {
					System.out.println("A is Bigger");
				}else {
					System.out.println("D is Bigger");
				}
			}else {
				if(c>d) {
					System.out.println("C is Bigger");
				}else {
					System.out.println("D is Bigger");
				}
			} 
		}else {
			if (b>c) {
				if(b>d) {
					System.out.println("B is Bigger");
				}else {
					System.out.println("D is Bigger");
				}
			}else {
				if(c>d) {
					System.out.println("C is Bigger");
				}else {
					System.out.println("D is Bigger");
				}
			}
		}
	}

}


								/*			If else if

										(a-------b------c-----d)
							a---------------------->------------------------b
							|	if							else			|		
							|												|
					a------->-------c								b------->-------c
					|	if	  else	|								|	if    else	|
					|				|								|				|
			a------->-------d	c--->--	d					b------->-------d	c--->---d
			|	if	  else	|	|if else|					|if		  else	|	|if else|
			|				|	|		|					|				|	|		|
			a				d	c		d					b				d	c		d			*/



