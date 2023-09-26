/*Leia várias idades e calcule a média entre as idades.*/
package aula0327;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int contador = 0, acumulador = 0;
        
        for (int i = 1;; i++){
            System.out.println("Informe a idade " + i + ":");
            acumulador += tc.nextInt();
            contador++;
//            Condição de saída do FOR
            System.out.println("Deseja continuar?[S]/[N]");
            char continuar = tc.next().toUpperCase().charAt(0);
            if (continuar == 'N') {
                break;
            } 
        }
        
        System.out.println("Acumulador = " + acumulador);
        System.out.println("Contador = " + contador);
        System.out.println("Media = " + (double)acumulador / contador);

        tc.close();
    }   
}
