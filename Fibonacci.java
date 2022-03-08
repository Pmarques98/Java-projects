package br.usp.ime.mac321.lista04.ex1;

public class Fibonacci {

		
	public static int fibonacci(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		int cont;
	 
	 if (n <0)
		n2= -1;
	 if (n == 0)
		n2 = 0;
	 if (n == 2 || n == 1 )
		n2 = 1;
	 if (n == 3) {
		 n2 = 3;
	 }
	if(n > 3) {
		for(cont=2;cont<=(n);cont++) {
			 n3=n1+n2;  
			 n1=n2;  
			 n2=n3;  
		}
		
	}
	return n2;
  }
	

}
