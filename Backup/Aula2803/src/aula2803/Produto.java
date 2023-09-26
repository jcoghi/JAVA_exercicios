package aula2803;


public class Produto {

    private String marca; 
    private double preco;
    private double peso;

    public Produto(String marca, double preco, double peso) {
        this.marca = marca;
        this.preco = preco;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
   
    
}
