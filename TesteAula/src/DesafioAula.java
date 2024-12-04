import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class DesafioAula {
    public static void main(String[] args) {

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizC = new int[2][2];
        Random fabiano = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizA[i][j] = fabiano.nextInt(1, 10);
                matrizB[i][j] = fabiano.nextInt(1, 10);
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
    }
}