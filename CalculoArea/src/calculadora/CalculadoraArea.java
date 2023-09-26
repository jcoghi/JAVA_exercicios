package calculadora;

public class CalculadoraArea {

    public void calcularArea(double lado) {
        System.out.println((double)Math.pow(lado, 2));
    }
    
    public void calcularArea(double base, double altura) {
        System.out.println(base * altura);
    }
    
    public void calcularArea(double baseMaior, double baseMenor, double altura) {
        System.out.println((baseMaior + baseMenor)/2 * altura);
    }
    
    public void calcularArea(float diagonalMaior, float diagonalMenor) {
        System.out.println((diagonalMaior + diagonalMenor) / 2);
    }
}
