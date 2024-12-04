public class Usuario {
    String nome;
    String email;
    public boolean equals(Object objeto) {

        Usuario outro = (Usuario) objeto;

        boolean nome = outro.nome.equals(this.nome);
        boolean email = outro.email.equals(this.email);

        return nome && email;
    }
}
