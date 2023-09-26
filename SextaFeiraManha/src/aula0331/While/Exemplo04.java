package aula0331.While;

public class Exemplo04 {

    public static void main(String[] args) {
        
        boolean continua = true;
        int contador = 1;
        
        do {
            if (contador > 10) {
                continua = false;
            } else {
                System.out.println("Contador = " + contador);
                contador++;
            }
        } while(continua);
    }
}
