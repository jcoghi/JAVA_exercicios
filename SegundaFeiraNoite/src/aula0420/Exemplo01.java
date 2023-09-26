package aula0420;

public class Exemplo01 {

    public static void main(String[] args) {
        
        int num = fatorial(5);
        System.out.println("Fatorial = " + num);  
    }
    
    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * fatorial(numero -1);
        }
    }
}
