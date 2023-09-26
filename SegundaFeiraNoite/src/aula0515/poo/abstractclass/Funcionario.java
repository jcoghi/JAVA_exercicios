package aula0515.poo.abstractclass;

public class Funcionario extends Pessoa{
    
    private String cargo;
    private double salario;
    private int matricula;

    public Funcionario(String cargo, double salario, 
            int matricula, String nome, int idade) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String info = "Nome:" + super.getNome()
                      +"\nIdade:" + super.getIdade()
                      +"\nCargo: " + this.cargo
                      +"\nMatricula: " + this.matricula
                      +"\nSalario: " + this.salario;
        return info;
    }
   
    
    
}
