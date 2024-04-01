package testeconexaobd;

class Aluno {
    private int id;
    private String nome;

    public Aluno(int codigo, String nome) {
        this.id = codigo;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
}
