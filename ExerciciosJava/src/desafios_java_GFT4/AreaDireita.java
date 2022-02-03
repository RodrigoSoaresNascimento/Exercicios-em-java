package desafios_java_GFT4;

/*Desafio
* Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada 
* e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia considerando 
* somente aqueles elementos que est�o na �rea direita da matriz, conforme ilustrado abaixo (�rea verde).
*
* Entrada
* A primeira linha de entrada contem um �nico caractere Mai�sculo O ('S' ou 'M'), 
* indicando a opera��o (Soma ou M�dia) que dever� ser realizada com os elementos da matriz.
* Seguem os 144 valores de ponto flutuante que comp�em a matriz.
*
* Sa�da
 *Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto decimal.*/

import java.io.IOException;
import java.util.Scanner;

public class AreaDireita {
	
	public static void main(String[] args) throws IOException {
        
		Scanner leitor = new Scanner(System.in);
        double soma = 0;
        
        char O = leitor.next().toUpperCase().charAt(0);
        
        double[][] M = new double[12][12];
        
        for (int i = 0; i < 12; i++ ) {
        	
        	for (int j = 0; j < 12; j++ ) {
        		
        		M[i][j] = leitor.nextDouble();
        	}
        }
        
        for ( int i = 0; i < 12  ; i++) {
        	for ( int j = 0; j < 12  ; j++ ) {
        		
        		if (i+j >= 12 && j > i ) soma += M[i][j];
        	}
        }

        if (O == 'S' ){
        	
    	    System.out.println(String.format("%.1f", soma));
          
        }else {
          
          System.out.println(String.format("%.1f", soma/30));
          
        }
    	leitor.close();
    }
	

}
