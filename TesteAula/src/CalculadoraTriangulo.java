public class CalculadoraTriangulo {
//
//import java.util.Scanner;
//import java.lang.Math;
//
//    public class ClassificacaoTriangulo {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Digite a primeira medida:");
//            double medida1 = input.nextDouble();
//
//            System.out.println("Digite a segunda medida:");
//            double medida2 = input.nextDouble();
//
//            System.out.println("Digite a terceira medida:");
//            double medida3 = input.nextDouble();
//
//            if (medida1 + medida2 > medida3 && medida1 + medida3 > medida2 && medida2 + medida3 > medida1) {
//                System.out.println("As medidas formam um triângulo.");
//
//                double angulo1 = Math.toDegrees(Math.acos((medida2 * medida2 + medida3 * medida3 - medida1 * medida1) / (2 * medida2 * medida3)));
//                double angulo2 = Math.toDegrees(Math.acos((medida1 * medida1 + medida3 * medida3 - medida2 * medida2) / (2 * medida1 * medida3)));
//                double angulo3 = Math.toDegrees(Math.acos((medida1 * medida1 + medida2 * medida2 - medida3 * medida3) / (2 * medida1 * medida2)));
//
//                System.out.println("Ângulos:");
//                System.out.println("Ângulo 1: " + angulo1);
//                System.out.println("Ângulo 2: " + angulo2);
//                System.out.println("Ângulo 3: " + angulo3);
//
//                if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
//                    System.out.println("O triângulo é retângulo.");
//                } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
//                    System.out.println("O triângulo é obtusângulo.");
//                } else {
//                    System.out.println("O triângulo é acutângulo.");
//                }
//
//                double seno1 = Math.sin(Math.toRadians(angulo1));
//                double seno2 = Math.sin(Math.toRadians(angulo2));
//                double seno3 = Math.sin(Math.toRadians(angulo3));
//
//                double cosseno1 = Math.cos(Math.toRadians(angulo1));
//                double cosseno2 = Math.cos(Math.toRadians(angulo2));
//                double cosseno3 = Math.cos(Math.toRadians(angulo3));
//
//                System.out.println("Seno:");
//                System.out.println("Seno do ângulo 1: " + seno1);
//                System.out.println("Seno do ângulo 2: " + seno2);
//                System.out.println("Seno do ângulo 3: " + seno3);
//
//                System.out.println("Cosseno:");
//                System.out.println("Cosseno do ângulo 1: " + cosseno1);
//                System.out.println("Cosseno do ângulo 2: " + cosseno2);
//                System.out.println("Cosseno do ângulo 3: " + cosseno3);
//            } else {
//                System.out.println("As medidas não formam um triângulo.");
//            }
//        }
//    }

}
