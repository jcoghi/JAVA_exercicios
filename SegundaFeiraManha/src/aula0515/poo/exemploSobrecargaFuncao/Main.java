/*
O polimorfismo em Java é uma técnica de POO que permite que os objetos de
diferentes classes se comportem de maneira similar. 

Em Java, o polimorfismo pode ser alcançado por meio da sobrecarga de métodos
e da sobreescrita de métodos. 

A sobrecarga de métodos é quando uma classe tem vários métodos com o mesmo
nome, mas com diferentes parâmetros. 

A sobreescrita de métodos é quando uma subclasse fornece sua própria 
implementação de um método que já está definido em sua classe base.
 */
package aula0515.poo.exemploSobrecargaFuncao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("""
Selecione a figura geometrica:
    1 - Quadrado
    2 - Retangulo
    3 - Trapezio
Selecione uma opcao para calcular a area:
        """);
        try {
            int opcao = tc.nextInt();
            switch(opcao) {
                case 1 -> {
                    System.out.println("Digite o lado do quadrado");
                    double lado = tc.nextDouble();
                    System.out.println("Area do quadrado = " + area(lado));
                }
                
                case 2 -> {
                    String []informacao = {"Base", "Altura"};
                    double []ent = new double[2];
                    
                    for (int i = 0; i < ent.length; i++) {
                        System.out.println("Informe a " + informacao[i]);
                        ent[i] = tc.nextDouble();
                    }
                    System.out.println("Area do retangulo = " + area(ent[0], ent[1]));
                }
                
                case 3 -> {
                    String []informacao = {"Base Maior", "Base Menor", "Altura"};
                    double []ent = new double[3];
                    
                    for (int i = 0; i < ent.length; i++) {
                        System.out.println("Informe a " + informacao[i]);
                        ent[i] = tc.nextDouble(); 
                    }
                    System.out.println("Area do trapezio = " + area(ent[0], ent[1], ent[2]));
                }
                
                default -> {
                    System.out.println("Selecione uma opcao valida");
                }
            }
            
        } catch (Exception e) {
            System.out.println("Nao entendi, pode repetir?");
        }
        
    }
    
    public static double area(double lado) {
        return Math.pow(lado, 2);
    }
    
    public static double area(double base, double altura) {
        return base * altura;
    }
    
    public static double area(double bMaior, double bMenor, double altura) {
        return (bMaior + bMenor) / 2 * altura;
    }
    
}
