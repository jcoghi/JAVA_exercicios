package aula0505.poo.exercicio01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);      
        Personagem heroi;
        Personagem monstro = new Personagem("Goblin", 2);
        
        System.out.println("Bem-vinde aventureire");
        System.out.println("Escolha o nome do teu heroi");
        String nome = tc.next();
        heroi = new Personagem(nome, 20);
        
        System.out.println(heroi.nome + " estava andando pela floresta,"
                + " quando, de repente....");
        System.out.println(monstro.nome + " pulou de dentro de um "
                + "arbusto");
        System.out.println(heroi.nome + " se assusta e corre para "
                + "ataca-lo");
        int ataqueHeroi = heroi.atacar();
        System.out.println(heroi.nome + " atacou o "+monstro.nome+
                " com "+ataqueHeroi);
        System.out.println(monstro.nome+" ficou com " + 
                monstro.dano(ataqueHeroi) + " vida");
    }
}
