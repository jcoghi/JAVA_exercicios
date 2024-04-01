package listaExercicios;

import java.util.Scanner;
import java.util.Arrays;
public class Ex01 {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner tc = new Scanner(System.in);
        String []vetor = new String[5];
        String entrada;
        int x1, x2, y1, y2;
        double d;
        
        System.out.println("Digite X,Y para o primeiro ponto");
        entrada = tc.next();
        vetor = entrada.split(",");
        x1 = Integer.parseInt(vetor[0]);
        y1 = Integer.parseInt(vetor[1]);
        
        System.out.println("Digite X,Y para o segundo ponto");
        entrada = tc.next();
        vetor = entrada.split(",");
        x2 = Integer.parseInt(vetor[0]);
        y2 = Integer.parseInt(vetor[1]);
        
        System.out.printf("Calculando distância entre os pontos %d,%d e %d,%d\n",
                x1, y1,x2,y2);
        Thread.sleep(2000);
        
        d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("d = %.2f\n",d);
        
    }

}
