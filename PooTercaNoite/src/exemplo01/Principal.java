package exemplo01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Aluno joao = new Aluno("Joao");
        Aluno ana = new Aluno("Ana");
        
        System.out.println(joao.nome);
        joao.notaA1 = 30;
        System.out.println(joao.verNotaA1());
        
    }
}
