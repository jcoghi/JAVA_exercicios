
package aula0424.POO.Exemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Bem-vindo, caro(a) aventureiro(a)");
        System.out.println("Digite o nome do teu heroi:");
        String nome = tc.next();
        
        Personagem heroi = new Personagem(nome, 20);
        
        System.out.println("Renomeie teu personagem:");
        nome = tc.next();
        heroi.setNome(nome);
        
        heroi.cumprimentar();
        int ataque = heroi.atacar();
        System.out.println(heroi.getNome() + " atacou com " + ataque);

    }
}
