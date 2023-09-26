/*EASY
 Vocês devem criar um novo projeto com as Classes: Principal e Calculadora
 A classe Principal executará o programa
 A classe Calculadora conterá:
     - Atributos: num1 e num2 -> Acesso por Construtor
     - Métodos: Soma, Subtração, Multiplicação, Divisão e Fatorial

HARD -> GETTERS e SETTERS
O programa deverá retornar ao usuário a conta Por Exemplo:
Numero 1: 10
Numero 2: 20
Opercao: Soma
Retorno: 10 + 20 = 30
*/
package aula0424.POO.Exercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        try{
            Calculadora calc;
            Scanner tc = new Scanner(System.in);
            System.out.println("""
                               ***** CALCULADORA *****
                                + para Soma
                                - para Subtracao
                                * para Multiplicacao
                                / para Divisao
                                ! para Fatorial
                               Escolha uma opercao:
                               """);
            char operacao = tc.next().charAt(0);
            
            switch(operacao) {
                case '+' ->{
                    
                }
                case '-' ->{
                    
                }
                case '*' -> {
                    
                }
                case '/' -> {
                    
                }
                case '!' -> {
                    
                }
                default -> System.out.println("Opcao invalida");
            }
            
        }catch(Exception e){
            System.out.println("Você digitou a opcao errada");
        }
    }
    
}
