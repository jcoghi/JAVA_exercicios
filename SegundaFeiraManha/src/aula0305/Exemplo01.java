/*
* PROGRAMA DE INSERÇÃO E SAÍDA DE DADOS.
*/
package aula0305;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args){
// DEFINIÇÃO DAS VARIÁVEIS
        Scanner teclado = new Scanner(System.in); // FAZ A CRIAÇÃO DE UM TECLADO
        String nome; // VARIÁVEL TIPO TEXTO
// ATRIBUIÇÃO DE VALORES    
        System.out.print("Digite seu nome: "); // INSTRUÇÃO PARA O USUÁRIO
        nome = teclado.next(); // LIBERAÇÃO DE UM CAMPO DE DIGITAÇÃO DE TEXTO

        System.out.println(nome);// IMPRESSÃO DO TEXTO NA TELA DO COMPUTADOR
    }
}