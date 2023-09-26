package aula0424.POO.Exercicio;

public class Calculadora {
    // Atributos
    private double num1;
    private double num2;
    
    // Método Construtor para as 4 operações básicas
    public Calculadora(double numero1, double numero2) {
        this.num1 = numero1;
        this.num2 = numero2;
    }
    
    // Método Construtor para o fatorial
    public Calculadora(int num) {
        this.num1 = num;
    }
    
    public double soma() {
        return Double.sum(this.num1, this.num2);
    }
    
    public double subtracao() {
        return this.num1 - this.num2;
    }
    
    public double multiplicacao() {
        return this.num1 * this.num2;
    }
    
    public double divisao() {
        if(this.num2 == 0.0) {
            return Double.MIN_VALUE;
        }
        return this.num1 / this.num2;
    }
    
    public int fatorial() {
        int fat = 1;
        
        for (int i = 0; i <= (int)this.num1; i++) {
            fat *= i;
        }
        
        return fat;
    }
}
