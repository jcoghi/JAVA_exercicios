package aula0331;
/*de 1 a 100*/
public class Exemplo03 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
