package aula0428;

public class Exemplo05 {

    public static void main(String[] args) {
        System.out.println(soma(3));
    }
    
    public static int soma(int numero){
        
        if(numero == 1) {
            return 1;
        }
        return numero + soma(numero - 1);
    }

}
