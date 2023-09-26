package aula0324;

public class Exemplo02 {
    public static void main(String[] args) {
        
        String vida;
        boolean vivo = false;
        
        vida = (vivo)?"Sim, estou vivo com ternario":"Morri com ternario";
        System.out.println(vida);
        
        if (vivo) {
            System.out.println("Sim, estou vivo");
        } else {
            System.out.println("Morri");
        }
    }    
}
