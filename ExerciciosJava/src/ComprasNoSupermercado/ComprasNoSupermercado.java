package ComprasNoSupermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.LinkedList;
import java.util.Scanner;

public class ComprasNoSupermercado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//entrada com um valor inteiro que vai indicar a quantidade de listas vazias a ser criada//
		int n = Integer.parseInt(entrada.nextLine());
		//instanciando uma lista vazia da Classe String\\
		
        List<String> list = new ArrayList<>();
        //pulo do gato eu não sabia que dava para instanciar uma lista dentro da outra\\
        List<List<String>> listFinal = new ArrayList<>();
        //laço for classico cheguei nessa parte também//
        for (int i = 0; i < n; i++) {
        	// dando entrada nos objetos da lista\\
            String line = entrada.nextLine();
            
            Stream<String> st = Stream.of(line);
            String[] listSplited = line.split(" ");
            list = Arrays.stream(listSplited).distinct().sorted().collect(Collectors.toList());
            listFinal.add(list);
        }
        for (int i = 0; i < listFinal.size(); i++) {
            for (int x = 0; x < listFinal.get(i).size(); x++){
                System.out.print(listFinal.get(i).get(x) +" ");
            }
            System.out.println();

		
		entrada.close();
	}

	}}
