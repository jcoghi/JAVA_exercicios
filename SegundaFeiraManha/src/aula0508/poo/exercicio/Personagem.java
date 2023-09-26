package aula0508.poo.exercicio;

public class Personagem {
    // ATRIBUTOS
    private int vida; // Vida do personagem
    private String nome; // Nome do personagem
    private boolean atacavel = false;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }
    
    // MÉTODOS
    public void cumprimentar() {
        System.out.println("Ola, meu nome eh " + this.nome);
    }
    
    public int atacar() {
        int ataque = (int)(Math.random()*5)+1; // int((0 - 1) * 5) + 1
        return ataque;
    }
    // GET -> Pegar os valores dos atributos
    public String getNome(){
        return this.nome;
    }
    
    public int getVida() {
        return this.vida;
    }

        
//    SET -> Atribuir os valores nos atributos.
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("O nome foi alterado para: " + this.nome);
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isAtacavel() {
        return atacavel;
    }
   
}
