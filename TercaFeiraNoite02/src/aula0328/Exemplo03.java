/*
 * Fazer um programa para encontrar todos 
 * os números pares entre 1 e 100.
 */
package aula0328;

public class Exemplo03 {

    public static void main(String[] args) {
        int i;
        for (i = 2;; i += 2) {
            if (i == 1000) {
                break;
            } else {
                System.out.println("i = " + i);
            }
        }

        //System.out.println("i fora do primeiro for " + i);
//        for (i = 1; i <= 6; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        } 
    }
}
