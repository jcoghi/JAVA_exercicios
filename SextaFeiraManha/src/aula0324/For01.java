package aula0324;

public class For01 {
    public static void main(String[] args){
         
        for (int i = 0; i <= 100; i +=2) {
            
            if (i > 50) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
    
}
