
package com.mycompany.mavenproject2;


public class Mavenproject2 {

    public static void main(String[] args) {
        int vet[] = { 2, 3, 4, 5, 6, 7, 8, 1 };

        int m1[][] = new int[2][2];

        int m2[][] = new int[2][2];

        System.out.println("Matriz 1");
        System.out.println("---");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                for (int i = 0; i < 4; i++) {
                    m1[0][0] = vet[0];
                    m1[0][1] = vet[1];
                    m1[1][0] = vet[2];
                    m1[1][1] = vet[3];
                }
                System.out.println("Linha: " + (linha + 1) +
                        " Coluna: " + (coluna + 1) + ": "
                        + m1[linha][coluna]);
            }
        }
        System.out.println("---");
        System.out.println("---");

        System.out.println("Matriz 2");
        System.out.println("---");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                for (int i = 0; i < 4; i++) {
                    m2[0][0] = vet[4];
                    m2[0][1] = vet[5];
                    m2[1][0] = vet[6];
                    m2[1][1] = vet[7];
                }
                System.out.println("Linha: " + (linha + 1) +
                        " Coluna: " + (coluna + 1) + ": "
                        + m2[linha][coluna]);
            }
        }

        System.out.println("---");
        System.out.println("---");

        int resultado1, resultado2;

        resultado1 = (m1[0][0] * m1[1][1]) - (m1[1][0] * m1[0][1]);
        resultado2 = (m2[0][0] * m2[1][1]) - (m2[1][0] * m2[0][1]);

        System.out.println("Determinante: " + (resultado1 + resultado2));
    
    
    }
}
