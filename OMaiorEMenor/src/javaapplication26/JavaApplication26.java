/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author joaof
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, maior, menor;
        
        // Primeira entrada de número
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        
        // Ele é o maior e o menor, pois foi o primeiro
        maior = num;
        menor = num;
        
        // Agora começa a compara com as outras 4 iterações
        for (int i = 0; i < 4; i++){ // De 0 até 3
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        
        maior = num > maior ? num : maior;
        menor = num < menor ? num : menor;
        }
        
        // Aqui temos as saídas
        System.out.printf("\nO maior número digitado foi %d \n",maior);
        System.out.printf("O menor número digitado foi %d \n",menor);     
    } 
}
