package listacondicional;

import java.util.Scanner;

public class ExSete {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        String sexo;
        int verificaGravidez;
        boolean gravida = false;
        int idade;
        double hemoglobina;

        // Entrada 
        System.out.print("Nome: ");
        nome = teclado.next();
        System.out.print("Sexo [M/F]: ");
        sexo = teclado.next().toLowerCase();

        // 1ª condição é M ou F?
        if (sexo.equals("f")) {
            System.out.print(" 1 - gravida\n 2 - nao gravida\n Digite: ");
            verificaGravidez = teclado.nextInt();
            // Condição de gravidez
            if (verificaGravidez == 1) {
                gravida = true;
            } else {
                gravida = false;
            }
        }

        System.out.print("Idade: ");
        idade = teclado.nextInt();
        System.out.print("Quantidade de Hemoglobina: ");
        hemoglobina = teclado.nextDouble();

        if (idade >= 2 && idade <= 6) {
            if (hemoglobina >= 11.5 && hemoglobina <= 13.5) {
                System.out.println("Ta normal");
            } else {
                System.out.println("Deu ruim! para crianças com " +
                        idade + " anos." );
                System.out.println("Procure um medico");
            }
        }
        
        else if ( idade > 6 && idade <= 12){
            if (hemoglobina >= 11.5 && hemoglobina <= 15.5) {
                System.out.println("Ta tranquilo, ta favoravel");
            } else {
                System.out.println("Deu ruim! para xovens com " +
                        idade + " anos." );
                System.out.println("Procure um medico");
            }
        }
        
        else {
            if (sexo.equals("m")) {
                if (hemoglobina >= 14 && hemoglobina <= 18) {
                    System.out.println("Ta tudo bem");
                } else {
                    System.out.println("Vai tomar ferro!!");
                }
            } 
            
            else if (sexo.equals("f") && !gravida) {
                if (hemoglobina >= 12 && hemoglobina <= 16) {
                    System.out.println("Parabens, pode engravidar!!");
                } else {
                    System.out.println("Onnipurum no braco!");
                }
            }
            
            else {
                if (hemoglobina >= 11) {
                    System.out.println("Boa gestacao, que o " +
                            " nenem venha saudavel");
                } else  {
                    System.out.println("Vai pro medico");
                }
            }
        }     
        
        teclado.close();
    }
}
