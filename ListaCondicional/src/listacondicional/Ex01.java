package listacondicional;

public class Ex01 {

    public static void main(String[] args) {
        /*VERIFICAR SE AS EXPRESSÕES ABAIXO SÃO VERDADEIRO OU FALSO:
        SALARIO = 100; IR = 0 E SALLIQ = 100: SALLIQ >= 100
        SALARIO = 200; IR = 10 E SALLIQ = 19: SALLIQ < 190
        SALARIO = 300; IR = 15 E SALLIQ = 285: SALLI = SALARIO + IR
         */

        float salario = 100f;
        float ir = 0f;
        float salliq = 100f;
        System.out.println("salliq >= 100: " + (salliq >= 100));

        salario = 200f;
        ir = 10f;
        salliq = 190f;
        System.out.println("salliq < 190: " + (salliq < 190));

        salario = 300f;
        ir = 15f;
        salliq = 285f;
        System.out.println("salliq = salario + ir: " + (salliq == salario + ir));

    }

}
