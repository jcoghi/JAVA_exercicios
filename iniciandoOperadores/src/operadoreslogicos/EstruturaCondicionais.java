package operadoreslogicos;

import java.util.Scanner;

public class EstruturaCondicionais {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /* CÁLCULO DA MÉDIA DE DUAS NOTAS */
//        System.out.println("Digite a primeira nota");
//        float n1 = teclado.nextFloat();
//        System.out.println("Digite a segunda nota");
//        float n2 = teclado.nextFloat();
//        float m = (n1 + n2) / 2;
//
//        System.out.println(m);
//        if (m > 9) {
//            System.out.println("Parabéns");
//        }

        /* VERIFICAÇÃO SE É MAIOR DE IDADE */
        int anoAtual = 2022;
        System.out.println("Digite seu ano de nascimento");
        int nascimento = teclado.nextInt();
        int idade = anoAtual - nascimento;
        if (idade > 18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }

        teclado.close();
    }
}
