package aula0428;

public class Exemplo03 {

    public static void main(String[] args) {
        System.out.println(soma(15));
    }
    
    public static int soma(int numero) {
        
        int ter = (numero == 1)? 1: numero + soma(numero - 1);
        return ter;
    }

}
