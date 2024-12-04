import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        var tc = new Scanner(System.in);
        System.out.println("Informe quantas idades:");
        int n = tc.nextInt();

        int[] idades = new int[n];
        int acumulador = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite sua idade");
            idades[i] = tc.nextInt();
            acumulador += idades[i];
        }

        System.out.println("Média = " + (acumulador/idades.length));

        int  aux;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1;  j < n; j++) {
                if(idades[j] < idades[i]) {
                    aux = idades[j];
                    idades[j] = idades[i];
                    idades[i] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(idades));

        if (n %2 == 0) {
            n = n/2;
            System.out.println("Mediana = " + (idades[n-1] + idades[n]) / 2);
        } else {
            n = n/2;
            System.out.println("Mediana = " + idades[n]);
        }

    }
}