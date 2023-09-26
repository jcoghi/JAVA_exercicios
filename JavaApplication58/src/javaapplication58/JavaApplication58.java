/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication58;

import java.util.Random;

/**
 *
 * @author joaof
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random(); // Instanciando um c do tipo Random que gera números aleatórios

		int numero0 = aleatorio.nextInt(2, 9); // Utilizando método do objeto para gerar números entre 2 a 8
		int numero1 = aleatorio.nextInt(2, 9);
		int numero2 = aleatorio.nextInt(2, 9);
		int numero3 = aleatorio.nextInt(2, 9);

		int[][] determinante = new int[][] { { numero0, numero1 }, { numero2, numero3 } };

		int j = 0; // Validar se o looping foi rodadado pelo menos uma única vez.
		String resultoEmString;
		String resultoEmString2;
		int mult = 0, mult2 = 0, mult3 = 0, mult4 = 0; // Variaveis utilizadas para realizar o calculo do determinante.

		for (int[] array : determinante) { // Para cada vetor, ele ira rodar um for da linha abaixo
			for (int i : array)
				if (j < 1) { // Validar se o looping foi rodado pelo menos uma única vez.

					resultoEmString = Integer.toString(i); // Transformado em String para fazer a matriz corretamente
					mult = i;
					resultoEmString2 = Integer.toString(i + 1); // Transformado em String para fazer a matriz
																// corretamente
					mult2 = i + 1;

					j++; // Incrementado para sair do looping após rodar mais de uma vez.
					System.out.println(resultoEmString + " " + resultoEmString2); // Utilizado variaiveis em String para
																					// demonstrar os valores na mesma
																					// linha

				} else if (j == 2) { // Validamos se a variável é igual a 2 e fazemos a segunda linha da matriz.
					resultoEmString = Integer.toString(i);
					mult3 = i;
					resultoEmString2 = Integer.toString(i + 1);
					mult4 = i + 1;

					System.out.println(resultoEmString + " " + resultoEmString2); // Utilizado variaiveis em String para
																					// demonstrar os valores na mesma
																					// linha
					break; // Foi feito a quebra para sair do looping.
				}
			j++;
		}
		int resultado = mult * mult4 - mult2 * mult3; // Utilizado variaveis mult para realizar o calculo do
														// determinante
		System.out.println("Seu determinante é " + resultado);
    }
    
}
