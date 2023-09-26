package aula0324;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int idade;
        double hemoglobina;
               
        System.out.println("Informe a idade:");
        idade = tc.nextInt();
        System.out.println("Informe a hemoglobina:");
        hemoglobina = tc.nextDouble();
                
        if (idade >= 2 && idade <= 6) {
            if(hemoglobina >= 11.5 && hemoglobina <= 13.5) {
                System.out.println("Normal");
            } else if(hemoglobina < 11.5) {
                System.out.println("Procure um Pediatra");
            }else {
                System.out.println("Vai virar o homem de ferro!!!!");
            }
        }else if(idade > 6 && idade <= 12) {
            if(hemoglobina >= 11.5 && hemoglobina <=15.5) {
                System.out.println("Normal");
            } else {
                System.out.println("Vai pro médico rápido");
            }
        } else if(idade > 12 && idade < 120) {
            System.out.println("Informe o sexo biologico:[F] ou [M]");
            char sexo = tc.next().toUpperCase().charAt(0); //M F 
            
            switch (sexo) {
                case 'M':
                    if(hemoglobina >= 14 && hemoglobina <=18) {
                        System.out.println("Normal");
                    } else {
                        System.out.println("R.I.P.");
                    }
                    break;
                case 'F':
                    char gestante;
                    System.out.println("Esta gestante? [s] ou [n]");
                    gestante = tc.next().toLowerCase().charAt(0);
                    switch (gestante) {
                        case 's':
                            if (hemoglobina > 11) {
                                System.out.println("Normal");
                            } else {
                                System.out.println("Vai para o(a) Ginecologista");
                            }
                            break;
                        case 'n':  
                            if(hemoglobina >= 12 && hemoglobina <=16) {
                                System.out.println("normal");
                            } else {
                                System.out.println("Estamos com problema, vai no medico");
                            }
                            break;
                        default:
                            System.out.println("Opcao invalida para gestante");
                    }
                    break;
                default: // ERRO
                    System.out.println("Informou o sexo biologico errado");;
            }       
        } else {
            System.out.println("Voce tentou fazer o teste em um vampiro");
        }   
        tc.close();
    } 
}
