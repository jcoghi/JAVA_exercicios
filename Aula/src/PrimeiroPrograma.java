import java.util.Scanner;

public class PrimeiroPrograma {

    public static String cortaString(String username){
        String[] nome = username.split(" ", 3);
        return nome[0];
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String username;

        System.out.println("Nome: ");
        username = teclado.nextLine();


        System.out.println(cortaString(username));
    }
}
