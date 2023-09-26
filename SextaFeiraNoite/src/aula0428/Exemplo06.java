package aula0428;

import java.util.Scanner;

public class Exemplo06 {

    public static void main(String[] args) {
        System.out.println("BEM-VINDO AO ADVINHA NUMERO");
        int numeroSecreto = (int)(Math.random()*20) + 1;
        jogar(numeroSecreto);
    }
    
    public static void jogar(int segredo) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int entrada = tc.nextInt();
        
        if (entrada > segredo) {
            System.out.println("Digitou um numero MAIOR");
            jogar(segredo);
        }  else if (entrada < segredo) {
            System.out.println("Digitou um numero MENOR");
            jogar(segredo);
        }else {
            System.out.println("Acertou Miseravi");
        }
    }

}
