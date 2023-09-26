package tercafeiravo;

import java.util.Scanner;

public class ParPositivo {
 
    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner teclado = new Scanner(System.in);
        int entrada;
        
        // Entrada do número
        System.out.print("Digite um número inteiro: ");
        entrada = teclado.nextInt();
        
        // Condicionais
        // Par
        if (entrada % 2 == 0 && entrada > 0){
          System.out.println(entrada + " é par e positivo");
        }else if (entrada % 2 == 0 && entrada < 0) {
            System.out.println(entrada + " é par e negativo");
        }
	// Ímpar
        else if(entrada % 2 != 0 && entrada > 0) {
            System.out.println(entrada + " é ímpar e positivo");
        }else if(entrada % 2 != 0 && entrada < 0) {
            System.out.println(entrada + " é ímpar e negativo");
        }
        // Zero
	else{
            System.out.println(entrada + " é par e neutro");
        }
             
        
        teclado.close();
    }
    
public static void Verificar(int entrada) {
if (entrada % 2 == 0){
    if (entrada > 0){
        System.out.println("Par e Positivo");
    }else if (entrada < 0){
        System.out.println("Par e Negativo");
    } else {
        System.out.println("Par e neutro");
    }
} else if (entrada % 2 != 0) {
    if (entrada > 0){
        System.out.println("Ímpar e Positivo");
    }else if (entrada < 0){
        System.out.println("Ímpar e Negativo");
    }
}
}
}