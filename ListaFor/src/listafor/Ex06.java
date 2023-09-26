package listafor;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /* Ler 10 números e imprimir quantos são pares e quantos são
        ímpares */
        Scanner teclado = new Scanner(System.in);
        int numero;
        int par = 0, impar = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numero: ");
            numero = teclado.nextInt();
            
            if (numero % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }
        System.out.printf("Temos %d pares e %d impares. \n",
                par, impar);
        
        teclado.close();
    }
    
}
