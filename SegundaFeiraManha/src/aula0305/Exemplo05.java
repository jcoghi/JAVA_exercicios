package aula0305;

public class Exemplo05 {
    public static void main(String[] args) {
        
        int velKmh;
        double velMs;
        velKmh = 120;
        velMs = (double)velKmh / 3.6;
        System.out.println(velKmh + "km/h = " + (float)velMs + "m/s");
        System.out.printf("%d km/h = %.2f m/s \n",velKmh,velMs);
    }
}
