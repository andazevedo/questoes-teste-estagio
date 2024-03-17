package questoesEstagio;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite uma string para inverter: ");
        String stringOriginal = scanner.nextLine();
        
       
        String stringInvertida = inverterString(stringOriginal);

        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);
        
       
        scanner.close();
    }

    public static String inverterString(String string) {
       
        String stringInvertida = "";
        
       
        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }
        
      
        return stringInvertida;
    }
}
