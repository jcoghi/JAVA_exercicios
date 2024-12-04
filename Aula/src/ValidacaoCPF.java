import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ValidacaoCPF {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String[] auxiliar = new String[8];
        System.out.println("CPF: ");
        String cpfString = tc.nextLine().trim();
//        double cpf;
//        if (cpfString.length() != 11) {
//            System.out.println("Digite apenas os 11 dígitos do CPF");
//        } else {
            auxiliar = cpfString.split("-",4);
//        }
        System.out.println(Arrays.toString(auxiliar));

        String[] auxiliar2 = auxiliar[0].split(".",9);
        System.out.println(Arrays.toString(auxiliar2));
        String auxiliar3 = auxiliar2[8];
        System.out.println(auxiliar3);





        tc.close();
    }
}
