package aula0519.poo.cadastro.pessoas;

public class Pessoas {
    
    private String nome;
    private int idade;
    
    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
}
