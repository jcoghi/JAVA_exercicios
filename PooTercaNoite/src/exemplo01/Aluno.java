package exemplo01;

public class Aluno {
    // ATRIBUTOS
    String nome;
    int RA;
    double notaA1;
    double notaA2;
    double notaA3;
    double media;
    boolean aprovado;
    
    // CONSTRUTOR
    public Aluno(String nome) {
        this.nome = nome;
        this.aprovado = false;
    }
    
    // MÉTODOS
    String estudar(){
        return "Estou estudando";
    }
    void responderProfessor() {
        // void não tem retorno
    }
    
    void aprovacao(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    double verNotaA1() {
        return this.notaA1;
    }
    
}
