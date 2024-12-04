import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
//
//        System.out.print("Primeiro número: ");
//        int num1 = tc.nextInt();
//
//        System.out.print("Segundo número: ");
//        int num2 = tc.nextInt();
//
//        System.out.print("Terceiro número: ");
//        int num3 = tc.nextInt();
//
//        if(num1 < num2 && num1 < num3) {
//            if(num2 < num3) {
//                System.out.println("Números em ordem: " + num1 +" " + num2 +" " + num3);
//            } else {
//                System.out.println("Números em ordem: " + num1 +" " + num3 +" " + num2);
//            }
//        }
//
//        else if (num2 < num1 && num2 < num3) {
//            if (num1 < num3) {
//                System.out.println(num2 + " " + num1 + " " + num3);
//            } else {
//                System.out.println(num2 + " " + num3 + " " + num1);
//            }
//
//        }
//
//        else {
//            if (num1 < num2) {
//                System.out.println(num3 + " " +  num1 + " " +  num2);
//            } else {
//                System.out.println(num3 + " " +  num2 + " " +  num1);
//            }
//        }


/*
    ESCREVER OS 10 PRIMEIROS NÚMEROS DA SÉRIE DE FIBONACCI.
        1. COMEÇA COM ZERO;
        2. SEGUNDO ELEMENTO É O 1;
        3. OS OUTROS ELEMENTOS SÃO A SOMA DOS DOIS ANTERIORES
        4. PRINTAR NA TELA TODOS OS 10 NÚMEROS.
 */
//        int[] v = new int[10];
//        v[0] = 0;
//        v[1] = 1;
//
//        for(int i = 2; i < v.length; i++) {
//            v[i] = v[i-2] + v[i-1]; // v[2] = v[0] + v[1]
//        }
//        // Uma maneira de printar o vetor
//        System.out.print("Valores: ");
//        for (int valor: v) {
//            System.out.print(valor + " ");
//        }
//        // Outra maneira de printar o vetor
//        System.out.println("\nValores: " + Arrays.toString(v));



    /*
        USUÁRIO DIGITA QUANTOS VALORES TEREMOS DENTRO DO VETOR;
        O VETOR SERÁ POVOADO ALEATORIAMENTE COM NÚMEROS ENTRE 0 E 10;
        PROGRAMA RETORNA A SOMA DE TODOS OS ELEMENTOS
    */

        System.out.print("Qual o comprimento do vetor: ");
        int comprimento = tc.nextInt();

        int vetor[] = new int[comprimento];
        int soma = 0;

        for(int i = 0; i < comprimento; i++) {
            vetor[i] = (int)(Math.random() * 10);     // Math.random() * 10 -> 0 até 10 => double
            soma += vetor[i];
        }
        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.println("A soma: " + soma);









        tc.close();
    }
}