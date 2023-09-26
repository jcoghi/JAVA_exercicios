package aula0515.poo.exemploCadastroFuncionario;

public class Funcionarios extends Pessoas{
    
    private float salario;
    private int matricula;
    private String cargo;

    public Funcionarios(float salario, int matricula, String cargo, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.salario = salario;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
}
