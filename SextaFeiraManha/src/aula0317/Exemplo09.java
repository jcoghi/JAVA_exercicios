package aula0317;
// Par ou Impar e Positivo ou Negativo
import java.util.Scanner;

public class Exemplo09 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero inteiro:");
        num = tc.nextInt();
        
        if (num % 2 == 0){ //PAR
            if (num >= 0){ // Positivo
                System.out.println("Par e Positivo");
            } else { // Negativo
                System.out.println("Par e Negativo");
            }
        }else{// IMPAR
            if (num >= 0) { // Positivo
                System.out.println("Impar e Positivo");
            } else { // Negativo
                System.out.println("Impar e Negativo");
            }
        }
        
        tc.close();
    }
}
