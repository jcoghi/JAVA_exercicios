package aula0425;

public class Exemplo03 {
    public static void main(String[] args) {
        System.out.println(fatorial(3));
    }
    
    public static int fatorial (int numero) {
        if(numero == 0) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }
    
}
