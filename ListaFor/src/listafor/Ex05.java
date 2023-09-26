package listafor;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        int contador = 1;
        int acumulador = 0;
        float media = 0f;
        String novaNota;
        for (int i = 0 ;;) {
            System.out.print("Digite uma nota: ");
            nota = teclado.nextInt();
            acumulador += nota;
            contador++;
            
            System.out.println("Deseja inserir nova nota? [S/N]");
            novaNota = teclado.next().toUpperCase().trim();
            
            if (novaNota.equals("N") || novaNota.equals("N"))
                break;
        }
        media = (float)acumulador / (float)contador;
        System.out.println("A media das notas: " + media);
    }
}
