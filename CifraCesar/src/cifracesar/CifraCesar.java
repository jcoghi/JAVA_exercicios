package cifracesar;

import java.util.Scanner;

public class CifraCesar {

    public static void main(String[] args) {

        StringBuilder mensagem = new StringBuilder();
        StringBuilder novaMensagem = new StringBuilder();
        Scanner tc = new Scanner(System.in);
        int chave = 3;
        String msg;

        System.out.println("Digite a mensagem para ser criptografada: ");
        msg = tc.nextLine().toLowerCase();

//Criando uma StringBuilder da mensagem para trabalhar com Array de caracteres
        for (int i = 0; i < msg.length(); i++) {
            mensagem.append(String.valueOf(msg.charAt(i)));
        }

// Reconhecimento da letra
        for (int letra = 0; letra < mensagem.length(); letra++) {
            if (mensagem.charAt(letra) == 32) {
                novaMensagem.append((char) (32));
            } else {
                int test = mensagem.charAt(letra) + chave;
                if (test > 122) {
                    System.out.println("Passou do Z");
                    test = test - 26;
                }
                novaMensagem.append((char) (test));
            }
        }
        System.out.println(novaMensagem);

        tc.close();

    }

}
