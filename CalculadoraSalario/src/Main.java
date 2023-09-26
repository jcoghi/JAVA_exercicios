/*
carga tributária
INSS:
0 -> 1302: 7,5%
1302,01 -> 2571,29: 9%

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        var tc = new Scanner(System.in);
        double horas, horaAula, salarioBase,salarioLiquido,salarioBruto;
        double ir, inss, fgts, dsr, atividade;
        
        System.out.println("Informe valor hora-aula:");
        horaAula = tc.nextDouble();
        
        System.out.println("Horas mensais:");
        horas = tc.nextDouble();
        
        dsr = (horas * horaAula) / 6;
        salarioBase = horas * horaAula;
        atividade = 5 * horaAula;
        
        if (salarioBase > 0 && salarioBase <= 1302) {
            inss = salarioBase;
        }
        
        System.out.printf("Vencimento horista: %.2f \n", salarioBase);
        System.out.printf("Vencimento DRS: %.2f \n", dsr);
        System.out.printf("Vencimento atividade: %.2f \n", atividade);
        tc.close();
    }
    
}
