package aula0519.poo.enums.lanchonete;

import java.util.Scanner;

public class Main {

    public enum Bebidas{
        REFRI("Guarana", 13.50),
        CERVEJA("Baden-Baden", 7.50),
        AGUA("Cristal", 2.50);
        
        private String nome;
        private double valor;
        
        Bebidas(String nome, double valor) {
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
    
    public enum Comidas {
        LANCHE("Hamburguer", 27.50),
        PF("Macarrão com queijo", 17.50),
        SOBREMESA("Pave de sonho de valsa", 25.0);
        
        private String nome;
        private double valor;
        
        Comidas(String nome, double valor) {
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
        
        Scanner tc = new Scanner(System.in);
        double total = 0;
        
        try {
        System.out.println("Pratos:"
                + "\n 1. " + Comidas.LANCHE.getNome() + " R$ " + Comidas.LANCHE.getValor()
                + "\n 2. " + Comidas.PF.getNome() + " R$ " + Comidas.PF.getValor()
                + "\n 3. " + Comidas.SOBREMESA.getNome() + " R$ " + Comidas.SOBREMESA.getValor()
        );
        int comida = tc.nextInt();
        
        switch(comida) {
            case 1 -> {total += Comidas.LANCHE.getValor();}
            case 2 -> {total += Comidas.PF.getValor();}
            case 3 -> {total += Comidas.SOBREMESA.getValor();}
            default -> {System.out.println("Opcao invalida");}
        }
        
        System.out.println("Bedidas:"
                + "\n 1. " + Bebidas.REFRI.getNome() + " R$ " + Bebidas.REFRI.getValor()
                + "\n 2. " + Bebidas.CERVEJA.getNome() + " R$ " + Bebidas.CERVEJA.getValor()
                + "\n 3. " + Bebidas.AGUA.getNome() + " R$ " + Bebidas.AGUA.getValor()
        );
        int bebida = tc.nextInt();
        
        switch(bebida) {
            case 1 -> {total += Bebidas.REFRI.getValor();}
            case 2 -> {total += Bebidas.CERVEJA.getValor();}
            case 3 -> {total += Bebidas.AGUA.getValor();}
            default -> {System.out.println("Opcao invalida");}
        }
        
            System.out.println("Total do pedido em R$ " + total);
        
        } catch(Exception e) {
            System.out.println(e);
        }

    }

}
