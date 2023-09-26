package aula0320;

public class Exemplo08 {
    public static void main(String[] args) {
        boolean vivo = true;
        
        String status = (vivo==true)?"vivo":"morto";
        System.out.println("Status = " + status);
        
        if (!vivo) { // vivo = FALSE => (NÃO)!vivo = TRUE
            System.out.println("Morreu");
        } else {
            System.out.println("Ainda vivo");
        }
    }
}
