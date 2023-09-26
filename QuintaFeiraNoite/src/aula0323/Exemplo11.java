package aula0323;

import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        String bloodType;
        
        System.out.println("Insira o tipo sanguineo:");
        bloodType = tc.next().toUpperCase();
        
        switch (bloodType) {
            case "A+":
                System.out.println("Pode doar para: AB+ e A+");
                System.out.println("Pode receber de: A+, A-, O+ e O-");
                break;
            case "A-":
                System.out.println("Pode doar para: A+, A-, AB+ e AB-");
                System.out.println("Pode receber de: A- e O-");
                break;
            case "B+":
                System.out.println("Pode doar para: B+ e AB+");
                System.out.println("Pode receber de: B+, B-, O+ e O-");
                break;
            case "B-":
                System.out.println("Pode doar para: B+, B-, AB+ e AB-");
                System.out.println("Pode receber de: B- e O-");
                break;
            default:
                System.out.println("Opcao invalida");;
        }
        
        tc.close();
    }
    
}
