package javaapplication39;

public class Alimento {
    public double preco;
    public int quantidade;
    public String nome;
    public double preco_final;
        
    Alimento(String nome_produto,double p, int quant){
        preco=p;
        nome=nome_produto;
        quantidade=quant;
        System.out.println("Construtor feito");
    }
    public void desconto(){
        this.preco_final=this.preco-this.preco*0.1;
        System.out.println("Preço com desconto: "+this.preco_final);
    }
    
}
