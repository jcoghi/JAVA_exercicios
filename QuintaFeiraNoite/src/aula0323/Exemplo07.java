package aula0323;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        double limite = 50, taxa = 4.0, peso, multa;
        
        System.out.println("Quilos de peixe?");
        peso = tc.nextDouble();
        
        multa = (peso>limite)?(peso-limite)*taxa:0;
        System.out.printf("A multa foi de R$%.2f \n", multa);
    }
}
