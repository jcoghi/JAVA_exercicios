
package aula0508.poo.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        Heroi bebeto = new Heroi("Joao", 10, 5);
        Npc ferreiro = new Npc("Ana",10,"Ferreiro");
        bebeto.cumprimentar();
        ferreiro.cumprimentar();
    }
}
