
package segundafeiravo;

import java.util.Scanner;

public class SegundaFeiraVO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int num1 = teclado.nextInt();
        
        switch(num1) {
            case 1:
                System.out.println("Digiete o valor do Saque");
                break;
            case 2:
                System.out.println("Digite o valor do depósito");
                break;
            case 3:
                System.out.println("é Pix, é pix é pix");
                break;
            default:
                System.out.println("Saindo....");
                
                
        }
  
    }
    
}
