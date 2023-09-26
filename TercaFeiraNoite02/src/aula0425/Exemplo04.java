package aula0425;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int []numerosDigitados = entrada();
        System.out.println("""
                           **** Operacoes: ****
                              + para Soma;
                              - para Subtracao;
                              * para Multiplicacao;
                              / para Divisao;
                           Selecione a operação:""");
        char opcao = tc.next().strip().charAt(0);
        
        switch(opcao){
                case'+'-> System.out.println("soma = " + 
                        soma(numerosDigitados[0],numerosDigitados[1]));
                case '-' -> System.out.println("Subtracao = "+
                        subtracao(numerosDigitados[0],numerosDigitados[1]));
                case '*' -> System.out.println("Multiplicacao = " +
                        multiplicacao(numerosDigitados[0],numerosDigitados[1]));
                case '/' -> divisao(numerosDigitados[0],numerosDigitados[1]);
                default -> System.out.println("Opcao errada.");
        }
    }

    public static int soma(int num1, int num2) {
        return Integer.sum(num1, num2);
    }
    
    public static int subtracao(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }
    
    public static void divisao(int num1, int num2) {
        try{
            double div = (double)num1 / num2; 
            System.out.println("Divisao = " + div);
        } catch(Exception e) {
            System.out.println("Nao dividiras por zero");
        }
    }
    
    public static int[] entrada(){
        Scanner tc = new Scanner(System.in);
        int []vetor = new int[2];
        try {
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite um numero:");
                vetor[i] = tc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Errou a digitacao");
        } finally{
            return vetor;
        }
    }
    
    
}
