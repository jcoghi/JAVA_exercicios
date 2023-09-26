package listacondicional;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /* JOÃO É PESCADOR E TEM UM MICROCOMPUTADOR PARA CONTROLAR O SEU 
        RENDIMENTO DIÁRIO. TODA VEZ QUE ELE TRAZ UM PESO DE PEIXE MAIOR DO QUE 
        O PERMITIDO DE 50kg, ELE DEVE PAGAR R$ 4,00 POR QUILO.
        FAÇA UM PROGRAMA QUE CALCULA O VALOR DA MULTA PARA O JOÃO ASSIM QUE ELE
        INFORMAR O PESO DE PEIXE PESCADO NO DIA.
        */
        Scanner teclado = new Scanner(System.in);
        double peixes;
        final int multaPorQuilo = 4;
        
        System.out.println("Ola Joao, quantos quilos de peixe voce pescou hoje?");
        peixes = teclado.nextDouble();
        
        if (peixes > 50){
            peixes -= 50;
            peixes *= multaPorQuilo;
            System.out.printf("Voce tem que pagar %.2f reais \n", peixes);
        } else {
            System.out.println("Sem multa hoje.");
        }
        
        teclado.close();
    }
}
