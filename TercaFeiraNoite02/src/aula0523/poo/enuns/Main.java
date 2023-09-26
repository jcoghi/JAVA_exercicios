package aula0523.poo.enuns;

public class Main {
    
    public enum Bebidas {
        CERVEJA("Baden-Baden Gold", 17.00),
        VODKA("Absolut", 65.00),
        AGUA("Cristal 510ml", 6.00),
        REFRI("Coca-Cola shot", 6.00); 
        
        private String nome;
        private double valor;

        private Bebidas(String nome, double valor) {
            this.nome = nome;
            this.valor = valor;
        }

        public String getNome() {
            return nome;
        }

        public double getValor() {
            return valor;
        }
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Cardapio de bebidas:");
        for(Bebidas bebida: Bebidas.values()) {
            System.out.print(bebida.getNome() + " R$");
            System.out.println(bebida.getValor());
        }
    }
}
