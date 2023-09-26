/*
    PRINTAR NA TELA 5 NÚMEROS ALEATÓRIOS COM 2 CASAS DECIMAIS.
*/















package listarevisao;

public class Ex04 {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.print("Numero " + i + ": ");
            System.out.printf("%.2f\n", Math.random());
        }
    }
}
