/*
 * O usuário digitará notas entre 0 e 10 e, no final 
 * do programa ele recebe a média das notas informadas
 */
package aula0404;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        double notas, acumulador = 0, contador = 0;
        boolean status = true;
        
        System.out.println("Digite -1 a qq momento para sair");
        
        while (status) {
            
            System.out.println("Digite uma nota");
            notas = tc.nextDouble();
            
            if (notas == -1) {
                status = false;
            } else if (notas < 0 || notas > 10) {
                System.out.println("Nota invalida");
            } else {
               acumulador += notas;
               System.out.println("Acumulador = " + acumulador);
               contador++;
                System.out.println("Contador = " + contador);
            }
        }
        System.out.println("Media = " + acumulador / contador);
        tc.close();
    }

}
