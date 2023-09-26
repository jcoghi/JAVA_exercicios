package listacondicional;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        /*TENDO COMO DADOS DE ENTRADA A ALTURA E O SEXO DE UMA PESSOA, CONSTRUA
        UM PROGRAMA QUE CALCULA O PESO IDEAL
        MASCULINO: PESO IDEAL = 72.7 * ALTURA - 58
        FEMININO: PESO IDEAL = 62.1 * ALTURA - 44.7
        */
        Scanner teclado =new Scanner(System.in);
        String sexo;
        float altura;
        
        System.out.println("Insira \"M\" para Masculino ou \"F\" para feminino");
        sexo = teclado.next().trim();
        
        System.out.print("Informe sua altura em metros: ");
        altura = teclado.nextFloat();
        
        if (sexo.charAt(0)== 'm' || sexo.charAt(0)== 'M'){
            float pesoIdeal = 72.1f * altura - 58f;
            System.out.printf("%.2f kg para homens.\n", pesoIdeal);
        }else if (sexo.charAt(0)== 'f' || sexo.charAt(0)== 'F'){
            float pesoIdeal = 62.1f * altura - 44.7f;
            System.out.printf("%.2f kg para mulheres.\n", pesoIdeal);
        }
       
        teclado.close();
    }
}
