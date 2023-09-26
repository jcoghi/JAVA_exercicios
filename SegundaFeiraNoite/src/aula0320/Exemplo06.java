package aula0320;

public class Exemplo06 {
    public static void main(String[] args) {
        
        for (int i = 10; i > 0; i -= 2) { // i = i - 2
            
            if (i < 4) {
                break;
            } else {
                System.out.println(i);
            }
        } 
    }
    
}
