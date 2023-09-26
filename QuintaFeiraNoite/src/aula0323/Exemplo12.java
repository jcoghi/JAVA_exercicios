package aula0323;

import java.util.Scanner;

public class Exemplo12 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int idade;
        char sexo, gestante;
        double hemoglobina;
        
        System.out.println("Idade?");
        idade = tc.nextInt();
        System.out.println("Hemoglobina?");
        hemoglobina = tc.nextDouble();
        
        
        if (idade >= 2 && idade <= 6) {
            if(hemoglobina >= 11.5 && hemoglobina <= 13.5) {
                System.out.println("Normal");
            }else {
                System.out.println("Temos problemas... Consultar médico");
            }
        } else if (idade > 6 && idade <= 12) {
            if(hemoglobina >= 11.5 && hemoglobina <= 15.5) {
                System.out.println("Normal");
            }else {
                System.out.println("Temos problemas... Consultar médico");
            }
        }else if (idade > 12 && idade < 120) {
            System.out.println("Sexo?");
        sexo = tc.next().toUpperCase().charAt(0);
            switch (sexo) {
                case 'M':
                    if (hemoglobina >= 14 && hemoglobina <= 18) {
                        System.out.println("Passou no teste");
                    }else {
                        System.out.println("Vai comprar um caixão");
                    }
                    break;
                case 'F':
                    System.out.println("Gestante? [S]im ou [N]ao");
                    gestante = tc.next().toUpperCase().charAt(0);
                    if(gestante == 'S') {
                        if (hemoglobina >= 11) {
                            System.out.println("Normal");
                        } else{
                            System.out.println("Procure sua Ginecologista");
                        }
                    } else if (gestante == 'N') {
                        if (hemoglobina >= 12 && hemoglobina <= 16) {
                            System.out.println("Normal");
                        } else {
                            System.out.println("Comer mais feijao, espinafre, folhas escuras");
                            System.out.println("Depois tomar suco de limao, abacaxi");
                        }
                    } else {
                        System.out.println("Opcao invalida para gestante");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida para sexo biologico");;
            }
        }
        
        tc.close();
    }
    
}
