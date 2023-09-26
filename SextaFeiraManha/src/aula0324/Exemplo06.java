package aula0324;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe seu tipo sanguineo:");
        String bloodType = tc.next().toUpperCase();
        
        switch (bloodType) {
            case "A+" -> {
                System.out.println("Pode doar para: AB+ e A+");
                System.out.println("Pode receber de: A+, A-, O+ e O-");
            }
            case "A-" -> {
                System.out.println("Pode doar para: A+, A-, AB+, AB-");
                System.out.println("Pode receber de: A- e O-");
            }
            case "B+" -> {
                System.out.println("Pode doar para: B+ e AB+");
                System.out.println("Pode receber de: B+, B-, O+ e O-");
            }
            default -> {
                System.out.println("Tipo saguineo nao existe.");;
            }
        }
        
        tc.close();
    }
}
