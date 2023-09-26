package aula0424.POO.Exemplo;

public class Personagem {
    // ATRIBUTOS
    private int vida; // Vida do personagem
    private String nome; // Nome do personagem
    private String funcao; // Função dele no jogo
    
    // MÉTODO CONSTRUTOR PADRÃO DO JAVA
    public Personagem() {
        
    }
    
    // NOVO MÉTODO CONSTUTOR -> Instanciar os objetos da maneira esperada.
    public Personagem(String nome, int vida){
        this.vida = vida;
        this.nome = nome;
    }
    
    // MÉTODOS
    public void cumprimentar() {
        System.out.println("Ola, meu nome eh " + this.nome);
    }
    
    public int atacar() {
        int ataque = (int)(Math.random()*5)+1; // int((0 - 1) * 5) + 1
        return ataque;
    }
    // GET -> Pegar os valores dos atributos
    public String getNome(){
        return this.nome;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    public String getFuncao() {
        return this.funcao;
    }
        
//    SET -> Atribuir os valores nos atributos.
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("O nome foi alterado para: " + this.nome);
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
        System.out.println("O personagem tem a funcao de " + this.funcao);
    }
    
    // Classe, Objeto, Atributo, Métodos, Método Construtor, Getters e Setters
    
}
