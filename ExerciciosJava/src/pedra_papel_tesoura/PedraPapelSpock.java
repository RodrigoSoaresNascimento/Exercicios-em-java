package pedra_papel_tesoura;

/* Pedra-papel-tesoura-lagarto-Spock � uma expans�o do cl�ssico m�todo de
sele��o em jogo de pedra-papel-tesoura. Atua sob o mesmo princ�pio b�sico,
mas inclui outras duas armas adicionais: o lagarto (formado pela m�o igual a
uma boca de fantoche) e Spock (formada pela sauda��o dos vulcanos em Star Trek).
Isso reduz as chances de uma rodada terminar em um empate. O jogo foi
inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock".

As regras de vantagem s�o as seguintes:

�	Tesoura corta papel
�	Papel cobre pedra
�	Pedra derruba lagarto
�	Lagarto adormece Spock
�	Spock derrete tesoura
�	Tesoura prende lagarto
�	Lagarto come papel
�	Papel refuta Spock
�	Spock vaporiza pedra
�	Pedra quebra tesoura

Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um
almo�o para o outro, com esta brincadeira. Sua miss�o ser� fazer um algoritmo
que, baseado no que eles escolherem, informe quem ir� ganhar ou se dar� empate.

- Entrada
Haver� diversos casos de teste. O primeiro n�mero a ser lido ser� um inteiro,
representando a quantidade de casos de teste. Cada caso de teste tem duas
palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

- Sa�da
Para cada caso de teste, imprima quem venceu, ou se houve empate. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PedraPapelSpock {

	public static void main(String[] args) throws IOException {
		
		List<Rules> rules = new ArrayList<>();
		rules.add(new Rules("tesoura", "papel"));
		rules.add(new Rules("papel", "pedra"));
		rules.add(new Rules("pedra", "lagarto"));
		rules.add(new Rules("lagarto", "spock"));
		rules.add(new Rules("spock", "tesoura"));
		rules.add(new Rules("tesoura", "lagarto"));
		rules.add(new Rules("lagarto", "papel"));
		rules.add(new Rules("papel", "spock"));
		rules.add(new Rules("spock", "pedra"));
		rules.add(new Rules("pedra", "tesoura"));

		
		BufferedReader src = new BufferedReader(new InputStreamReader(System.in)); 
		
		int cases =  Integer.parseInt(src.readLine());
		
		for(int i = 0; i < cases; i++ ){
			
			List <String> games = Arrays.asList(src.readLine().split(" "));
				
			if(games.get(0).equals(games.get(1))) {
					
					System.out.println("empate");
				
			}else {
				
				boolean first = false;
				
				for(Rules r : rules) {
					
					if(r.getWin().equals(games.get(0)) && r.getLose().equals(games.get(1))) {
						
						first = true;
						
						break;
						
					}
					
				}
				
				if(first) {
					
					System.out.println("fernanda");
					
				}else {
					
					System.out.println("marcia");
					
				}
				
			}
			
		
		}
		
		
	}
	
	public static class Rules{
		
		private String win;
		
		private String lose;

		public String getWin() {
			return win;
		}

		public void setWin(String win) {
			this.win = win;
		}

		public String getLose() {
			return lose;
		}

		public void setLose(String lose) {
			this.lose = lose;
		}

		public Rules(String win, String lose) {
			super();
			this.win = win;
			this.lose = lose;
		}

		
	}
}
