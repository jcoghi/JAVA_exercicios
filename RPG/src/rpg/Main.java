package rpg;

import rpg.heroi.Heroi;
import rpg.vilao.Vilao;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vilao vilao = new Vilao();
        String nomeVilao = vilao.setNome();
        Heroi heroi = new Heroi();
        Scanner tc = new Scanner(System.in);
        boolean looping = true;

        while (looping) {
            System.out.println("Escolha um nome para o heroi");
            String nome = tc.nextLine();

            if (nome.isBlank() || nome.isEmpty()) {
                System.out.println("Voce deve informar um nome.");
            } else {
                heroi.setNome(nome);
                looping = false;
            }
        }

        while (!looping) {
            System.out.println("""
                               Selecione:
                               1 - Elfo Assassino - 1 ataque sem contra ataque.
                               2 - Humano Espadachin - 2 ataques de espada.
                               3 - Anao com martelo - 1 ataque, mas muito dano.
                               """);
            String classeHeroi = tc.next();
            switch (classeHeroi) {
                case "1":
                    heroi.setAtributos(12, 10, 100);
                    looping = true;
                    break;
                case "2":
                    heroi.setAtributos(12, 12, 70);
                    looping = true;
                    break;
                case "3":
                    heroi.setAtributos(20, 20, 50);
                    looping = true;
                    break;
                default:
                    System.out.println("Escolha uma classe valida");
                    break;
            }
        }

        System.out.println(nomeVilao + " apareceu na tua frente");

        while (looping) {
            System.out.println("""
                               Selecione:
                                1 - Atacar
                                2 - Defender
                                3 - Fugir
                                4 - Sair do jogo
                               """);
            System.out.print("O que voce pretende fazer: ");
            String opcao = tc.next();

            switch (opcao) {
                case "1":
                    heroi.dado(heroi.getAtaque());
                    break;
                case "2":
                    heroi.dado(heroi.getDefesa());
                    break;
                case "3":
                    if (heroi.fuga()) {
                        System.out.println(heroi.getNome() + " fugiu com sucesso.");
                    } else {
                        System.out.println(heroi.getNome() + "fracassou na fuga");
                        heroi.dano(vilao.getDado());
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Selecione uma opcao valida");
                    break;
            }

        }

        tc.close();
    }

}
