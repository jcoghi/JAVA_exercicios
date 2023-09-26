package aula1909;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int alunos = tc.nextInt();
        System.out.println("Quantidade de notas? ");
        int qtdNotas = tc.nextInt();
        
        int[][] notas = new int[alunos][qtdNotas];
        
        for (int aluno = 0; aluno <alunos; aluno++) {
            for (int nota = 0; nota < qtdNotas; nota++) {
                System.out.print("Insira a nota: ");
                notas[aluno][nota] = tc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(notas));
        tc.close();
        
    }
}
