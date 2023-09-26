package aula0502.poo.exemplo2;

public class Personagem {
//    Atributos -> características dos personagens
    private String nome;
    private int vida = 1;
    private int defesa = 2;
    
//    MÉTODO CONSTRUTOR
    public Personagem(String nome){ // NPC
    // O getNome desta classe recebe o getNome do construtor
        this.nome = nome; 
    }
    
    public Personagem(String nome, int vida){
       // O getNome desta classe recebe o getNome do construtor
        this.nome = nome;
        // A vida desta classe recebe a vida do construtor
        this.vida = vida;
    }
    
    public Personagem(String nome, int vida, int defesa){
        // O getNome desta classe recebe o getNome do construtor
        this.nome = nome;
        // A vida desta classe recebe a vida do construtor
        this.vida = vida;
        // A defesa desta classe recebe a defesa do construtor
        this.defesa = defesa;
    }
    
//    Métodos -> comportamento dos personagens
    public int ataque() {
        return (int)(Math.random() * 5) + 1;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getVida() {
        return vida;
    }
    
    public int getDefesa() {
        return defesa;
    }
    
    public void setVida(int novaVida) {
        this.vida = novaVida;
    }
    
}
