package OrdenacaoPalavras;

/*Desafio
Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. 
Seu programa deve receber um conjunto de palavras e retornar este mesmo 
conjunto ordenado pelo tamanho das palavras decrescente, 
se o tamanho das palavras for igual, deve-se ordernar por ordem alfab�tica.*/

/*Entrada
A primeira linha da entrada possui um �nico inteiro N, que indica o n�mero de casos de teste. 
Cada caso de teste poder� conter de 1 a 50 palavras inclusive, 
e cada uma das palavras poder� conter entre 1 e 50 caracteres inclusive. 
Os caracteres poder�o ser espa�os, letras, ou n�meros.*/

/*Sa�da
A sa�da deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o 
tamanho das palavras for igual, deve-se ordernar por ordem alfab�tica.. 
Um espa�o em branco deve ser impresso entre duas palavras.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoPalavras {
	
	public static void main(String[] args) throws IOException {
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		List<String> words = new ArrayList<>();
		
		
		for(int i = 0; i < n ; i++) {
			
			 var sentence = reader.readLine();
			
			
			words.addAll(Arrays.stream(sentence.split(" ")).collect(Collectors.toList()));
			
			 var ordenedList = words.stream().sorted(Comparator.comparingInt(String::length).reversed()
					 .thenComparing(String:: compareTo)).collect(Collectors.joining(" "));
			 
			 System.out.println(ordenedList);
			 words.clear(); 
			
		}
		
		;
		
		
	}
	

}
