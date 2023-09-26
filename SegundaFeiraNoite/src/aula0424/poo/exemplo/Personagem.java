package aula0424.poo.exemplo;

public class Personagem {
// ATRIBUTOS
    private int vida;
    private String nome;
    
//MÉTODO CONSTRUTOR
    public Personagem(String nome, int vida) {
        this.nome = nome.toUpperCase();
        this.vida = vida;
    }
    
// MÉTODOS
public void cumprimentar() {
    System.out.println("Ola, eu sou o " + this.nome);
}   
// Colocando nova vida ao personagem
public void setVida(int vida) {
    this.vida = vida;
}
// Pegar valores da Vida
public int getVida() {
    return this.vida;
}
}
