package escola;

public abstract class Pessoa {
    
    protected String nome;
    protected String cpf;
    protected String sexo;
    protected int idade;

    public Pessoa (String nome){
        this.nome = nome;
    }
    
    public int fazerAniversario() {
        return this.idade++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
