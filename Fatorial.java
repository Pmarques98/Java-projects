
public class Fatorial {
	public static void numero (int a) {
	    int fatorial = 1;
	    
	    if (a < 0){
	    	System.out.println("0");
	     }
	    if (a >= 0){
	    for (int i = 1;i <= a ; i ++ ) {
	      fatorial *= i;
	    }
	         System.out.println(fatorial);
	    
	    }
	  }
	}