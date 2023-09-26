package aula0323;

public class Exemplo03 {
    public static void main(String[] args) {
        
        int a = 5, b = 4, c = 3, d = 6;
        
        System.out.println("a > c E c <= d: " + (a > c && c <= d));
        System.out.println("a + b > 10 OU a + b = c + d: " + 
                (a + b > 10 || a + b == c + d));
        System.out.println("a >= c E d >= c: " + (a >= c && d >= c));
    }    
}
