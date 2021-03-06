package senha.com.valida??o;


import java.util.Scanner;

public class SenhaComValidacao {
	
	public static void main(String[] args)  {
		
		
		Scanner scanner = new Scanner(System.in);
        String password;
        boolean passwordState = false;
        final String SENHA_VALIDA = "Senha valida.";
        final String SENHA_INVALIDA = "Senha invalida.";

        while (scanner.hasNextLine()) {

            password = scanner.nextLine();
            
            passwordState = checkPassword(password);

            if(passwordState){
            	
                System.out.println(SENHA_VALIDA);
                
            }else{
            	
                System.out.println(SENHA_INVALIDA);
            }
            
        }

        scanner.close();
    }

    static boolean checkPassword(String password) {
    	
    	//verificando o tamanho
        if (password.length() < 6 || password.length() > 32) {
            return false;
        }
        //verificando os caracteres
        char[] passChars = password.toCharArray();

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;
        //verificando se tem letra maiuscula
        for (char c : passChars) {
            //System.out.println(c);
            if (Character.isUpperCase(c)) {
            	
                hasUpper = true;
                
            } else if (Character.isLowerCase(c)) {
            	
                hasLower = true;
                
            } else if (Character.isDigit(c)) {
            	
                hasNumber = true;
                
            } else {
            	
                return false;
            }
        }

        

        if (hasLower && hasUpper && hasNumber) {
        	
            return true;
        }

        return false;
	}
	
}

 
