/*PESCADOR PODE PEGAR ATÉ 50 Kg DE PEIXE POR DIA. PASSADOS OS 50 Kg, DEVE
PAGAR R$4,00 POR QUILO DE MULTA.*/
package aula0324;

import java.util.Scanner;

public class ExemploParse {
    public static void main(String[] args) {
        
        Scanner tc  = new Scanner(System.in);
        double peso;
        String multa;
        
        System.out.println("Quantos quilos de peixe voce pegou hoje?");
        peso = tc.nextDouble();
 
        multa = (peso <= 50)? "Sem multa hoje": "Sua multa ficou em R$" + String.valueOf(((peso - 50) * 4));
        System.out.println(multa);
        
        tc.close();
    }   
}
