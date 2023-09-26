package aula0508.poo.exercicio;

public class Npc extends Personagem{
    private String profissao;
    
    public Npc(String nome, int vida,String profissao){
        super(nome, vida);
        this.profissao = profissao;
    }
    
    
}
