/* Se o número é PAR ou IMPAR e, também se é POSITIVO ou NEGATIVO
*/
package aula0313;
import java.util.Scanner;
public class Exemplo04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = tc.nextInt();

        if (numero % 2 == 0) { // PAR
            if (numero >= 0) {
                System.out.println("Par e Positivo");
            } else{
                System.out.println("Par e Negativo");
            }
 
        } else { // IMPAR
            if (numero >= 0){
                System.out.println("Impar e Positivo");
            } else {
                System.out.println("Impar e Negativo");
            }
        }
    }
}
