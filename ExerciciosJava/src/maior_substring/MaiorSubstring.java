package maior_substring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
		
    	String lineOne, lineTwo, min = "", max = ""; //declare suas variaveis aqui
        while ((lineOne = in.readLine()) != null) { // complete seu código
              
              lineTwo  = in.readLine();
              
            if (lineOne.length() > lineTwo.length()) {  
            	
            	max = lineOne;
            	
            	min = lineTwo;
            	
            	
            } else {
            	
            	max = lineTwo;
            	
            	min = lineOne;
            }
            
            int minLength = min.length();
            
            int maxS = minLength;
            
            boolean f = true;
            
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                
                for (int i = 0; i <= diff; i++ ) { //complete o laco de repeticao
                    
                	if (max.contains(min.substring(i, i + maxS))) {
                        
                		f = false;
                        
                		maxS++;
                        
                		break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    	
	}

}
