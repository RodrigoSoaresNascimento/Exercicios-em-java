package DesafioUm;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class OrdenandoParEImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Integer tamanho = entrada.nextInt();
		Integer [] vetorNumeros = new Integer [tamanho];
		for(int i = 0; i < tamanho; i++) {
			vetorNumeros[i] = entrada.nextInt();
		}
		Arrays.sort(vetorNumeros);
		for(int pares = 0 ; pares < tamanho; pares++) {
			if(vetorNumeros[pares] % 2 == 0) {
			System.out.println(vetorNumeros[pares]);
			}
		}
		 Arrays.sort(vetorNumeros, Collections.reverseOrder()); 
		for(int impares = 0; impares < tamanho; impares++) {
			if(vetorNumeros[impares] % 2 != 0) {
				System.out.println(vetorNumeros[impares]);
			}
		}
		
		entrada.close();
		

	}

}
