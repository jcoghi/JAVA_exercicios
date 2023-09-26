package testando;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] nomes = {"Ovelha", "Goblin", "Esqueleto"};
        Random nome = new Random();
        Guerreiro heroi = new Guerreiro();
        heroi.nome = "Joao";
        Monstro monstro = new Monstro();
        monstro.nome = nomes[nome.nextInt(0,nomes.length)];
        
        System.out.println(monstro.nome);
        
    }

}
