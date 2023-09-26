package aula0403;

import java.util.Scanner;

public class Exemplo02a {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        double contador = 0, nota, acumulador = 0;
        boolean ligado = true;
        
        System.out.println("Digite -1 a qualquer momento para sair");
        
        while (ligado){
            System.out.println("Digite uma nota: ");
            nota = tc.nextDouble();
            
            if (nota == -1) {
                System.out.println("Saindo...");
                System.out.println("--------------------");
                ligado = false;
            } else if (nota < 0 || nota > 10) {
                System.out.println("Voce digitou uma nota fora da faixa"
                        + " entre 0 e 10.");
            } else {
                acumulador += nota;
                contador++;
            }
        }
        
        if (contador == 0) {
            System.out.println("Nao ha media");
        } else {
            System.out.printf("Media  = %.2f \n", (acumulador / contador));
        }
        
        tc.close();
    }
    
}
