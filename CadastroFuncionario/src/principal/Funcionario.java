package principal;

public class Funcionario {
    
    private int matricula;
    private String nome;
    private Departamento dep;
    
    public Funcionario() {
        
    }
    
    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDep() {
        return dep;
    }

    public void setDep(Departamento dep) {
        this.dep = dep;
    }
    
    
    
    
}
