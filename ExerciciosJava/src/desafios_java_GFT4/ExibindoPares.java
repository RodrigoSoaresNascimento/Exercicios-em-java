package desafios_java_GFT4;

import java.io.IOException;
import java.util.Scanner;

/*	Desafios
 *	Crie um programa que leia um n�mero e mostre os n�meros pares at� esse n�mero, inclusive ele mesmo.
 *
 *	Entrada
 *	Voc� receber� 1 valor inteiro N, onde N > 0.
 *
 *	Sa�da
 *	Exiba todos os n�meros pares at� o valor de entrada, sendo um em cada linha. */

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
