package aula0418;

public class Exemplo02 {

    public static void main(String[] args) {
        
        System.out.println(area(2));
        System.out.println(area(2, 5));
        
    }
    
    public static void mensagem() {
        System.out.println("Ola");
    }
    
    public static int conversor(String texto) {
        int num = Integer.parseInt(texto);
        return num;
    }
    
    public static String conversor(int numero) {
        String texto = Integer.toString(numero);
        return texto;
    }
    public static int area(int lado) {
        return lado * lado;
    }
    public static int area(int base, int altura ) {
        return base * altura;
    }
    

}
