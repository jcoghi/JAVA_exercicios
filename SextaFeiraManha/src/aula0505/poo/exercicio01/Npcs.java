package aula0505.poo.exercicio01;

public class Npcs extends Personagem{

//  ATRIBUTO
    private String profissao;
    
    
    public Npcs(String nome, int vida, boolean acatavel) {
        super(nome, vida, acatavel);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
}
