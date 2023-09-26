package aula1909;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMedia {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int n;
        System.out.print("Quantas notas vai inserir: ");
        n = tc.nextInt();
        double media = 0;
        double[] notas = new double[n];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i+1) +": ");
            notas[i] = tc.nextDouble();
            media += notas[i];
        }
        media = (double) (media / notas.length);
        System.out.printf("%.2f\n",media);
        tc.close();
    }
}
