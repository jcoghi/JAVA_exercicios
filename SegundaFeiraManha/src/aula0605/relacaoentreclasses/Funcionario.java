package aula0605.relacaoentreclasses;

import java.util.ArrayList;

public class Funcionario {
    
    private String nome;
    private int matricula;
    ArrayList<Setor> setores = new ArrayList<>();
    
    public Funcionario(String nome) {
        this.nome = nome;
        this.matricula = (int)(Math.random() * 1000)+1;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void addSetor(Setor setor) {
        this.setores.add(setor);
    }
    
}
