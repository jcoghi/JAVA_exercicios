
public class 2
{
    public static void main(String[] args) {
        int vetor[] = { 2, 3, 4, 5, 6, 7, 8, 1 };

        int matriz1[][] = new int[2][2];

        int matriz2[][] = new int[2][2];

        System.out.println("Primeira Matriz");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                for (int i = 0; i < 4; i++) {
                    matriz1[0][0] = vetor[0];
                    matriz1[0][1] = vetor[1];
                    matriz1[1][0] = vetor[2];
                    matriz1[1][1] = vetor[3];
                }
                System.out.println("Linha: " + (linha + 1) +
                        " Coluna: " + (coluna + 1) + ": "
                        + matriz1[linha][coluna]);
            }
        }

        System.out.println("Segunda Matriz");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                for (int i = 0; i < 4; i++) {
                    matriz2[0][0] = vetor[4];
                    matriz2[0][1] = vetor[5];
                    matriz2[1][0] = vetor[6];
                    matriz2[1][1] = vetor[7];
                }
                System.out.println("Linha: " + (linha + 1) +
                        " Coluna: " + (coluna + 1) + ": "
                        + matriz2[linha][coluna]);
            }
        }

        int resultado1, resultado2;

        resultado1 = (matriz1[0][0] * matriz1[1][1]) - (matriz1[1][0] * matriz1[0][1]);
        resultado2 = (matriz2[0][0] * matriz2[1][1]) - (matriz2[1][0] * matriz2[0][1]);

        System.out.println("Determinante: " + (resultado1 + resultado2));
    }
}
