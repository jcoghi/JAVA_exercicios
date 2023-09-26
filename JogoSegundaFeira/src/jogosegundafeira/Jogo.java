package jogosegundafeira;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        String nomePersonagem;
        String classePersonagem;
        boolean jogando = true;
        boolean vivo = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Criando personagem");

// Nome para criação do personagem        
        System.out.print("Nome: ");
        nomePersonagem = teclado.nextLine();
        Personagem personagem = new Personagem(nomePersonagem);

// Escolha da classe
        
        System.out.println("Escolha entre cacador, comilao e soneca");
        System.out.print("Classe: ");
        classePersonagem = teclado.nextLine().toLowerCase();

        while (jogando) {
            switch (classePersonagem) {
                case "cacador":
                    personagem.setClasse(10, 0, 0);
                    jogando = false;
                    break;
                case "comilao":
                    personagem.setClasse(6, 8, 3);
                    jogando = false;
                    break;
                case "soneca":
                    personagem.setClasse(2, 5, 8);
                    jogando = false;
                    break;
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }
        }

// Iniciando o jogo             
        while (vivo) {
            System.out.println("""
                               Selcione:
                               1 - cacar;
                               2 - comer;
                               3 - dormir;
                               4 - status do personagem;
                               5 - Sair
                               """);
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    personagem.cacar();
                    System.out.println(teclado.nextLine());
                    break;
                case 2:
                    vivo = personagem.comer();
                    System.out.println(teclado.nextLine());
                    break;
                case 3:
                    personagem.dormir();
                    System.out.println(teclado.nextLine());
                    break;
                case 4:
                    personagem.status();
                    System.out.println(teclado.nextLine());
                    break;
                case 5:
                    vivo = false;
                    System.out.println(personagem.nome + " morreu.");
                    System.out.println(teclado.nextLine());
                    break;
                default:
                    System.out.println("Opcao invalida");
                    System.out.println(teclado.nextLine());
                    break;
            }
        }

        teclado.close();
    }

}
