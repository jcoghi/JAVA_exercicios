package aula0425;

public class Exemplo02 {
    
    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(2,3));
        System.out.println(area(2,4,3));
    }
    
    public static int area(int lado) {
        return lado * lado;
    }
    
    public static int area(int base, int altura) {
        return base * altura;
    }
    
    public static int area(int baseMaior, int baseMenor, int altura) {
        return (baseMaior + baseMenor) / 2 * altura;
    }
    
}
