package desafios_java_GFT4;

/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina 
 * e precisa de sua ajuda para organizar os experimentos de um laboratório 
 * o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias 
 * foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
 Para obter estas informações, ela sabe exatamente o número de experimentos que foram 
 realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem 
a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade 
de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia 
(R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual
 de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado 
 com dois dígitos após o ponto.*/

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int testes = entrada.nextInt();
        int rato = 0; int sapo = 0; int coelho = 0; double total = 0;
        double ratoPorce = 0; double coelhoPorce = 0; double sapoPorce = 0;
        
        
       for(int i = 0; i <= testes; i++) {
    	   
    	   List <String> cobaias = Arrays.asList(entrada.nextLine().split(" "));
    	   
    	 if(cobaias.contains("R")) {
    		 
    		 rato += Integer.parseInt(cobaias.get(0));
    		 
    	 }else if(cobaias.contains("S")){
    		 
    		 sapo += Integer.parseInt(cobaias.get(0));
    		 
    	 }else if(cobaias.contains("C")) {
          
    		 coelho += Integer.parseInt(cobaias.get(0));
    	 }  
       }
        
        
        
        total = sapo + coelho + rato;
        ratoPorce = (rato * 100)/total ;
        sapoPorce = (sapo * 100)/total ;
        coelhoPorce = (coelho * 100)/total ;
        
        System.out.printf("Total: %.0f cobaias\n", total );
        
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        
        System.out.printf(Locale.US, "Percentual de coelhos: %.2f %%\n" , coelhoPorce);
        System.out.printf(Locale.US,"Percentual de ratos:  %.2f %%\n" , ratoPorce );
        System.out.printf(Locale.US,"Percentual de sapos:  %.2f %%\n" , sapoPorce );
       
        entrada.close();
	}

}
