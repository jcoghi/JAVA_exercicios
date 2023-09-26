package jogoforca;

import java.util.Random;
import java.util.Scanner;

public class JogoForca {

    public static void main(String[] args) {
        // Criando o banco de dados das palavras
        String[] bancoPalavras = {"abacate", "urubu", "verde", "morango"};
        String palavra, digitada = "";
        String amostragem = "";
        char[] verificacao;
        char entrada;
        boolean jogando = true;
        int tentativa = 1;
        Scanner teclado = new Scanner(System.in);

        // Número aleatório para pegar palavra no banco
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(bancoPalavras.length);

        // Definição da palavra
        palavra = bancoPalavras[numero];
        verificacao = palavra.toCharArray();

        // Entrada do dado
        System.out.println("###### Bem-vinde ao jogo da forca ######");
        for (int i = 0; i < palavra.length(); i++) {
            amostragem = amostragem + "-";
        }
        char[] mostraTela = amostragem.toCharArray();
        System.out.println(mostraTela);

        while (jogando) {
            System.out.printf("Você ainda tem %d tentativas \n",
                    (palavra.length() - tentativa));
            System.out.print("Digite uma letra: ");
            entrada = teclado.next().charAt(0);
            System.out.println("\n");
            digitada = digitada + " " + Character.toString(entrada);
            System.out.println("Letras digitadas: " + digitada);

            for (int a = 0; a < palavra.length(); a++) {
                if (verificacao[a] == entrada) {
                    mostraTela[a] = entrada;
                    tentativa--;
                }
            }
            if (tentativa >=0 && tentativa == palavra.length()-1) {
                if (verificacao == mostraTela) {
                    System.out.println("Parabéns, você acertou a palavra: " + palavra);
                    jogando = false;
                } else {
                    System.out.println("Você não acertou. Tente novamente!");
                    jogando = false;
                    tentativa++;
                }

            } else {
                System.out.println(mostraTela);
                tentativa++;

            }
        }

    }
}

/*
Fazer um vetor de caracter receber a palavra para fazer a comparação -> OK
Popuplar um vetor de caracter com - -> OK
Substuir um - por uma letra assim que a letra for descoberta. -> OK

 */
