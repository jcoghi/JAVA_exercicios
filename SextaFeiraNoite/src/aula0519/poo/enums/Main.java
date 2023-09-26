package aula0519.poo.enums;

import java.util.Scanner;

public class Main {
    
    public enum Bebidas {
        SUCO("Suco de Laranja", 7.00),
        REFRI("Guarana", 2.00),
        CERVEJA("Baden-Baden Gold", 17.00),
        AGUA("Cristal", 5.00);
        
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
    
    public enum Comidas{
        ENTRADA("Isca de frango", 20.00),
        PF("Espetinhos MiMi", 13.00),
        SOBREMESA("Queijo com goiabada", 7.00);
        
        private String nome;
        private double valor;

        private Comidas(String nome, double valor) {
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
        
        try{
        Scanner tc = new Scanner(System.in);
        double total = 0;
        
        System.out.println("CARDAPIO - COMIDAS"
        + "\n1. " + Comidas.ENTRADA.getNome() + " R$" + Comidas.ENTRADA.getValor()
        + "\n2. " + Comidas.PF.getNome() + " R$" + Comidas.PF.getValor()
        + "\n3. " + Comidas.SOBREMESA.getNome() + " R$" + Comidas.SOBREMESA.getValor()
        );
        int comidas = tc.nextInt();
        
        switch(comidas) {
            case 1 -> total += Comidas.ENTRADA.getValor();
            case 2 -> total += Comidas.PF.getValor();
            case 3 -> total += Comidas.SOBREMESA.getValor();
            default -> System.out.println("Selecao invalida");
        }
        
        System.out.println("CARDAPIO - BEBIDAS"
        + "\n1. " + Bebidas.SUCO.getNome() + " R$" + Bebidas.SUCO.getValor()
        + "\n2. " + Bebidas.REFRI.getNome() + " R$" + Bebidas.REFRI.getValor()
        + "\n3. " + Bebidas.CERVEJA.getNome() + " R$" + Bebidas.CERVEJA.getValor()
        + "\n4. " + Bebidas.AGUA.getNome() + " R$" + Bebidas.AGUA.getValor()
        );
        
        int bebidas = tc.nextInt();
        
        switch(bebidas) {
            case 1 -> total += Bebidas.SUCO.getValor();
            case 2 -> total += Bebidas.REFRI.getValor();
            case 3 -> total += Bebidas.CERVEJA.getValor();
            case 4 -> total += Bebidas.AGUA.getValor();
            default -> System.out.println("Selecao invalida");
        }
            System.out.println("Total do pedido = " + total);
        
        }catch(Exception e) {
            System.out.println("Ocorreu um erro");
        }
    }
}
