/*
  Insere número real com . ou , e printa na tela número real com ,
*/
package listaoperadores;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        String entrada = teclado.next();
        
        entrada = entrada.replace(",", ".");
        
        float numero =2 * Float.parseFloat(entrada);
        
        
        System.out.println(numero);
        teclado.close();
    }
}
