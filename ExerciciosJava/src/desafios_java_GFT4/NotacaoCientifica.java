package desafios_java_GFT4;

/*	N�meros em ponto flutuante podem ser bastante extensos para mostrar. 
 * 	Nesses casos, � conveniente usar a nota��o cient�fica.
*
* 	Voc� deve escrever um programa que, dado um n�mero em ponto flutuante,
* 	mostre este n�mero na nota��o cient�fica: sempre mostre o sinal da mantissa; 
* 	sempre mostre 4 casas decimais na mantissa; use o caractere 'E' para separar a mantissa do expoente;
* 	sempre mostre o sinal do expoente; e mostre o expoente com pelo menos 2 d�gitos.
*
*	Entrada
*	A entrada � um n�mero em ponto flutuante de dupla precis�o X (de acordo com o padr�o IEEE 754-2008). Nunca haver� um n�mero com mais de 110 caracteres nem com mais de 6 casas decimais.
*
*	Sa�da
*	A sa�da � o n�mero X em uma �nica linha na nota��o cient�fica detalhada acima. Veja os exemplos abaixo.*/

import java.util.Scanner;

public class NotacaoCientifica {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		double x = leitor.nextDouble();
		
		System.out.println(String.format((String.valueOf(x).startsWith("-") ? "" : "+") + "%.4E", x));
		//Escreva aqui o seu c�digo
		leitor.close();

		
	}

}
