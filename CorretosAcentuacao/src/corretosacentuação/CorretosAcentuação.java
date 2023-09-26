package corretosacentuação;

import java.util.Scanner;

public class CorretosAcentuação {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insire o texto a ser corrigido: ");
        String palavra = teclado.nextLine();
        int i = 0;

        while (i < palavra.length()) {
            for (i = 1; i < palavra.length(); i++) {
                if (palavra.charAt(i) == 'b' || palavra.charAt(i) == 'p') {
                    if (palavra.charAt(i - 1) != 'm' &&
                            palavra.charAt(i-1) != ' ') {
                        palavra = palavra.replaceFirst(Character.
                                toString(palavra.charAt(i - 1)), "m");
                    }
                } else if (palavra.charAt(i) == ' ') {
                    if (palavra.charAt(i-1) == 'n'){
                    palavra = palavra.replaceFirst(Character.
                            toString(palavra.charAt(i-1)), "m");
                    }
                }
            }
        }
        System.out.println(palavra);
    }
}
