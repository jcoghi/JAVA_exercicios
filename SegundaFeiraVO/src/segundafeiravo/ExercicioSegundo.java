package segundafeiravo;

import java.util.Scanner;

public class ExercicioSegundo {
       
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String entrada;
            float salario = 0f;
            
            for (int i = 0; i <= 2; i++ ){
            System.out.print("Digite o salário: ");
            entrada = teclado.next();
            System.out.println("");
            
            
            entrada = entrada.contains(",") ? entrada.replace(",", ".") : entrada.replace(".", ".");
            
            
            if (entrada.contains(",")){
                entrada = entrada.replace(",", ".");
                    }
            
            salario += Float.parseFloat(entrada);
            }
            System.out.printf("A soma dos salários é %.2f reais \n", salario);
    }
}
