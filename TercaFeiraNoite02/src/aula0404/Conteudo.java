package aula0404;

public class Conteudo {

    public static void main(String[] args) {
        
        int i = 1;
        
        switch (i){
            case 0 -> {
                System.out.println("Entrei aqui");
            }
            default -> {
                System.out.println("Estou no default");
            }
        }
    }
}
