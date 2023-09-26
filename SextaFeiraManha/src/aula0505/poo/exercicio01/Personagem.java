/*
Criar 3 classes filhas de Personagem: 

   
Monstros  -> Atributos: Mana e Força
Npcs:
 - String profissao;
*/
package aula0505.poo.exercicio01;

import java.util.Random;

public class Personagem {
    // Atributos
    String nome;
    int vida;
    int defesa = 2;
    boolean atacavel = false;
    
    // Métodos
    // Construtor
    public Personagem(String nome, int vida, boolean acatavel){
        this.nome = nome;
        this.vida = vida;
        this.atacavel = atacavel;
    }
    
    public int ataque() {
        Random gerador = new Random();
        return gerador.nextInt(6) + 1;// 1 -> 6
    }
    
    public void dano(int ataque) {
        if (ataque > this.defesa) {
            int dano = ataque - this.defesa;
            this.vida -= dano;
            if (this.vida < 0) {
                this.vida = 0;
            }
        }
    }
}
