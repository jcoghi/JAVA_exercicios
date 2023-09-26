package aula0428;

import java.util.Scanner;

public class Exemplo07 {

    public static void main(String[] args) {
        calculadora();
    }
    
    public static void calculadora() {
        double[] numeros = entrada();
        char operacao = tela();
        switch(operacao) {
            case '+' -> soma(numeros[0], numeros[1]);
            case '-' -> subtrai(numeros[0], numeros[1]);
            case '*' -> multiplica(numeros[0], numeros[1]);
            case '/' -> divisao(numeros[0], numeros[1]);
            default -> System.out.println("Opcao invalida");
        }
        
    }
    
    public static void soma(double num1, double  num2){
        System.out.println("Soma = " + Double.sum(num1, num2));
    }
    
    public static void subtrai(double num1, double  num2){
        System.out.println("Subtracao = " + (num1 - num2));
    }
    
    public static void multiplica(double num1, double  num2){
        System.out.println("Multiplicacao = " + (num1 * num2));
    }
    
    public static void divisao(double num1, double  num2){
        if (num2 == 0) {
            System.out.println("Nao pode dividir por zero");
        } else {
            System.out.println("Divisao = " + (num1 / num2));
        }
    }
    
    public static double[] entrada() {
        Scanner tc = new Scanner(System.in);
        double input[] = new double[2];
        
        for(int i = 0; i < input.length; i++) {
            System.out.println("Digite um numero");
            input[i] = tc.nextDouble();
        }
        //tc.close();
        return input;
    }
    
    public static char tela() {
        Scanner tc = new Scanner(System.in);
        try{
            System.out.println("""
                           **** Calculadora ****
                              + para soma
                              - para subtracao
                              * para multiplicacao
                              / para divisao
                           Escolha uma operacao:""");
        char operacao = tc.next().charAt(0);
        return operacao;
        }catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
            e.printStackTrace();
            return 'E';
        }
    }
}
