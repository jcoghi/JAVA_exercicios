package poo.calculadora;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(int numero1) {
        this.num1 = numero1;
    }
    public Calculadora(double numero1, double numero2) {
        this.num1 = numero1;
        this.num2 = numero2;
    }


    public double soma() {
        return this.num1 + this.num2;
    }

    public double subtracao() {
        return this.num1 - this.num2;
    }

    public double multiplicacao() {
        return this.num1 * this.num2;
    }

    public double divisao() {
        if (this.num2 == 0) {
            return Double.MIN_VALUE;
        }
        return this.num1 / this.num2;
    }

    public int fatorial() {
        int fatorial = 1;
        for (int i = 1; i <= (int)this.num1; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
