import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantos elementos deseja?");
        try{
            int elementos = tc.nextInt();
            int soma = 0;

            for (int i = 0; i < elementos; i++ ) {
                System.out.printf("%d ", fibo(i));
                soma += fibo(i);
            }

            System.out.println("\nElemento: " + fibo(elementos - 1));
            System.out.println("Soma " +soma);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int fibo(int n) {
        if(n <= 0) {
            return 0;
        } if(n == 1) {
            return  1;
        }if (n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
