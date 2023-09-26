/*
 * Pescador -> limite de 50 kg/dia
 * passou o limite, deve pagar 4 reais por quilo
 */
package aula0324;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        /* Menor numero*/
        Scanner tc = new Scanner(System.in);
        
        double peso = tc.nextDouble();
        String multa;
        multa = (peso <= 50)?"Sem multa": "Multa de R$ " + (peso - 50)*4;
        
        System.out.println(multa);
        tc.close();
    }
}
