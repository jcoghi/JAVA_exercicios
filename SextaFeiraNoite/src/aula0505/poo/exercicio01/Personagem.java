package aula0505.poo.exercicio01;

public class Personagem {
    
    int vida = 1;
    String nome;
    int defesa = 2;
    
    public Personagem(String nome){
        this.nome = nome;
    }
    
    public Personagem(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }
    
    public Personagem(String nome, int vida, int defesa){
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
    }
    
    public int atacar() {
        return (int)(Math.random() * 6) + 1;
    }
    
    public int dano(int ataque) {
        if( ataque > defesa){
            int dano = ataque - defesa;
            vida -= dano;
        if (vida <= 0) {
            vida = 0;
        }
        }
        return vida;
    }
}
