package aula0515.calculadoratrigonometrica;

public class Calculadora {

    private float angulo;

    public Calculadora(float angulo) {
        this.angulo = angulo;
    }

    public float radianos(float angulo) {
        return (float) Math.toRadians(angulo);
    }

    public void resultados(double radianos) {
        if (angulo == 90.0) {
            System.out.printf("Seno: %.2f\n", (float) Math.sin(radianos));
            System.out.printf("Cosseno: 0\n");
            System.out.printf("Tangente: 0\n");

        } else {
            System.out.printf("Seno: %.2f\n", (float) Math.sin(radianos));
            System.out.printf("Cosseno: %.2f\n", (float) Math.cos(radianos));
            System.out.printf("Tangente: %.2f\n", (float) Math.tan(radianos));
        }

    }
}
