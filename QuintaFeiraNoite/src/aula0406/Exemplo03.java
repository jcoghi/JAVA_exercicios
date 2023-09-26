package aula0406;

import java.util.Arrays;
import java.util.Random;

public class Exemplo03 {

    public static void main(String[] args) {

        Random ale = new Random();
        int a[] = new int[8];
        double b[] = new double[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = ale.nextInt(11);
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = Math.sqrt(a[i]);
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
