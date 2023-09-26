package aula0310;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um numero inteiro:");
        numero = teclado.nextInt();
        
        if (numero % 2 == 0){ // Verificando se é PAR
            if(numero >= 0) { // Verificando se é POSITIVO
                System.out.println("Par e Positivo");
            } else { // Negativos
                System.out.println("Par e Negativo");
            }
        } else {
            if (numero >= 0){
                System.out.println("Impar e Positivo");
            } else{
                System.out.println("Impar e Negativo");
            }
        }
    }
    
}
