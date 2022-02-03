package UniformesDeFinalDeAno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*Desafio
O professor Girafales organizou a confecção de um uniforme para as turmas 
da escola para comemorar o final do ano. Após algumas conversas, 
ficou decidido com os alunos que eles poderiam escolher a cor do 
uniforme entre branco ou vermelho. Assim sendo, Girafales precisa 
de sua ajuda para organizar as listas de quem quer o uniforme em 
cada uma das turmas, relacionando estas camisetas pela cor, 
tamanho (P, M ou G) e por último pelo nome.*/

/*Entrada
Cada caso de teste inicia com um valor N, 
(1 ≤ N ≤ 60) inteiro e positivo, 
que indica a quantidade de uniformes a serem feitas para aquela turma.
As próximas N*2 linhas contém informações de cada um dos uniformes 
(serão duas linhas de informação para cada uniforme). 
A primeira linha irá conter o nome do estudante
e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho")
seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G".
A entrada termina quando o valor de N for igual a zero (0) 
e esta valor não deverá ser processado.*/

/*Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas 
pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente
 e por último por ordem ascendente de nome, conforme o exemplo abaixo.*/

public class UniformesFinalAno {
	
	public static void main(String[] args) throws IOException  {
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
		Scanner input = new Scanner (System.in);
		int n = Integer.parseInt(reader.readLine());
		String name = "";
		String colorSize = "";
		
		
		List<String> unifomrs = new ArrayList<>();
		
		
		
		for(int i = 0; i < n; i++) {
			
			name = reader.readLine();
			
			
			colorSize =  reader.readLine();
			
			colorSize.split(" ");
			
			unifomrs.add(colorSize + " "+ name);
			
		}	
			
        String listStrin = unifomrs.stream()
                .sorted(Comparator.comparing(s1 -> s1.toString().substring(0,s1.toString().indexOf(32)))
                .thenComparing(s1 -> s1.toString().substring(s1.toString().indexOf(32)+1, s1.toString().indexOf(32, s1.toString().indexOf(32)+1)), Comparator.reverseOrder())
                .thenComparing(s1 -> s1.toString().substring(2)))
                .collect(Collectors.joining("\n"));

        System.out.println(listStrin);	
		
		
        
       input.close();
		
	}
	
	
	
}

	
	  
	