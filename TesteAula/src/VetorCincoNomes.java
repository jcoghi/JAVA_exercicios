import java.util.Scanner;

/*
* Escreva um programa que leia um vetor de 5 nomes de pessoas e um nome de busca.
* O programa deve verificar se o nome de busca está no vetor e imprimir a posição
*  em que ele foi encontrado ou uma mensagem de que ele não foi encontrado.
*/
public class VetorCincoNomes {
    public static void main(String[] args) {
        String[] listaNomes = {"JOAO", "FELIPE", "FERNANDES", "COGHI"};
        Scanner tc = new Scanner(System.in);
        int cont = 0;

        for (String nome:listaNomes) {
            System.out.println("Busca nome: ");
            String entrada = tc.next();

            if (entrada.equalsIgnoreCase(nome)) {
                System.out.println("Encontrei");
            } else {
                cont++;
            }
        }
    }

}
