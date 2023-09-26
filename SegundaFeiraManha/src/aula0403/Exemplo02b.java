package aula0403;

import java.util.Scanner;

public class Exemplo02b {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        double soma = 0;
        int contador = 0;
        double media = 0;
        double nota = 0;
        
        while (nota != -1){
           System.out.println("Digite a nota (ou -1 para sair) :");
           nota = entrada.nextDouble(); 
           
            if (nota == -1){
               System.out.println("Encerrado");
            } else if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, tente novamente (ou -1 para sair) :");
            } else {
            soma += nota;
            contador += 1;
            }    
        }    
        
        media = soma / contador;
        System.out.println("Média: " + media);
        entrada.close();

    }
}
