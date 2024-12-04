import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {

        System.out.println(cesar());
    }

    public static String entrada(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Nome: ");
        String texto = tc.nextLine();
        return texto;
    }
    
    public static String cesar() {
        String texto = entrada().toLowerCase();
        int num;
        String novotexto = "";

        for (int i = 0; i < texto.length(); i++) {
            char aux = texto.charAt(i);

            if (aux != ' ') {
                num = (int)aux + 3;
                if (num > 122) {
                    num = num - 26;
                }
                novotexto += String.valueOf((char)num);
            } else {
                novotexto += String.valueOf(aux);
            }
        }

        return novotexto;
    }
}
