package aula0519.poo.cadastro.funcionarios;

import aula0519.poo.cadastro.pessoas.Pessoas;

public class Funcionarios extends Pessoas{
    
    private String cargo;
    private int matricula;
    private double salario;
    
    public Funcionarios(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }
    
}
