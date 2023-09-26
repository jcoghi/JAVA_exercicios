package aula0331;

import java.util.Scanner;

/*usuario digita as idades e o programa retorna a média*/
public class Exemplo05 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        double idade, acumulador = 0, contador = 0;
        
        System.out.println("Digite -1 a qualquer momento"
                + "para sair");
        
        for(int i = 0;;) {
            System.out.println("Digite um numero:");
            idade = tc.nextDouble();
            
            if (idade == -1.0) {
                break;
            } else if (idade <0 || idade > 120) {
                System.out.println("Vampiro nao conta");
            } else {
                acumulador += idade;
                contador++;
            }
            
            System.out.println("Acumulador = " + acumulador);
            System.out.println("Contador = " + contador);
        }
        
        System.out.println("Media = " + acumulador/contador);
        tc.close();
    }

}
