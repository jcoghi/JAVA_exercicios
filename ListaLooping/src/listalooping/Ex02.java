package listalooping;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        /* FAÇA UM PROGRAMA QUE LEIA UM NOME DE USUÁRIO E A SUA SENHA E 
        NÃO ACEITE A SENHA IGUAL AO NOME DO USUÁRIO, MOSTRANDO UMA MENSAGEM 
        DE ERRO E VOLTANDO A PEDIR AS INFORMAÇÕES */

// Declaração das variáveis        
        Scanner teclado = new Scanner(System.in);
        String nome, senha;
        boolean continuar = false;

        do {
            for (int tentativa = 3; tentativa >= 0; --tentativa) {
                System.out.print("username: ");
                nome = teclado.nextLine().trim();
                System.out.print("senha: ");
                senha = teclado.nextLine().trim();
                if (tentativa != 0) {
                    System.out.printf("Voce tem mais %d\n", tentativa);
                } else {
                    System.out.println("Acesso bloqueado");
                }

                if (nome.equals(senha)) {
                    System.out.println("Usuario e senha devem ser diferentes");

                    continuar = true;
                } else {
                    System.out.println("Login efetuado com sucesso");
                    continuar = false;
                }
                continuar = false;
            }
        } while (continuar);

        teclado.close();
    }
}
