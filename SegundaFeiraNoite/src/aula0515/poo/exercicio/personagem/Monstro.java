package aula0515.poo.exercicio.personagem;

import java.util.Random;

public class Monstro {
    
    String[] nomes = {"Slime", "Esqueleto", "Zumbie"};
    Random gerador = new Random();
    String nome;
    int hp;
    int atk;
    
    public Monstro() {
        int num = gerador.nextInt(nomes.length);
        this.nome = nomes[num];
        if(nome.equals("Slime")) {
            this.hp = 2;
            this.atk = 1;
        } else if (nome.equals("Esqueleto")) {
            this.hp = 5;
            this.atk = 3;
        } else {
            this.hp = 3;
            this.atk = 2;
        }
    }
    
    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("Ataque: " + atk);
    }
}
