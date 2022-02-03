package desafios_java_GFT4;

import java.io.IOException;
import java.util.Scanner;

/*	Desafios
 *	Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
 *
 *	Entrada
 *	Você receberá 1 valor inteiro N, onde N > 0.
 *
 *	Saída
 *	Exiba todos os números pares até o valor de entrada, sendo um em cada linha. */

public class ExibindoPares {
	
	public static void main(String[] args) throws IOException {
	      Scanner entrada = new Scanner (System.in);
	    	int inicio = 0;
	    	do{
	    	  int par = entrada.nextInt();
	    	  for (int i = 1  ; i <= par ; i++) {
	    		  if (i % 2 == 0 ) {
	    		    System.out.println(i);
	    		    
	    		  }
	    	  }
	    	  inicio++;
	    	}while(inicio < 1);
	    
	    	entrada.close();
	    }
	

}
