package aula0508.poo.exercicio;

public class Heroi extends Personagem{
    private int mana;
    
    public Heroi(String nome, int vida, int mana) {
        super(nome, vida);
        this.mana = mana;
    }
    
    public void cumprimentar() {
        super.cumprimentar();
        System.out.println("Sou o heroi deste mundo nefasto!");
    }
}
