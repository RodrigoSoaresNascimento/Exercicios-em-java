package Fila_No_Banco;

//Fila do Banco

/* O banco que você trabalha sempre tem problemas para organizar as filas de
atendimento dos clientes.
Após uma reunião com a gerência ficou decidido que os clientes ao chegar na
agência receberão uma senha numérica em seu aparelho de celular via sms e que
a ordem da fila será dada não pela ordem de chegada, mas sim pelo número
recebido via sms. Sendo, aqueles com número maior deverão ser atendidos primeiro. 
Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o
número recebido via sms, e diga quantos clientes não precisaram trocar de
lugar nessa reordenação.
- Entrada
A primeira linha contém um inteiro N, indicando o número de casos de teste a
seguir.
Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número
de clientes. Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde
o i-ésimo inteiro indica o número recebido via sms do i-ésimo cliente.
Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro
diz respeito ao primeiro cliente a chegar na fila, o segundo inteiro diz
respeito ao segundo cliente, e assim sucessivamente.
- Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o
número de clientes que não precisaram trocar de lugar mesmo após a fila ser
reordenada. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class FilaNoBanco  {
	
	public static void main(String[] args) throws IOException {
       
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
     
     int cases = Integer.parseInt(reader.readLine());
     
     
     for(int i = 0; i < cases; i++) {
    	 
    	 int cont = 0;
    	 
    	 int numbersPassowords = Integer.parseInt(reader.readLine());
    	 
    	 String [] passowords = reader.readLine().split(" ");
    	 
    	 Integer[] ordenedPassowords = new Integer [numbersPassowords];
    	 
    	 for(int j = 0; j < numbersPassowords; j++ ) {
    		 
    		 ordenedPassowords[j] = Integer.parseInt(passowords[j]);
    		 
    	 }
    	 
    	 Arrays.sort(ordenedPassowords,Collections.reverseOrder());
    	 
    	 for(int k = 0; k < numbersPassowords; k++ ) {
    		 
    		 if(ordenedPassowords[k] == Integer.parseInt(passowords[k])) {
    			 
    			 cont++;
    			 
    		 }
    		 
    	 }
    	 System.out.println(cont);
    	 
    	 
    	 
     }
     
        
    }

}
