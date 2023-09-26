/*
 * FAZER UM PROGRAMA, USANDO WHILE, QUE PRINTA NA 
 * TELA TODOS OS NÚMEROS PARES DE 1 A 100.
 */
package aula0404;

public class Exemplo01 {

    public static void main(String[] args) {
        
        int cont = 2;
        
        while (cont <= 100) {
            System.out.println(cont);
            cont += 2;
        }
        System.out.println("\n\n");
        cont = 1;
        while (cont <=100) {
            
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont++;
        }
    }
}
