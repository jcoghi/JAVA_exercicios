import java.util.Scanner;

public class recursivo {
    public static void main(String[] args) {
        String texto = conversor(5);
        System.out.println(texto);
        texto = "5e";
        System.out.println(conversor(texto));

    }

 public static String conversor(int numero) {
        String texto = Integer.toString(numero);
        return texto;
 }

    public static int conversor(String texto) {
        char letra = 97;
        for (int i = 0; i < 123; i++) {
            if (texto.contains(String.valueOf(letra))) {
                System.out.println("Erro de entrada");
                return Integer.MIN_VALUE;
            } else {
                int num = Integer.parseInt(texto);
                return num;
            }
        }
        return Integer.MAX_VALUE;
    }

}
