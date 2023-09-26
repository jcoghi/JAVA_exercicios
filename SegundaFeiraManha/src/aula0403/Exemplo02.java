/* Usuário entra com notas e o programa calcula a média
 * O usuário decide quando terminou de inputar as notas.
 */
package aula0403;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        
        var teclado  = new Scanner(System.in);
        boolean online = true;
        int cont = 0;
        double total = 0;
        
        while(online) {
            System.out.println("Digite sua nota:");
            double nota = teclado.nextDouble();
            
            if (nota <= 10 && nota >= 0) {
                total += nota;
                cont++;
            } else{
                System.out.println("Nota invalida");
            }
            
            System.out.println("Deseja continuar?[S]/[N]");
            char continuar = teclado.next().toUpperCase().charAt(0);
            
            if (continuar == 'N') {
                System.out.printf("Media = %.2f", (total/cont));
                online = false;
            }
        }
    }

}
