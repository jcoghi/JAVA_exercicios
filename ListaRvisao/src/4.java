
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);

        int vetCPF[] = new int[11];

        System.out.println("Digite seu nome: ");
        String nome = entrada.next();

        for (int i = 0; i < vetCPF.length; i++) {
            System.out.println("Digite o " + (i + 1) + "o" + " digito do seu CPF: ");
            vetCPF[i] = entrada.nextInt();
        }

        int somaCPF = 0;

        for (int i = 0; i < vetCPF.length; i++) {
            somaCPF += vetCPF[i];
        }

        int divisao = vetCPF[2] / vetCPF[4];

        if (divisao == 0) {
            int restoDivisao = vetCPF[2] % vetCPF[4];
            String codigo = "" + nome.charAt(0) + nome.charAt(2);
            System.out.println("Bem vindo " + nome + " seu codigo e: " + codigo + somaCPF + " - " + restoDivisao);
        } else {
            int restoDivisao = vetCPF[2] % (1 + vetCPF[8]);
            String codigo = "" + nome.charAt(0) + nome.charAt(2);
            System.out.println("Bem vindo " + nome + " seu codigo e: " + codigo + somaCPF + " - " + restoDivisao);
        }

        entrada.close();
    }
}
